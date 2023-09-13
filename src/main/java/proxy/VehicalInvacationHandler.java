package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class VehicalInvacationHandler implements InvocationHandler {

    private final IVehicle vehicle;

    public VehicalInvacationHandler(IVehicle vehical) {
        this.vehicle = vehical;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("---------before-------");

        Object invoke = method.invoke(vehicle, args);

        System.out.println("---------after-------");

        return invoke;
    }
}