package co.grandcircus.geology;

public class Mesa implements iFormation{

    private int height = 0;
    private int area = 0;
    private String name = "";

    public Mesa(int height, int area, String name){
        this.height = height;
        this.area = area;
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String getInfo() {
        return String.format("Mesa: %s is %s tall with an area of %s.", name, height, area);
    }

}
