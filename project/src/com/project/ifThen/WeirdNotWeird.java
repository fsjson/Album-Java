package com.project.ifThen;

import java.util.Scanner;

public class WeirdNotWeird{
	public static void main(String[] args){
		
		// jika n =  odd number maka print 'weird'
		// jika n = kisaran angka 2 - 5, print 'Not Weird'

		// jika n = kisaran angka 6 - 20, print 'Weird'
		// jika n > 20, print 'Not Weird'


		// Variable untuk input
		Scanner input = new Scanner(System.in);
		System.out.print("Masukan Angka[1-20]: ");
		int n = input.nextInt();

		// Logika: elif statement
		if(n % 2 != 0){
			System.out.println("Weird");
		} else if(n >= 2 && n <= 5) {
			System.out.println("Not Weird");			
		} else if(n >= 6 && n <= 20) {
			System.out.println("Weird");
		} else {
			System.out.println("Not Weird");
		}


	}
}