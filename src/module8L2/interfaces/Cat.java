package module8L2.interfaces;

public class Cat implements Namable, Movable {
    public String name = "Cat";

    @Override
    public void sayYourName() {
        System.out.println("I'm Cat");
        System.out.println("Mur mur");
    }

    @Override
    public void move() {
        System.out.println("I'm "+name+" I move silently");
    }

    @Override
    public void doWork() {
        this.sayYourName();
        this.move();
    }
}
