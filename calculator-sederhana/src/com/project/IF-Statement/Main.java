import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner inputUser;
		double angkaPertama, angkaKedua;
		char operasi;
		double hasil;

		System.out.println("Program Kalkulator Basic");
		System.out.println("-------------------------");

		inputUser = new Scanner(System.in);

		System.out.print("Masukan Angka angkaPertama			: ");
		angkaPertama = inputUser.nextDouble();

		System.out.print("Pilihlan Operator(+, -, x, /, %)--->	: ");
		operasi = inputUser.next().charAt(0);

		System.out.print("Masukan Angka angkaKedua				: ");
		angkaKedua = inputUser.nextDouble();

		System.out.printf("\nUser = %1$.1f %2$c %3$.1f\n",angkaPertama,operasi,angkaKedua);


		if (operasi == '+'){
			hasil = angkaPertama + angkaKedua;
			System.out.printf("%.1f\n",hasil);
		} else if (operasi == '-') {
			hasil = angkaPertama + angkaKedua;
			System.out.printf("%.1f\n",hasil);
		} else if (operasi == 'x') {
			hasil = angkaPertama  * angkaKedua;
			System.out.printf("%.1f\n",hasil);
		} else if (operasi == '/') {
			if (angkaKedua == 0) {
				System.out.println("Pembagian Nol, Menghsilkan Tak Terhingga");
			} else {
				hasil = angkaPertama / angkaKedua;
				System.out.println(hasil);
			}
		} else if (operasi == '%') {
			hasil = angkaPertama % angkaKedua;
			System.out.println(hasil);
		} else {
			System.out.println("Ohh.. Sayang sekali operator tidak ditemukan");
		}

	}
}