package proxy;


public class Car implements IVehicle {
    public void run() {
        System.out.println("Car会跑");
    }

    @Override
    public String toString() {
        return "this is Car{}";
    }
}