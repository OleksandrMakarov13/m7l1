package interfacesLearning.hardCases1;

import interfacesLearning.hardCase4.Lanos;
import interfacesLearning.hardCases2and3.Beha;

public class TestCar {
    public static void main(String[] args) {
        // case1
        Mazda3 mazda3 = new Mazda3();
        mazda3.doRide();

        //case2
        Beha beha = new Beha();
        beha.doRide();

        //case3
        beha.doWhatYouCan();

        Lanos lanos = new Lanos();
        lanos.charge();


    }
}
