package com.sapient.util;

public class MyMath {
    
    public static boolean isPerfectNumber(int n)
    {
        if(n<=0)
            return false;
        int sum = 0;
        for(int i=1; i<n; i++)
        {
            if(n%i==0)
                sum = sum+i;
        }
        if(sum == n)
            return true;
        else
            return false;
    }
    
    public static long factorial(int n)
    {
        int fact=1;
        for(int i=1; i<=n; i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    
    public static boolean isPrime(int n)
    {
        if(n==0 || n==1)
            return false;
        for(int i=2;i<n/2;i++) 
        {
            if (i%2==0) 
                return false;
        } 
            return true;
    }
    
    public static long sumOfPrimes(int n) {
        int primsum = 0;
        for(int i =2;i<n;i++) {
            if (isPrime(i)) 
            {
                primsum+=i;
            }
        }
        return primsum;
    }
    
    public static boolean isArmstrongNumber(int n) {
        int c=0,a,temp;    
        temp=n;  
        while(n>0)  
        {  
            a=n%10;  
            n=n/10;  
            c=c+(a*a*a);  
        }  
        if(temp==c) {  
            return true;
        }
        else {  
            return false;
        }   
    }
    
    public static int reverseNumber(int n) {
         int reversed = 0;
         while(n!= 0) {
             int digit = n % 10;
             reversed = reversed * 10 + digit;
             n/= 10;
        }
         return reversed;
     }
    
    public static int decimalToBinary(int n) {
        String bin = Integer.toBinaryString(n);
        return Integer.parseInt(bin);
    }
    
    public static int binaryToDecimal(int n) {
        return Integer.parseInt(Integer.toString(decimalToBinary(n)),2);    
    }
    
    public static int getSumOfNfibos(int n) {
         int n1=0,n2=1,n3,i;  
         int fibosum = 1;  
         for(i=2;i<n;++i){
             n3=n1+n2;
             fibosum+=n3;
             n1=n2;
             n2=n3;    
         }
         return fibosum;
    }
    
    public static boolean isPalindromeNumber(int n) {
        String in = Integer.toString(n);
        StringBuilder sb1 =new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb1.append(in);
        sb1.reverse();
        if (sb2.equals(sb1)) {return true;}
        else {return false;}
    }
    


}