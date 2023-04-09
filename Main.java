// Define a class
public class Main {

	// Define instance variables
	private int number;
	private String name;

	// Define accessor (getter) methods
	public int getNumber() { 
        return number; 
    }

	public String getName() { 
        return name; 
    }

	// Define mutator (setter) methods
	public void setNumber(int number)
	{
		this.number = number;
	}

	public void setName(String name) { 
        this.name = name; 
    }

	// Define other methods
	public void printDetails()
	{
		System.out.println("Number: " + number);
		System.out.println("Name: " + name);
	}


    // Main Method
    public static void main(String[] args) {
        // Use the methods in another part of the code
        Main Main = new Main();
        Main.setNumber(012);
        Main.setName("Modify by Fachri");
        Main.printDetails();
    
    }
}



