import java.util.Arrays;

class EffecientJanitor { 
    public static int countingFractions(float arr[], float w) {
        int trips = 0;
        int left = 0;  // Pointer to the lightest item
        int right = arr.length - 1;  // Pointer to the heaviest item
        int n = arr.length;

        // Sort the array to try pairing the lightest and heaviest items
        Arrays.sort(arr);

        while (left <= right) {
            // If the lightest and heaviest item together are within the weight limit, pair them
            if (arr[left] + arr[right] <= w) {
                left++;  // Move the left pointer up (lightest item is used)
            }
            // In any case, the heaviest item will be used in a trip
            right--;  // Move the right pointer down (heaviest item is used)
            trips++;  // Count this as one trip
        }

        return trips;
    }

    public static void main(String[] args) {
        float arr[] = {1.01f, 1.99f, 2.5f, 1.5f, 1.01f};
        float w = 3.0f;
        int result = countingFractions(arr, w);
        System.out.println("Number of trips: " + result);  // Expected output: 3
    }
}
