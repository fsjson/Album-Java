package continueStatement;

import java.util.Scanner;

public class AddBilPositif {
    public static void main(String[] args){
        // cari / Tambah bilangan positif aja
        // jika ada bil negative tidak ditambah
        Scanner sc = new Scanner(System.in);

        int hitung = 0 ,dataAngka = 0;

        for(int i = 1; i <= 5; ++i) {
            System.out.print("Masukan Angka[integer]" + " [ " + i  + " ]: ");
            dataAngka = sc.nextInt();

            if(dataAngka <= 0) {
                continue;
            }

            hitung += dataAngka;

        }

        System.out.println("Hasil: " + hitung);
        sc.close();

    }
}
