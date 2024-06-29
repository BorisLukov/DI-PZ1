package farm;

public class Building implements Volume{
    private Dimensions dimension;

    public Building(double width, double length, double height) {
        this.dimension = new Dimensions(width, length, height);
    }

    public double getWidth() {
        return this.dimension.getWidth();
    }

    public double getLength() {
        return this.dimension.getLength();
    }

    public double getHeight() {
        return this.dimension.getHeight();
    }

    public double calculate(){
        return this.dimension.getHeight()*this.dimension.getWidth()*this.dimension.getLength();
    }
}
