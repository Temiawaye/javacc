public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("I am learning Java.");
        System.out.println("It is awesome!");
        System.out.print("Hello World! ");
        System.out.print("I will print on the same line.");
        System.out.println(3);
        System.out.println(358);
        System.out.println(50000);
        System.out.println(3 + 3);
        System.out.println(2 * 5);


        //A Single line comment
        /*A Multi Line Comment */


        // type variableName = boolean;
        String name = "Temi";
        System.out.println(name);
        int myNum = (30);
        System.out.println(myNum);

        // int myNim = (30);
        final int myNim = (15);
        System.out.println(myNim);


        int myNom = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";
        System.out.println(myNom);
        System.out.println(myLetter);
        System.out.println(myFloatNum);
        System.out.println(myBool);
        System.out.println(myText);


        //Interger Types
        //byte, short, int and long
        byte myNum2 = 100;
        System.out.println(myNum2);
        short myNum3 = 5000;
        System.out.println(myNum3);
        int myNum4 = 100000;
        System.out.println(myNum4);
        long myNum5 = 15000000000L;
        System.out.println(myNum5);

        //Floating point Types
        //float and double
        float myNum6 = 5.75f;
        System.out.println(myNum6);
        double myNum7 = 19.99d;
        System.out.println(myNum7);

        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        //Widening Casting
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        //Narrowing Casting
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2; // Manual casting: double to int

        System.out.println(myDouble2);   // Outputs 9.78
        System.out.println(myInt2);      // Outputs 9

        // Set the maximum possible score in the game to 500
        int maxScore = 500;

        // The actual score of the user
        int userScore = 423;

        /* Calculate the percantage of the user's score in relation to the maximum available score.
        Convert userScore to float to make sure that the division is accurate */
        float percentage = (float) userScore / maxScore * 100.0f;

        System.out.println("User's percentage is " + percentage);

        // String Length
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());
        
        //Other String Methods
        String txt2 = "Hello World";
        System.out.println(txt2.toUpperCase()); 
        System.out.println(txt2.toLowerCase());

        //Finding a Character in a String
        String txt3 = "Please locate where 'locate' occurs!";
        System.out.println(txt3.indexOf("locate")); // Outputs 7

        //Java String Concatenation
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);

        //concat()
        String firstName2 = "John ";
        String lastName2 = "Doe";
        System.out.println(firstName2.concat(lastName2));

        String x = "10";
        String y = "20";
        String i = x + y;  // z will be 1020 (a String)
        System.out.println(i);

        String txt4 = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt4);

        Math.max(5, 10);
        System.out.println(Math.max(5, 10));

        Math.min(5, 10);
        System.out.println(Math.min(5, 10));

        Math.sqrt(64);
        System.out.println(Math.sqrt(64));

        Math.abs(-4.7);
        System.out.println(Math.abs(-4.7));

        Math.random();
        System.out.println(Math.random());

        int randomNum = (int)(Math.random() * 101); // 0 to 100
        System.out.println(randomNum);

        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false

        int xw = 10;
        int yw = 9;
        System.out.println(xw > yw); // returns true, because 10 is higher than 9

        int xx = 10;
        System.out.println(xx == 10); // returns true, because the value of x is equal to 10

        int tAge = 18;
        int cAge = 8;
        System.out.println(tAge >= cAge); // returns true, because 18 is greater than or equal to 8

    }
}