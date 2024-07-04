package estudos.gabre.dio;

public class SmartTV{
    boolean status = false;
    int channel=1;
    int volume=25;

    //Turn TV on and off.
    public void turnOn(){
        status=true;
        System.out.println("TV is on now.");
    }
    public void turnOff(){
        status=false;
        System.out.println("TV is turning off.");
    }    

    //Increase and decrease TV volume.
    public void increaseVolume(){
        volume++;
        System.out.println("Current volume: " + volume);
    }
    public void decreaseVolume(){
        volume--;
        System.out.println("Current volume: " + volume);
    }    

    //Change channel
    public void increaseChannel(){
        channel++;
        System.out.println("Current channel: " + channel);
    }
    public void decreaseChannel(){
        channel--;
        System.out.println("Current channel: " + channel);
    }
    public void insertChannel(int userChannel){
        channel = userChannel;
        System.out.println("Current channel: " + channel);
    }
}