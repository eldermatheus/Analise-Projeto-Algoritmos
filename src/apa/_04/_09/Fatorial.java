package apa._04._09;

public class Fatorial {

    public static void main(String[] args) {
        System.out.println(fatorialIt(5));
        System.out.println(fatorialRec(5));

    }
    
    public static long fatorialIt(int n) {
        long result = 1;
        for (int i = 1; i <= n; ++i) {
            result = result * i;
        }
        return result;
    }

    public static long fatorialRec(int n) {
        if (n <= 0) {
            return 1;
        } else {
            return n * fatorialRec(n - 1);
        }
        
    }
}
