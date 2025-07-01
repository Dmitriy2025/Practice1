import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

// Напишите функцию, которая принимает строку фигурных скобок и определяет,
// является ли порядок фигурных скобок допустимым. Она должна возвращать true или false.
// "(){}[]"   =>  True
// "([{}])"   =>  True
// "(}"       =>  False
// "[(])"     =>  False
// "[({})](]" =>  False
public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Данная программа проверяет скобки на соотвествие\nВведите строку:  ");
        String braces = scanner.nextLine();
        System.out.println("Результат проверки: " + isValid(braces));
        scanner.close();
    }
    public static boolean isValid(String braces) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> hm = new HashMap<>();
        hm.put('(',')');
        hm.put('{','}');
        hm.put('[',']');

        for (char ch : braces.toCharArray()) {
            if (hm.containsKey(ch)) {
                stack.push(ch);
            } else if (hm.containsValue(ch)) {
                if (stack.isEmpty()) return false;
                char poppedCh = stack.pop();
                if (hm.get(poppedCh) != ch ) return false;
            }
        }
        return stack.isEmpty();
    }
}
