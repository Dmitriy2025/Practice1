import java.util.Scanner;

// Ваша задача — написать функцию maskify, которая меняет все символы, кроме последних четырех, на «#».
// "4556364607935616" --> "############5616"
//     "64607935616" -->      "#######5616"
//               "1" -->                "1"
//                "" -->                 ""
public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Эта программа маскирует все символы строки, кроме последних 4х.\nВведите строку для шифровки:");
        String str = scanner.nextLine();
        System.out.println(maskify(str));
        scanner.close();
    }

    public static String maskify(String str) {
        if (str.length() > 4) {
            return str.substring(0,str.length()-4).replaceAll(".", "#") + str.substring(str.length()-4);
        } else {
            return str;
        }
    }
}
