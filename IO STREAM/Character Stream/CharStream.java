
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.PrintWriter;

public class CharStream {
	public static void main(String[] args) throws IOException {

		// Print Console
		PrintConsole();



		// CopyCharacters

		FileReader inputStream = null;
		FileWriter outputStream = null;

		try {

			inputStream = new FileReader("in.txt");
			outputStream = new FileWriter("out.txt");

			int data;

			while ((data = inputStream.read()) != -1){
				outputStream.write(data);

				// Print data dgn mengkonversinya ke char
				// System.out.print( (char) data );
			
			}

		} finally {

				if (inputStream != null) {
					inputStream.close();
				}

				if (outputStream != null) {
					outputStream.close();
				}
			
			}

		// copyLines

		BufferedReader inputStream2 = null;
        PrintWriter outputStream2 = null;

        try {
            inputStream2 = new BufferedReader(new FileReader("charInput.txt"));
            outputStream2 = new PrintWriter(new FileWriter("charOutput.txt"));

            String l; // Noted: variable " l " can be read as --> lines
            while ((l = inputStream2.readLine()) != null) {
                outputStream2.println(l);
                outputStream2.println("GodDamn!!");

                // print
                // System.out.print(l+"\n");

            }

        } finally {
            if (inputStream2 != null) {
                inputStream2.close();
            }
            if (outputStream2 != null) {
                outputStream2.close();
            }
        } 
	
	}

	private static void PrintConsole() {
		System.out.println("Debbuging Berhasil");
	}


}
