/* Подсчитайте количество дубликатов
Напишите функцию, которая будет возвращать количество различных
буквенных символов без учета регистра и цифровых разрядов,
которые встречаются во входной строке более одного раза.

"abcde" -> 0 # no characters repeats more than once
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1 # 'i' occurs six times
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice
*/

import java.util.*;


public class ex1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Эта программа считает сколько символов в строке повторяются более двух раз.\n" +
                "Введите строку для проверки: ");
        String str1 = scn.nextLine();
        scn.close();

        System.out.println("Количество символов, встречающихся более двух раз в строке:\n" + doubleSymbols(str1));
    }


    private static int doubleSymbols(String str) {
        str = str.toLowerCase();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
                Character ch = str.charAt(i);
                hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
        }
        int duplicateCount = 0;
        for (int count : hashMap.values()) {
            if (count > 1) {
                duplicateCount++;
            }
        }
        return duplicateCount;
    }
}
