import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\t\t===========================================");
        System.out.println("\t\t## Program java Kalkulator Sederhana ##");
        System.out.println("\t\t===========================================");

    
        // Mengambil Data / Pengambilan data (Oleh User)
        System.out.print("\n\n");
        double a, b;
        double result = 0;

        // input (data)
        int choice; // user Options

        System.out.print("\t\tAngka Pertama		: ");
        a = input.nextInt();

        System.out.println("\t\t-------------------------------------------");
        System.out.println("\t\t#### Silahkan Pilih Operator ####");
        System.out.println("\t\t---> ## 1. + (Penjumlahan) 	##");
        System.out.println("\t\t---> ## 2. - (Pengurangan) 	##");
        System.out.println("\t\t---> ## 3. x (Perkalian)  	##");
        System.out.println("\t\t---> ## 4. / (Pembagian)    	##");
        System.out.println("\t\t---> ## 5. % (Sisa Bagi)    	##");
        System.out.println("\t\t-------------------------------------------\n");

        System.out.print("\t\tMasukan Operator --> (1, 2, 3, 4, 5) : ");

        choice = input.nextInt();

        System.out.print("\t\tAngka Kedua        : ");
        b = input.nextInt();


        // Percabangannya
        switch (choice) {

            case 1:
                result = a + b;
                break; // +
            case 2:
                result = a - b;
                break; // -
            case 3:
                result = a * b;
                break; // *
            case 4:
                result = a / b;
                break; // / (bagi)
            case 5:
                result = a % b;
                break; // %
            default:
                System.out.println("\t\tHmm... sepertinya terjadi kesalahan dalam memasukan piihan, silahkan coba lagi.");
                return;

        }

        // Hasil
        System.out.println("\t\tHasil	        : " + result + "\n\n");

    }
}