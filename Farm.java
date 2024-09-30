package service;

import model.Animal;
import java.util.ArrayList;
import java.util.List;

public class Farm {
    private static List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println("Animal added: " + animal);
    }

    public void removeAnimal(String name) {
        boolean found = false;
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                animals.remove(animal);
                System.out.println("Animal removed: " + animal);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Animal with name " + name + " not found.");
        }
    }

    public void listAnimals() {
        if (animals.isEmpty()) {
            System.out.println("No animals in the farm.");
        } else {
            System.out.println("Current animals in the farm:");
            for (Animal animal : animals) {
                System.out.println(animal);
            }
        }
    }

    public static void main(String[] args) {
        Farm farm = new Farm();
        farm.addAnimal(new Animal("Bobby", "Dog", 3));
        farm.addAnimal(new Animal("Molly", "Cat", 2));
        farm.listAnimals();
        farm.removeAnimal("Bobby");
        farm.listAnimals();
    }
}
