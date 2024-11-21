public class conditions {
    public static void main(String[]args) {
        //IF Statement
        //Syntax
        //if (condition) {
            // block of code to be executed if the condition is true
        //}

        if (20 > 16) {
            System.out.println("20 is greater than 16");
        }

        int x = 30;
        int y = 28;
        if (x > y) {
            System.out.println("X is greater than Y");
        }

        //The Else Statement
        //Syntax
        //if (condition) {
            // block of code to be executed if the condition is true
        //} else {
            // block of code to be executed if the condition is false
        //}

        int time = 24;
        if (time < 12) {
            System.out.println("Good Morning");
        } else {
            System.out.println("Good Afternoon");
        }

        //Else IF
        //Syntax
        //if (condition1) {
            // block of code to be executed if the condition1 is true
        //} else if (condition2) {
            // block of code to be executed if the condition1 is false and condition2 is true
        //} else {
            // block of code to be executed if none of the above conditions are true
        //}

        int timeod = 24;
        if (timeod < 10) {
            System.out.println("Good Morning");
        } else if (timeod < 2) {
            System.out.println("Good afternoon");
        } else {
            System.out.println("Good evening");
        }

        //Java Short Hand IF-ELSE (Ternary Operator)
        //Syntax
        //variable = (condition) ? expressionTrue :  expressionFalse;

        int timeofDay = 24;
        String result =(timeofDay < 10) ? "Good Day" : "Good Evening";
        System.out.println(result);

    }
}
