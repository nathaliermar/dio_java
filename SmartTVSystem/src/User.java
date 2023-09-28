public class User {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.decreaseVolume();
        smartTv.decreaseVolume();
        smartTv.volumeUp();

        System.out.println("Current channel : " + smartTv.channel);

        smartTv.changeChannel(2);

        System.out.println("Current channel : " + smartTv.channel);

        System.out.println("Current volume : " +smartTv.volume);

        System.out.println("TV on ?" + smartTv.on);
        System.out.println("Current volume : " + smartTv.volume);

        smartTv.turnOn ();
        System.out.println("New Status ->  TV on ? " + smartTv.on);

        smartTv.turnOff ();
        System.out.println("New Status ->  TV on ? " + smartTv.on);

    }
}
