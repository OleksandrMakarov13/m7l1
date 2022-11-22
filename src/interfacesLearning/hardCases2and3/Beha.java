package interfacesLearning.hardCases2and3;

public class Beha implements Movable, Soundable {
    @Override
    public void doMove() {
        System.out.println("moving");
    }

    @Override
    public void doWhatYouCan() {
        System.out.println("Im in Beha I dont give a f***");
    }

    @Override
    public void doSound() {
        System.out.println("drdrdr");
    }
}
