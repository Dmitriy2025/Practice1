import java.util.HashMap;
import java.util.Scanner;

// Цель этого упражнения — преобразовать строку в новую строку,
// где каждый символ в новой строке — это "(", если этот символ встречается в исходной строке только один раз,
// или ")", если этот символ встречается в исходной строке более одного раза.
// Игнорируйте регистр букв при определении того, является ли символ дубликатом.
// "din"      =>  "((("
//"recede"   =>  "()()()"
//"Success"  =>  ")())())"
//"(( @"     =>  "))(("
public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Данная программа преобразует строку так, что каждый символ в новой строке это\s
                "(" - символ встречается в исходной строке только 1 раз,
                ")" - символ встречается в исходной строке более 1 раза.
                Введите строку:""");
        String str = scanner.nextLine();
        System.out.println(encode(str));
        scanner.close();
    }

    static String encode(String word){
        word = word.toLowerCase();
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            hashMap.put(ch, hashMap.getOrDefault(ch,0) + 1);
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (hashMap.get(ch) > 1) result.append(")");
            else result.append("(");
        }

        return result.toString();
    }
}
