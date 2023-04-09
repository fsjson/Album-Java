

public class Main {
    public static void main(String[] args) {
        // mencari jumlah bilangan ASLI dari 1 sampai 100

        // Memakai for loop

        // variable
        int sum = 0; // the default value is 0.
                    // harus dideklarasi dulu. agar bisa dimasukan dalam looping

        // loop
        for(int i = 1; i <= 100; ++i) {
            sum += i; // sum = sum + 1

        }

        System.out.println("Sum Natural Number: " + sum); // output = 5050
        // jadi, hasil perhitungan bilangan asli dari 1 - 100 = 5050

    }    
}
