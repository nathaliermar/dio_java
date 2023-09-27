public class SchoolReport {
    public static void main(String [] args) {
        int finalMedia =  7;
        if (finalMedia < 6)
            System.out.println("Disapproved");
        else if (finalMedia == 6)
            System.out.println("Retake test");
        else
            System.out.println("Approved");
    }
}
