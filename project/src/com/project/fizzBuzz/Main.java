package com.project.fizzBuzz;

public class Main {
    public static void main(String[] args){
        for(int n = 1; n <= 100; n ++) {
            if(n % 3 == 0) {
                System.out.println("Fizz");
            
            } else if(n % 5 == 0) {
                System.out.println("Buzz");
            
            } else if(n % 15 == 0) {
                System.out.println("FizzBuzz");
            
            } else {
                System.out.printf("\n%d\n",n);
            
            }

            System.out.println("\n");

        }
    }
}
