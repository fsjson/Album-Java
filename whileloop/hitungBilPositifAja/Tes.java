package whileloop.hitungBilPositifAja;

import java.util.Scanner;

import javax.xml.validation.SchemaFactoryConfigurationError;

public class Tes {
    public static void main(String[] args){
        // Hitung Bilangan Positif aja
        // angka berupa dari user

        System.out.println("---------------------------------------------------------------");
        System.out.println("AKAN DITAMBAH JIKA NUMBER YANG DIMASUKAN USER BILANGAN POSITIF");
        System.out.println("---------------------------------------------------------------");

        // buat object dari class Scanner
        Scanner scan = new Scanner(System.in);
        
        // buat variable double user, untuk mengambil input dari user
        System.out.print("Masukan Angka: ");
        double user = scan.nextDouble();

        // variable Hitung
        double hitung = 0; // nilai defaultnya nol(0);

        // program while loop, akan dilanjutkan
        // jika nilai angka yang dimasukan user bilangan positif.
        while(user >= 0) {
            // akan ditambah, jika bilangan positif saja.
            hitung += user;

            System.out.print("Masukan Angka: ");
            user = scan.nextDouble();
        }

        System.out.println("Hasil pertambahan-nya: " + hitung);
        scan.close();

    }
    
}
