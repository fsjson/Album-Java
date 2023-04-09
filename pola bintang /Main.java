import java.util.*;
public class Main{
	public static void main(String[] args){
		// segitiga
		int a;
		int b;


		System.out.println(" ");

		for(a=1;a<=10;a++){
			for(b=1; b<=10 ;b++){
				if(b==1 || a==10 || a==b){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.print("\n");
		}

		System.out.println("\n\n");

		// BUAT PROGRAM: Mencetak bilangan bulat genap
		// Ketentuan:
		// Gunakan STATEMENT SELEKSI DALAM PENGULANGAN
		//
		// VARIABLE "DARI" DAN "SAMPAI" DITENTUKAN OLEH INPUT USER
		
		Scanner inputUser = new Scanner(System.in);

		System.out.println("===Menampilkan Bilangan Genap, dari yang inputkan user===\n");

		System.out.print("Dari: ");
		int dari= inputUser.nextInt();
		System.out.print("Sampai: ");
		int sampai= inputUser.nextInt();

		int hasil;

		System.out.print("output: ");

		for(dari=1;dari<=sampai;dari++){
			if(sampai!=dari*2){
				hasil = dari*2;
				System.out.print(hasil + " ");
			}else if(dari!=sampai){
			//	System.out.print(hasil+ " " + sampai);
				System.out.print(sampai);
				break;
			}
		}
		System.out.println(" ");
		

	}
}
