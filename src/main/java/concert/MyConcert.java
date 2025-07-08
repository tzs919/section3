package concert;

public class MyConcert extends Concert implements Encoreable {
    @Override
    public void performEncore() {
        System.out.println("perform the encore!");
    }
}
