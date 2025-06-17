
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String text = scan.nextLine();
        
        System.out.println("Give an integer:");
        int inputInteger = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        double inputDouble = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        boolean inputBoolean = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + inputInteger);
        System.out.println("You gave the double " + inputDouble);
        System.out.println("You gave the boolean " + inputBoolean);
        

    }
}
