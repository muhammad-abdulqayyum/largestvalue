package largestvalue;
 import java.util.Scanner;
/**
 *
 * @author ABDULQM
 */
public class LargestValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Enter your first number");
	Scanner in = new Scanner(System.in);
	int Number1 = in.nextInt();
	System.out.println("Your first number is " + Number1 + ". Enter your second number");
	int Number2 = in.nextInt ();
	System.out.println("Your second number is " + Number2 + ".");
	
        if (Number1 > Number2){
	System.out.println("The largest value entered is " + Number1 + ".");
	}
        else { 
	System.out.println("The largest value entered is " + Number2 + ".");
        }
    }
}
