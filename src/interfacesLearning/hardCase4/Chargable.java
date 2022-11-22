package interfacesLearning.hardCase4;

public interface Chargable {
    default void charge(){
        System.out.println("charging in interface");
    };
}
