public class loop {
    public static void main(String[]args) {
        //JAVA While Loop
        //Syntax
        //while(condition){
        //    statement;
        //}

        int i = 0;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }


        //The Do/While Loop
        //Syntax
        //do{
        //    statement;
        //}while(condition);

        int j = 3;
        do {
            System.out.println(j);
            j++;
        } while (j <= 5);

        //While loop combined with If statement
        int dice = 1;

        while (dice <= 6) {
            if (dice < 6) {
                System.out.println("No Yatzy.");
            } else {
                 System.out.println("Yatzy!");
            }
            dice = dice + 1;
        }


        //FOR LOOP
        //Syntax
        //for(initialization; condition; increment/decrement){
        //    statement;
        //}

        for (int p = 0; p < 5; p++) {
            System.out.println(p);
        }

        for (int h = 0; h <= 10; h = h + 2) {
            System.out.println(h);
          }

    }
}
