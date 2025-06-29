import java.util.InputMismatchException;
import java.util.Scanner;

// Вам нужно вернуть строку, которая выглядит как ромб при печати на экране, используя символы звездочки (*).
// Конечные пробелы должны быть удалены, а каждая строка должна заканчиваться символом новой строки (\n).
// 3 - " *\n***\n *\n"
// 5 - "  *\n ***\n*****\n ***\n  *\n"
public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Данная программа распечатывает ромб.\nВведите нечетное число: ");
        try {
            int n = scanner.nextInt();
            System.out.println(print(n));
            //scanner.nextLine();
            scanner.close();
        } catch (InputMismatchException exception) {
            System.out.println("Неверный ввод. Требовалось ввести число!");
        }
    }
    public static String print(int n) {
        if (n <= 0 || n%2 == 0) {
            return null;
        } else {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            while (count < n) {
                for (int i = 0; i < n-count-i; i++) {
                    sb.append(" ");
                }
                for (int i = 0; i < count; i++) {
                    sb.append("*");
                }
                sb.append("\n");
                count +=2;
            }
            while (count > 0) {
                if (count != n) {
                    for (int i = 0; i < n-count-i; i++) {
                        sb.append(" ");
                    }
                }
                for (int i = 0; i < count; i++) {
                    sb.append("*");
                }
                sb.append("\n");
                count -=2;
            }
            return sb.toString();
        }
    }
}
