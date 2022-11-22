package interfacesLearning.hardCases2and3;

public interface Soundable extends Car {
    void doSound();

    default void doWhatYouCan(){
        System.out.println("I can drdrdrdrd");
    }
}
