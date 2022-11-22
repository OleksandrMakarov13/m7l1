package interfacesLearning.hardCases2and3;

public interface Movable extends Car {
    void doMove();

    @Override
    default void doRide() {
        System.out.println("I'm moving");
    }

    default void doWhatYouCan(){
        System.out.println("I can moving");
    }
}
