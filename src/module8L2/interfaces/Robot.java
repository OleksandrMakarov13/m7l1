package module8L2.interfaces;

public class Robot implements Namable{
    public String name = "Robot-Vector";

    @Override
    public void sayYourName() {
        System.out.println("I'm Robot-Vector");
        System.out.println("I'm Robot-Vector");
    }

    @Override
    public void doWork() {
        this.sayYourName();
    }
}
