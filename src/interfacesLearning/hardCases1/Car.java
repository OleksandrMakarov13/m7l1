package interfacesLearning.hardCases1;

public interface Car {

    default void doRide(){
        System.out.println("Я Їду!!!!!!!!");
    }

    void getName();
}
