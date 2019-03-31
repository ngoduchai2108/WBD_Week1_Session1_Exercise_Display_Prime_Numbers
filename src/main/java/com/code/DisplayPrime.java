package com.code;

public class DisplayPrime {
    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            int i = 2;
            while (i <= Math.sqrt(n)) {
                if (n % i == 0) {
                    return false;
                }
                i++;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        StringBuilder primeNumbers = new StringBuilder(" ");
        for (int i = 2; i < 100; i++){
            if (isPrime(i)) primeNumbers.append(i).append("\t");
        }
        System.out.println("Prime Numbers NOT exceed 100 is: "+ primeNumbers);

    }
}
