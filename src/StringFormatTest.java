public class StringFormatTest {

    public static void main(String[] args) {
        String sonName = "Bobert";
        int age =25;
        String fatherName = "Bobo";
        int weight = 100;

        System.out.println("Father name is " + sonName + " he is " + age + ", his son is "
                + fatherName + ".His weight is " );

        System.out.println(String.format("Father name is %s he is %d, his son is %s.His weight is %d",
                sonName, age, fatherName, weight));

        System.out.printf("Father name is %s he is %d, his son is %s.His weight is %d",
                sonName, age, fatherName, weight);

        /*
        %s - String
        %d - ціле число int, long ...
        %f - для чисел з плаваючою крапкою, float, double ...
        %b - boolean
        %c - char
        %t - Date
        %% - символ %
         */

    }
}
