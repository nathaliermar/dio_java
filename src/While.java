import java.util.concurrent.ThreadLocalRandom;

public class While {
    public static void main(String[] args){

        //WHILE

        double allowance = 50.0;

        while( allowance > 0 ) {
            Double candyValue = randomValue();

            if(candyValue > allowance)
                candyValue = allowance;
            System.out.println("Candy value: " + candyValue + "Added to cart");
            allowance = allowance - candyValue;
        }
        System.out.println("Allowance:" + allowance);
        System.out.println("Navel spent all his money on sweets");
    }
    private static double randomValue(){
        return ThreadLocalRandom.current().nextDouble(2,15);
    }
}
