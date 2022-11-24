package module8L2.interfaces;

public class Dog implements Namable, Movable {
    public String name = "Dog";

    @Override
    public void sayYourName() {
        System.out.println("I'm Dog");
        System.out.println(2+3);
    }

    @Override
    public void move() {
        System.out.println("I'm "+name+" I run");
    }

    @Override
    public void doWork() {
        this.sayYourName();
        this.move();
    }
}
