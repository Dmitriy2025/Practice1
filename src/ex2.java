import java.util.Scanner;

// Реализуйте функцию, которая складывает два числа и возвращает их сумму в двоичном формате.
// Преобразование может быть выполнено до или после сложения.
// Возвращаемое двоичное число должно быть строкой.
// 1, 1 --> "10" (1 + 1 = 2 in decimal or 10 in binary)
// 5, 9 --> "1110" (5 + 9 = 14 in decimal or 1110 in binary)
public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String res;
        System.out.println(
                "a = " + a +
                ", b = " + b);

        res = sumTwo(a, b);

        System.out.println(res);
    }

    private static String sumTwo(int a, int b) {
        int sumTemp;

        StringBuilder sb = new StringBuilder();
        sumTemp = a + b;
        while (sumTemp > 0) {
            sb.append(sumTemp%2);
            sumTemp /= 2;
        }
        sb.reverse();
        return sb.toString();
    }
}
