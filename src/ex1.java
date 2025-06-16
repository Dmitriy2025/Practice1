// Подсчитайте количество дубликатов
//Напишите функцию, которая будет возвращать количество различных
// буквенных символов без учета регистра и цифровых разрядов,
// которые встречаются во входной строке более одного раза.
import java.util.*;

/** Example
"abcde" -> 0 # no characters repeats more than once
"aabbcde" -> 2 # 'a' and 'b'
 "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1 # 'i' occurs six times
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
"aA11" -> 2 # 'a' and '1'
 "ABBA" -> 2 # 'A' and 'B' each occur twice
 */

public class ex1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Эта программа считает сколько раз повторяется символ в строке более 2х раз.\n" +
                "Введите строку для проверки: ");

        String str1 = scn.nextLine();
        scn.close();

        doubleSymbols(str1);

    }


    private static void doubleSymbols(String str) {
        int count = 0;

        str = str.toLowerCase();
        HashMap<Character, Integer> hashMap = new HashMap<>();
            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }
                }
                if (count > 1) {
                    hashMap.put(str.charAt(i), count);
                }
                count = 0;
            }
        System.out.println(hashMap);
    }
}
