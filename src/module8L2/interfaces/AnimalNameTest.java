package module8L2.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalNameTest {

    public static void main(String[] args) {
        Cat cat = new Cat();
//        cat.sayYourName();

        Dog dog = new Dog();
//        dog.sayYourName();

        Bird bird = new Bird();
//        bird.sayYourName();

        Robot robot = new Robot();

        System.out.println("----------------------------");
        List<Namable> namables = new ArrayList<>(Arrays.asList(cat, dog, bird, robot));

        for (Namable namable : namables) {
            namable.sayYourName();
        }

        System.out.println("----------------------------");
        List<Movable> movables = new ArrayList<>(Arrays.asList(cat, dog, bird));
        for (Movable movable : movables) {
            movable.move();
        }

        System.out.println("----------------------------");
        List<MarkerInterface> allItems = new ArrayList<>(Arrays.asList(cat, dog, bird, robot));

        for (MarkerInterface item : allItems) {
            item.doWork();
        }

    }
}
