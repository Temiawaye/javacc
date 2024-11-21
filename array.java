public class array {
    public static void main(String[] args) {
        // Declare an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        String[] cars ={"Volvo", "Honda", "BMW", "Ford"};
        
        // Acess the Elements of an Array
        System.out.println(cars[2]);

        //Change an Array Element
        numbers[2] = 9;
        System.out.println(numbers[0]);
        System.out.println(numbers[2]);

        //Array Length
        System.out.println(cars.length);

        //Java Arrays Loop
        //Loop through an Array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        //Loop through an Array with For-Each
        //Syntax
        // for (type variable : arrayname) {
        //  ...
        // }
        for (String car : cars) {
            System.out.println(car);
        }

        //Multi-Dimensional Arrays
        int[][] mynumbers = { {1,2,3,4,5}, {6,7,8} };

        //Access Elements
        System.out.println(mynumbers[1][2]);

    }
}
