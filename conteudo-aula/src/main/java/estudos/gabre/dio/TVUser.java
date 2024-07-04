package estudos.gabre.dio;

public class TVUser {

    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV();
        System.out.println("TV is on? " + smartTV.status);
        System.out.println("Channel: " + smartTV.channel);
        System.out.println("What volume is: " + smartTV.volume);

        smartTV.turnOn();
        smartTV.insertChannel(13);
        smartTV.increaseChannel();

        smartTV.increaseVolume();
        smartTV.increaseVolume();
        smartTV.decreaseVolume();
    }
}
