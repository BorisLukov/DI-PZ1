package farm;

import java.util.HashSet;
import java.util.Set;

public class Barn extends Building {
    private Set<Cage> cages;

    public Barn(double width, double length, double height, int cageCount) {
        super(width, length, height);
        cageCount = 0;
    }

    public void addAnimal(Animal animal){

    }

    public void removeAnimal(Animal animal){

    }

    public Set<Cage> getCages() {
        return cages;
    }

    public Set<Animal> getAnimals() {
        Set<Animal> animals = new HashSet<>();
        for (Cage cage : cages) {

        }
        return animals;
    }

    public boolean removeAll() {

        return true;
    }
}
