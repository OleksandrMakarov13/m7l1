public class StringBuilderTest {
    public static void main(String[] args) {
        String name = "Bobo";
        StringBuilder nameBuilder = new StringBuilder(name);

        System.out.println("nameBuilder.append(\"!\") = " + nameBuilder.append("!"));

        System.out.println("nameBuilder.deleteCharAt(4) = " + nameBuilder.deleteCharAt(4));

        System.out.println("nameBuilder.delete(2,3) = " + nameBuilder.delete(2, 4));

        System.out.println("nameBuilder.append(\"bert\") = " + nameBuilder.append("bert"));

        System.out.println("nameBuilder.replace(3,6, \"onator\") = " + nameBuilder.replace(3, 6, "onator"));

        System.out.println("nameBuilder.reverse() = " + nameBuilder.reverse());

        StringBuilder anotherBuilder = new StringBuilder("ahahahaha");
        System.out.println("nameBuilder.compareTo(nameBuilder) = " + nameBuilder.compareTo(nameBuilder.append("!")));

        String s = nameBuilder.toString();
        System.out.println(s);



    }
}
