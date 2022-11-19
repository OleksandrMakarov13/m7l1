/*
"Завдання.Напиши клас WordDeleter.
У цього класу створи метод public String remove(String phrase, String[] words).
Цей метод приймає рядок phrase, який складається з окремих слів, розділених рівно одним пробілом, і видаляє з неї всі слова, вказані в масиві words.

Повертається рядок без цих слів. Слова, що залишилися, повинні так само бути розділені рівно одним пробілом."


"Тести: виклик new WordDeleter().remove(""Hello Java"", new String[] {""Java""}) повертає Hello;
виклик new WordDeleter().remove(""This is Sparta"", new String[] {""is""}) повертає This Sparta;"
 */

public class WordDeleter {

    public static void main(String[] args) {
        System.out.println(new WordDeleter().remove("Hello Java", new String[]{"Java"}));
    }
    public String remove(String phrase, String[] words) {
        String[] strings = phrase.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (!strings[i].equals(words[j])){
                    builder.append(strings[i]);
                }
            }

        }

        return builder.toString();

    }

}
