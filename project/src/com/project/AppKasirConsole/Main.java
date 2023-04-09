package com.project.AppKasirConsole;

import java.util.Scanner;

class Main{
    private static void menuKasir(){
        System.out.println("\t\t\n\n== Welcome to app \'Kasir\' ======================\n\n");

        System.out.println("============================================================================================================");
        System.out.println("Silahkan Pilih Menu album dibawah Ini: ");
        System.out.println("1. Album kesatu Rp 250.000,00 [Led Zeppelin I by Led Zeppelin]");
        System.out.println("2. Album kedua Rp 650.000,00 [Gegerowokan by Fachri(penulis sendiri wkwk)]");
        System.out.println("3. Album ketiga Rp 850.000,00 [We Are Not Your Kind by Slipknot]");
        System.out.println("4. Album keempat Rp 950.000,00 [Vakansi by White Shoes & The Couples Company]");
        System.out.println("5. Album kelima Rp 1.250.000,00 [sampul surat nonaria (sebuah persembahan untuk ismail marzuki by NonaRia]");
        System.out.println("============================================================================================================");

        System.out.println("\n== Tidak ingin bertransaksi? ==\n");
        System.out.println("6. Keluar");
        System.out.println("\n");

        System.out.print("Pilihan anda[apakah ingin belanja atau keluar?]: ");

    }

    public static double hitung(String album, double harga) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah pembelian " + album + ": ");
        int jumlah = input.nextInt();

        double total = jumlah * harga;
        total = total - (total * 0.10);
        System.out.println("\nTotal harga " + album + " sebanyak " + jumlah + " buah adalah: Rp " + total);
        return total;
    
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int pilihan = 0; // pilihan default-Nya adalah nol(0) .
        double total = 0;  // harga total default-Nya adalah nol(0) .

        while(true){
            menuKasir();
            pilihan = scan.nextInt();

            if (pilihan == 1) {
                total += hitung("Album 1", 250000);

            } else if (pilihan == 2) {
                total += hitung("Album 2", 650000);
            
            } else if (pilihan == 3) {
                total += hitung("Album 3", 850000);
            
            } else if (pilihan == 4) {
                total += hitung("Album 4", 950000);
            
            } else if (pilihan == 5) {
                total += hitung("Album 5", 1250000);
            
            } else if (pilihan == 6) {
                System.out.println("\nTotal harga yang harus dibayar: Rp " + total);
                // break;
            
            } else {
                System.out.println("******Pilihan anda tidak valid, SILAHKAN COBA LAGI NANTI!*********");
            }


            // Penyampaian Terimakasih sebagai Selamat tinggal
            System.out.println("\n\nTerimakasih Telah Berbelanja Di The Couples Company Store, silahkan datang lagi.");
        
        }
    }

}