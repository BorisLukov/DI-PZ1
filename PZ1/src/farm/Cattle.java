package farm;

public class Cattle extends Milking implements Freight{
    public Cattle(double width, double length, double height, double maxPower, double maxQuantity) {
        super(width, length, height, maxPower, maxQuantity);
    }

    @Override
    public void eat() {
        if(getPower() < getMaxPower()){
            setPower(getPower() * (getMaxPower() * 0.05));
        }
    }

    @Override
    public void work() {
        setPower(getPower()*0.5);
    }

    public String moo(){
        return "Мучене";
    }
}
