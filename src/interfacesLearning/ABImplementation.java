package interfacesLearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ABImplementation implements A, B {

    @Override
    public void doA() {
        System.out.println("doing A");
    }

    @Override
    public void common() {
        System.out.println("do common");
    }

    @Override
    public void doB() {
        System.out.println("doing B");
    }

    public static void main(String[] args) {
        ABImplementation implementation = new ABImplementation();
        implementation.doA();
        implementation.doB();

    ImplementationOfA1 implementationOfA1 = new ImplementationOfA1();
    ImplementationOfA2 implementationOfA2 = new ImplementationOfA2();

    List<A> aVariants = new ArrayList<>(Arrays.asList(implementationOfA1, implementationOfA2));

        for (A aVariant : aVariants) {
            aVariant.doA();
        }
    }





}
