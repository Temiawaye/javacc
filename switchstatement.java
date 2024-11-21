public class switchstatement {
    public static void main(String[]args) {
        //JAVA Switch Statements
        //Syntax
        // switch (expression) {
        //     case x:
        //         statement(s); or code block
        //         break;
        //     case y:
        //         statement(s); or code block
        //         break;
        //     default:
        //         statement(s); or code block
        // }

        int day = 5;
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }

        //The Default Keyword
        int day2 = 4;
        switch (day2) {
            case 6:
                System.out.println("Today is Friday");
                break;
            case 7:
                System.out.println("Today is Saturday");
                break;
            default:
                System.out.println("Looking forward to the weekend");
        }
    }
}
