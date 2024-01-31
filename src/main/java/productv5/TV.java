package productv5;

public class TV extends Product {
    private String screenSize;

    private String manufacture;

    public TV(){
        super();
        screenSize = "";
        manufacture = "";
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public String toString() {
        return "TV has a " +
                "screenSize of " + screenSize + '\'' +
                ",and the manufacture is " + manufacture + '\''
                ;
    }
}
