package proxy;

import java.lang.reflect.Proxy;

public class App {
    public static void main(String[] args) {
        IVehicle car = new Car();

        IVehicle vehicle = (IVehicle) Proxy.newProxyInstance(car.getClass().getClassLoader(), Car.class.getInterfaces(), new VehicalInvacationHandler(car));
        vehicle.run();
    }
}