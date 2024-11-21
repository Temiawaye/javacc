public class foreachloop {
    public static void main(String[] args) {
        // Java foreach Loop
        //Syntax
        // for (type variable : arrayname/collection) {
            // statement(s); or code block
        //}
        String[] cars ={"Volvo", "BMW", "Ford", "Honda"};
        for (String i : cars) {
            System.out.println(i);
        }


        for (int q =0; q <100; q = q + 10) {
            System.out.println(q);
        }

        int number = 2;
        for (int w = 1; w <= 10; w++) {
            System.out.println(number + "x" + w + "=" + (number * w));
        }
    }
}
