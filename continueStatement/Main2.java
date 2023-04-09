package continueStatement;

import java.lang.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("\n\n");


        int[] i = {1,2,3,4,5,6,7,8,9,10};
        String numberStr = Arrays.toString(i);

        System.out.println("Data Asli: " + numberStr);

        System.out.println("\n\n");

        System.out.println("Setelah Diurutkan: ");
        for(int data: i) {
            System.out.println(data);
            ++data;
        }

        System.out.println("\n\n");

        System.out.println("Setelah dipotong(continue)");
        for(int x = 1; x < 10; ++x) {
            if(x > 5 && x < 9) {
                continue;
            }
            System.out.println(x);
        }
    }
    
}
