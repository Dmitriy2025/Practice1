// Написать функцию, которая увеличивает строку, чтобы создать новую строку.

// Если строка уже заканчивается числом, то число следует увеличить на 1.
// Если строка не заканчивается числом, то к новой строке следует добавить число 1.
// Внимание: если номер имеет начальные нули, следует учитывать количество цифр.

// foo -> foo1
// foobar23 -> foobar24
// foo0042 -> foo0043
// foo9 -> foo10
// foo099 -> foo100

import java.math.BigInteger;
import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Эта программа увеличивает на 1 число в конце строки, либо добавляет 1 к строке\n" +
                "Введите строку для проверки: ");
        String str1 = scn.nextLine();
        scn.close();

        System.out.println("Преобразованная строка:\n" + incrementString(str1));

    }
    public static String incrementString(String str) {
        int divider = str.length()-1;
        while (divider >= 0 && Character.isDigit(str.charAt(divider))) {
            divider--;
        }

        String stringPart = str.substring(0, divider + 1);
        String digitPart = str.substring(divider + 1);

        if (digitPart.isEmpty()) {
            return str + "1";
        }

        int digitLength = digitPart.length();
        BigInteger digits = new BigInteger(digitPart).add(BigInteger.ONE); //
        String newDigitPart = String.format("%0" + digitLength + "d", digits);

        return stringPart + newDigitPart;
    }
}
