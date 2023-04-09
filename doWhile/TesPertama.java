package doWhile;

class TesPertama {
    public static void main(String[] args) {
        // lakukan sistem.out 1 - 5
        // pake do-while
        

        // inisiasi variable
        int i = 1; // awalan index
        int n = 5; // akhir index

        do{
            System.out.print(i); // cetak saya, variable 'i' sebanyak while(i<=n)--> n(5) yaitu 5 kali. 
            i++; // dan jika 'i <= n' maka nilai akan bertambah satu. contoh: 1 + 1 = 2 + 1 = 3, ... n

        } while( i <= n); // kondisi yang harus dipenuhi.

        System.out.println("\n");

    }
}
