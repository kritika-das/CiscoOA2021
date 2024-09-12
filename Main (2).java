public class Main {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        
        // Iterate through numbers from 1 to n
        for(int i = 1; i <= n; i++) {
            // Convert number to binary and check if both decimal and binary are palindromes
            String binaryStr = Integer.toBinaryString(i);
            if(isPalindrome(i) && isPalindromeString(binaryStr)) {
                sum += i;
            }
        }
        
        // Output the sum of all double palindromes
        System.out.println(sum);  // Expected result: 9
    }

    // Method to check if a number is a palindrome in decimal form
    public static boolean isPalindrome(int num) {
        int temp = num;
        int rev = 0;
        
        // Reverse the number
        while(temp != 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        
        // Check if the reversed number is equal to the original number
        return num == rev;
    }
    
    // Method to check if a binary string is a palindrome
    public static boolean isPalindromeString(String binaryStr) {
        int left = 0;
        int right = binaryStr.length() - 1;
        
        // Check if the string is the same forwards and backwards
        while(left < right) {
            if(binaryStr.charAt(left) != binaryStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
