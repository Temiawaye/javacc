import java.util.Scanner;

public class app {
    public static void main(String[] args) throws Exception {
        try(Scanner myObj = new Scanner(System.in)){
            System.out.println("Enter Your Grade");
            int grade = myObj.nextInt();
            if(grade>=70 && grade <= 100){
                System.out.println("Your Grade is A");
            }
            else if(grade >=60){
                System.out.println("Your Grade is B");
            }
            else if(grade >=50){
                System.out.println("Your Grade is C");
            }
            else if(grade >=45){
                System.out.println("Your Grade is D");
            }
            else if(grade >=40) {
                System.out.println("Your Grade is E");
            }
            else if(grade >=0 && grade <= 39){
                System.out.println("Your Grade is F");
            }
            else{
                System.out.println("Invalid Grade");
            }
        }
    }
}
