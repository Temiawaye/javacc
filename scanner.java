import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number:");

        int number = myObj.nextInt();
        System.out.println("You entered: " + number);
        myObj.close(); // Always close the scanner
    }
}
