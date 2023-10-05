public class Operators {
    public static void main(String [] args) {

        // Unary -> applied together with another arithmetic applicator, inverts numeric and Boolean values.
//        int number = 6;
//
//        number = - number;
//
//        System.out.println(number);
//
//        number = number * -1;
//
//        System.out.println(number);
//
//        //Way to increment and decrement values by 1.
//        int number = 6;
//
//        //x repetition
//        //number = number +1 -> (number ++);
//        //number = number -1 -> (number --);
//
//        System.out.println(number -- );
//        System.out.println(number);
//
//        //Way to invert the value of a boolean variable
//        boolean variable = true;
//
//        variable = !variable;
//
//        System.out.println(variable);



        //Relational operators

        int number1 = 1;
        int number2 = 2;

        boolean yesNo = number1 == number2;

        System.out.println("number1 is equal to number2? " + yesNo);

        yesNo = number1 != number2;

        System.out.println("number1 is different from number2? " + yesNo);

        yesNo = number1 > number2;

        System.out.println("number1 is bigger than number2? " + yesNo);


    //Equals → comparison of contents, whether they are equal

        String name1 = "Nathalie";
        String name2 = new String("Nathalie");

        System.out.println(name1.equals(name2));


        //Logical Operators

        boolean condition1 = true;
        boolean condition2 = true;

        if(condition1 && condition2) {
            System.out.println("Both are true");
        }
        if(condition1 || condition2) {
            System.out.println("Only one is true");
        }
        System.out.println("End");


    }
}
