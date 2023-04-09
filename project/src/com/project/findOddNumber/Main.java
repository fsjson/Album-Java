package com.project.findOddNumber;

import java.util.Scanner;

public class Main{
	
	private static int findOOD(int n){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Masukan angka[Bebas]: ");
		n = scan.nextInt();

		if(n < 0) {
			System.out.println("Negative Numbers");
		} else if(n%2 != 0) {
			System.out.println("Ganjil/OOD");
		} else {
			System.out.println("Genap/Even");
		} 
		return n;
	
	}

	public static void main(String[] args){
		// Meng-Inisiasi Variable, 
		// agar method bisa dipanggil. 
		int input = 1;

		// Pemanggilan Method
		findOOD(input);

	}
}