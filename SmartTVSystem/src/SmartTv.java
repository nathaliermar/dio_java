public class SmartTv {
    boolean on = false;
    int channel = 1;
    int volume = 23;

    public void volumeUp(){
        volume++;
        System.out.println("Increasing the volume to: " + volume);
    }

    public void decreaseVolume(){
        volume--;
        System.out.println("Decreasing the volume to: " + volume);
    }

    public void changeChannel (int newChannel){
        channel = newChannel;
    }
    public void increaseChannel(){
        channel++;
    }
    public void decreaseChannel(){
        channel--;
    }

    public void turnOn(){
        on = true;
    }
    public void turnOff(){
        on = false;
    }
}
