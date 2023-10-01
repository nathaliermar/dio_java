public class SwitchCase {
    public static void main(String[] args) {
        String acronym = "B";
        switch (acronym) {
            case "S": {
                System.out.println("SMALL");
                break;
            }
            case "M":{
                System.out.println("MEDIUM LARGE");
                break;
            }
            case "B":{
                System.out.println("BIG");
                break;
            }
            default:
                System.out.println("UNDEFINED");
        }


        //Switch case - Carrier Plan

        String plan = "M";

        switch (plan) {
            case "T": {
                System.out.println("4Gb Youtube");
            }
            case "M": {
                System.out.println("Free whats and Instagram");
            }
            case "B": {
                System.out.println("Free calls");
            }
        }
    }
}
