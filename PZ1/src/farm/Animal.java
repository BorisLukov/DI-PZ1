package farm;

public abstract class Animal implements Volume{
    private Dimensions dimension;
    private double power;
    private double maxPower;

    public Animal(double width, double length, double height, double maxPower) {
        this.dimension = new Dimensions(width, length, height);
        this.maxPower = maxPower;
    }
    public abstract void eat();

    public boolean fed(){
        return maxPower > power;
    }

    public double getPower() {
        return power;
    }

    public double getMaxPower() {
        return maxPower;
    }

    protected void setPower(double power) {
        this.power = power;
    }

    public double calculate(){
        return this.dimension.getHeight()*this.dimension.getWidth()*this.dimension.getLength();
    }
}

