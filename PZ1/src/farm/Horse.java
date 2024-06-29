package farm;

public class Horse extends Animal implements Freight{
    public Horse(double width, double length, double height, double maxPower) {
        super(width, length, height, maxPower);
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

    public String neigh(){
        return "Цвилене";
    }
}
