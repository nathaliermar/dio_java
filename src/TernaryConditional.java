public class TernaryConditional {
    public static void main(String[] args){
        int grades = 7;
        String result = grades >=7 ? "Approved" : grades >= 5 && grades < 7 ? "Retake test" : "Disapproved";

        System.out.println(result);
    }
}
