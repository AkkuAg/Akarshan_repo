package com.sapient.util;
import java.util.Scanner;

public class MyMathTest {
    public static void main(String[] args )
    {
    	@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input: ");
        int n = scanner.nextInt();
        System.out.println("The outputs are as follows: ");
        System.out.println("Is it Prime: "+MyMath.isPrime(n));
        System.out.println("Is it perfect number: "+MyMath.isPerfectNumber(n));
        System.out.println("Factorial : "+MyMath.factorial(n));
        System.out.println("Is Armstrong Number: "+MyMath.isArmstrongNumber(n));
        System.out.println("Number Reversed: "+MyMath.reverseNumber(n));
        System.out.println("Decimal to binary: "+MyMath.decimalToBinary(n));
        System.out.println("Binary to decimal: "+MyMath.binaryToDecimal(n));
        System.out.println("Fibonacci Number: "+MyMath.getSumOfNfibos(n));
        System.out.println("Is it Palindrome: "+MyMath.isPalindromeNumber(n));
    }
}