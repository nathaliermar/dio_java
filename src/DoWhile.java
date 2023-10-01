import java.util.Random;

public class DoWhile {
    public static void main(String[] args){
        System.out.println("Dialing...");
        do {
            System.out.println("Phone ringing");
        }while(ringing());

        System.out.println("Hello !!!");
    }
    private static boolean ringing(){
        boolean answered = new Random().nextInt(3)==1;
        System.out.println("Answered? " + answered);
        return ! answered;
    }
}
