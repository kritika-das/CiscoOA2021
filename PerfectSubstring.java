class PerfectSubstring {
    public static void main(String[] args) {
        String s = "1102021222";
        int k = 2;  // The value of k (number of times each digit must appear)

        System.out.println(substringfind(s, k));
    }

    // Optimized method using sliding window approach to find valid substrings
    public static int substringfind(String s, int k) {
        int n = s.length();
        int count = 0;

        // Iterate over all possible starting points of the substring
        for (int i = 0; i < n; i++) {
            // Frequency array to store counts of '0', '1', and '2'
            int[] freq = new int[3];
            
            // Start expanding the window from the starting point 'i'
            for (int j = i; j < n; j++) {
                char c = s.charAt(j);

                // Only consider '0', '1', and '2'
                if (c == '0' || c == '1' || c == '2') {
                    freq[c - '0']++;  // Increment frequency for the current character
                }

                // Check if this window is a valid substring
                if (isPerfect(freq, k)) {
                    count++;  // Increment count if it's valid
                }
            }
        }

        return count;  // Return total count of valid substrings
    }

    // Method to check if a given frequency array matches the required condition
    public static boolean isPerfect(int[] freq, int k) {
        // Check if each digit '0', '1', and '2' appears either 0 or exactly 'k' times
        return (freq[0] == 0 || freq[0] == k) &&
               (freq[1] == 0 || freq[1] == k) &&
               (freq[2] == 0 || freq[2] == k);
    }
}
