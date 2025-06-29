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
            scanner.close();
        } catch (InputMismatchException exception) {
            System.out.println("Неверный ввод. Требовалось ввести число!");
        }
    }

    public static String print(int n) {
        if (n <= 0 || n % 2 == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < n; i += 2) {
            int spaces = (n - i) / 2;
            sb.append(" ".repeat(spaces));
            sb.append("*".repeat(i));
            sb.append("\n");
        }
        for (int i = n; i > 0; i -= 2) {
            int spaces = (n - i) / 2;
            sb.append(" ".repeat(spaces));
            sb.append("*".repeat(i));
            sb.append("\n");
        }
        return sb.toString();
    }
}
