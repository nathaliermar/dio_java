public class ConditionalStructures {

    //Cash Machine - Simple Conditional
    public static void main(String[] args){
        double balance = 22.0;
        double requestedAmount = 20.0;

        if(requestedAmount < balance) {
            balance = balance - requestedAmount;

        System.out.println("New balance: " + balance);
        } else
            System.out.println("Insufficient funds");
    }
}
