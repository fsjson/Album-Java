package excaptionHandling;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // try {
	    // kode yang mungkin menghasilkan pengecualian

	    //	} catch (ExceptionType e) {
	    // menangani pengecualian yang dihasilkan

	    //	} finally {
	    // kode yang harus dijalankan setelah blok try dan catch
	    //	}




        // contoh studi kasus
/*
 bayangkan sebuah program Java yang bertugas untuk membaca dan memproses data dari sebuah file eksternal. File tersebut
 berisi data mahasiswa, dan program bertugas untuk melakukan operasi matematika sederhana pada data tersebut, seperti 
 menghitung rata-rata nilai, nilai tertinggi, dan nilai terendah.

 Namun, terkadang file tersebut mungkin tidak dapat ditemukan atau formatnya tidak sesuai dengan yang diharapkan, 
 yang dapat menyebabkan program menghasilkan pengecualian. Dalam hal ini, kita dapat menggunakan mekanisme exception 
 handling untuk menangani kesalahan atau kondisi yang tidak diharapkan dan memastikan program tetap berjalan dengan baik.
 */


        File file = new File("data-mahasiswa.txt");

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(",");

                // Proses data mahasiswa di sini
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan dalam membaca file: " + e.getMessage());
        } finally {
            System.out.println("Program selesai dieksekusi.");
        
        }
    
    }
}
