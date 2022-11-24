package module8L2.interfaces;

public class Bird implements Namable, Movable {
    public String name = "Bird";

    @Override
    public void sayYourName() {
        System.out.println("I'm Bird");
    }

    @Override
    public void move() {
        System.out.println("I'm "+name+" I fly");
    }

    @Override
    public void doWork() {
        this.sayYourName();
        this.move();
    }
}
