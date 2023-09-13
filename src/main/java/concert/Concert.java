package concert;

public class Concert implements Performance {
    private String myname = "taozhasoheng";

    public String getMyname() {
        return myname;
    }

    public void setMyname(String myname) {
        this.myname = myname;
    }

    @Override
    public void perform() {
        System.out.println("perform...");
    }

    @Override
    public String toString() {
        return "taozs";
    }
}
