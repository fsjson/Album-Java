package continueStatement;

public class Main {
    public static void main(String[] args) {
        int[] dataAngka = {1,2,3,4,5,6,7,8,9};
        for(int number: dataAngka) {
            
            if(number <= 6)
                System.out.println("angka ke- " + number);
                number++;

                continue;


        }
    }
    
}
