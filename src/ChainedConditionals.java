public class ChainedConditionals {
    public static void main(String[] args){
        int grades = 5;

        if(grades >= 7)
            System.out.println("Approved");
        else if (grades >= 5 && grades < 7) //true or false
            System.out.println("Retake test");
        else
            System.out.println("Disapproved");

    }

}
