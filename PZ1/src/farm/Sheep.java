package farm;

public class Sheep extends Milking {
    @Override
    public void eat() {
        if(getPower() < getMaxPower()){
            setPower(getPower() * (getMaxPower() * 0.05));
        }
    }

    public String bleat(){
        return "Блеене";
    }

    public Sheep(double width, double length, double height, double maxPower, double maxQuantity) {
        super(width, length, height, maxPower, maxQuantity);
    }
}
