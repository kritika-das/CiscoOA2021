class CountingFractions {
    public static int countingFractions(int d) {
        int count = 0;
        for (int i = 1; i <= d; i++) { 
            for (int j = 1; j <= d; j++) {
                if (i < j && isHcf(i, j)) {  
                    count++;  
                }
            }
        }
        return count;
    }

    public static boolean isHcf(int n, int d) {
        int hcf = 1;
        for (int i = 1; i <= Math.min(n, d); i++) { 
            if (n % i == 0 && d % i == 0) { 
                hcf = i;
            }
        }
        return hcf == 1;
    }

    public static void main(String[] args) {
        int d = 8;
        int result = countingFractions(d);
        System.out.println("Number of proper fractions with denominator up to " + d + ": " + result);
    }
}
