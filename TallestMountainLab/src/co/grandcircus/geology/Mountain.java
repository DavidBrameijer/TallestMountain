package co.grandcircus.geology;

public class Mountain implements iFormation {

    private int height = 0;
    private String name = "";

    public Mountain(int height, String name){
        this.height = height;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String getInfo() {
        return String.format("Mountain: %s is %s tall.", name, height);
    }

}
