package estudos.gabre.dio;

public class Car {

    public void turnOn() {
        gearCheck();
        fuelCheck();
        System.out.println("Car running");
    }
    private void gearCheck(){
        System.out.println("P");
    }
    private void fuelCheck(){
        System.out.println("Fueled");
    }


}
