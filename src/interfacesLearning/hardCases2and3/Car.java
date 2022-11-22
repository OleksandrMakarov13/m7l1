package interfacesLearning.hardCases2and3;

public interface Car {
    default void doRide(){
        System.out.println("I'm riding");
    };
}
