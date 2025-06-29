import java.util.Arrays;
import java.util.Scanner;

// Напишите функцию, которая переворачивает слова, где больше 5 букв.
// Переданные строки будут состоять только из букв и пробелов.
// Пробелы будут включены только в том случае, если присутствует более одного слова.
// "Hey fellow warriors"  --> "Hey wollef sroirraw"
// "This is a test        --> "This is a test"
// "This is another test" --> "This is rehtona test"
public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Данная программа переворачивает слова, где больше 5 букв\nВведите строку: ");
        String sentence = scanner.nextLine();
        System.out.println("Переделанная строка: " + spinWords(sentence));
        scanner.close();
    }
    public static String spinWords(String sentence) {
        String [] str;
        str = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            String word = str[i];
            if (word.length() >= 5) {
                sb.append(new StringBuilder(word).reverse());
            } else {
                sb.append(word);
            }
            if (i < str.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
