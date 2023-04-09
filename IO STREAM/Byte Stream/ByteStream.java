
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStream {

	public static void main(String[] args) throws IOException {
		

		// try with resource

		try (
                FileInputStream in = new FileInputStream("input.txt");
                FileOutputStream out = new FileOutputStream("output.txt");
        ) {

            // Membaca file
            int data = in.read();

            while (data != -1) {
          
                out.write((char) data);
                data = in.read();

                // Menampilkan file di konsole
				// System.out.print((char) data);          
            }
        }

        // copy byte streams

        FileInputStream input = null;
        FileOutputStream output = null;

        try {
           
            input = new FileInputStream("name.txt");
            output = new FileOutputStream("name-replace.txt");
            int data2;

            while((data2 = input.read()) != -1) {
           
                output.write(data2);
                System.out.print((char) data2);
           
            }
        
        } finally {
          
            if (input != null)
                input.close();

            if (output != null)
                output.close();
        } 
	}
}