import java.util.Arrays;

public class PersonTest {

    public static void main(String[] args) {

        String[] hobbyBobo = {"yoga", "chess", "cats"};
        String[] hobbyBoboJan = {"bike", "ski"};
        ImutablePerson person = new ImutablePerson("Bobo", hobbyBobo);
        ImutablePerson person2 = new ImutablePerson("BoboJan", hobbyBoboJan);
//        System.out.println(person.getName());
//        System.out.println(person2.getName());
//
//        System.out.println(Arrays.toString(person.getHobby()));
//        System.out.println(Arrays.toString(person2.getHobby()));

        String input = "I'm cool java dev from GOIT";

// Довжина рядка
        System.out.println(input.length());

        //символ в рядку по індексу
        System.out.println(input.charAt(4));

        //перевести ярдок в масив символів
        char[] charsArray = input.toCharArray();

//        for (int i = 0; i < charsArray.length; i++) {
//            System.out.println(charsArray[i] + "*");
//        }

        for (char currentCharInArray : charsArray) {
            System.out.print(currentCharInArray + "*");
        }
//порівняння рядків
        String a = "aaa";
        String b = "AaA";
        String c = "aaa";

        System.out.println("--------------------");

        System.out.println("a.equals(b) = " + a.equals(b));
        System.out.println("a.equals(c) = " + a.equals(c));
        System.out.println("a.equalsIgnoreCase(b) = " + a.equalsIgnoreCase(b));

        //зміна регістру символів у рядку
        System.out.println("input.toUpperCase() = " + input.toUpperCase());
        System.out.println("input.toLowerCase() = " + input.toLowerCase());

        // Прибрати пробіли на початку і в кінці рядка
        String dataWithWhitespaces = "     Hello     ";
        System.out.println("dataWithWhitespaces.length() = " + dataWithWhitespaces.length());
        System.out.println("dataWithWhitespaces.trim().length() = " + dataWithWhitespaces.trim().length());

        //Взяти підрядок з рядка
        String fullName = "Ivanov Ivan Ivanich";
        char[] nameChars = fullName.toCharArray();
        int firstWhitespace = 0;
        for (int i = 0; i < nameChars.length; i++) {
            if (String.valueOf(nameChars[i]).equals(" ")){
                firstWhitespace = i;
                break;
            }
        }
        System.out.println("fullName.substring(0, firstWhitespace) = " + fullName.substring(0, firstWhitespace));
        System.out.println("fullName.substring(firstWhitespace) = " + fullName.substring(firstWhitespace));

//        System.out.println("person.toString() = " + person.toString());
//        System.out.println("String.valueOf(person) = " + String.valueOf(person));
//        Integer integerValue = 1;
//        System.out.println(String.valueOf(integerValue).equals("1"));
//        System.out.println(integerValue.equals("1"));

        // Пошук підрядка у рядку
        int index = fullName.indexOf("I");

        System.out.println("with indexOf fullName.substring(0, firstWhitespace) = " + fullName.substring(0, index));
        System.out.println("with indexOf fullName.substring(firstWhitespace) = " + fullName.substring(index));

        int lastIndex = fullName.lastIndexOf("I");
        System.out.println("fullName.substring(lastIndex) = " + fullName.substring(lastIndex));

        //заміна підрядка у рядку
        System.out.println("fullName.replace('I', 'O') = " + fullName.replace('I', 'O'));
        System.out.println("fullName.replace(\"Iv\", \"Ok\") = " + fullName.replace("Iv", "Ok"));

        System.out.println("fullName.replaceAll(\"Ivan\", \"Bob\") = " + fullName.replaceAll("Ivan", "Bob"));

        System.out.println("fullName.replaceFirst(\"Ivan\", \"Petro\") = " + fullName.replaceFirst("Ivan", "Petro"));

    }
}
