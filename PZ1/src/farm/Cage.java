package farm;

public class Cage extends Building{
    private Animal animal;

    public Cage(double width, double length, double height) {
        super(width,length,height);

    }

    public Animal getAnimal() {
        return animal;
    }

    public boolean accommodation(Animal animal){
        if (this.animal == null) { // If the cage is empty
            this.animal = animal;
            return true;
        }else{
            return false;
        }
    }

    public boolean release(){
        if (this.animal != null) { // If the cage has an animal
            this.animal = null;
            return true;
        } else {
            return false;
        }
    }
}
