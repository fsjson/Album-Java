package excaptionHandling;

import java.util.Scanner;

public class Pembagian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan bilangan pertama: ");
            int a = scanner.nextInt();

            System.out.print("Masukkan bilangan kedua: ");
            int b = scanner.nextInt();

            int hasil = a / b;
            System.out.println("Hasil pembagian: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            System.out.println("Program selesai dieksekusi.");
        }

        scanner.close();
    }
}
