public class HowManyWords {
    public static void main(String[] args) {
        System.out.println("Hello World");
        String str = "he is a good programmer , he won 865 competations, but sometimes he dont. what do you think? all test-cases should pass. Done-done";
        int n = str.length();
        String[] chararray = new String[n]; // String array to hold words
        int index = 0;
        String s = "";

        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c) || c == '-') {
                s += c; 
            } else if (c == ' ' || i == n - 1) {
                if (!s.isEmpty() && !Character.isDigit(s.charAt(0))) { // Check if s is not empty and does not start with a digit
                    //chararray[index] = s.trim(); // Trim to remove extra spaces
                    index++;
                }
                s = ""; // Reset the string s for the next word
            }
        }

        // Check for the last word in case the string doesn't end with a space
        if (!s.isEmpty() && !Character.isDigit(s.charAt(0))) {
            //chararray[index] = s.trim(); // Trim to remove extra spaces
            index++;
        }

        // Output the number of words stored in the array
        System.out.println(index); // This should print 21
    }
}
