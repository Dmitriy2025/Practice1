// Дана строка
// Если длина строки нечетная, верните средний символ.
// Если длина строки четная, верните средние 2 символа.
// "test" --> "es"
// "testing" --> "t"
// "middle" --> "dd"
// "A" --> "A"
public class ex5 {
    public static void main(String[] args) {
        System.out.println("Данная программа принимает строку.\n" +
                "Если длина строки нечетная, верется средний символ.\n" +
                "Если длина строки четная, вернется средние 2 символа.");
        String str = "A";
        System.out.println("Строка = " + str);
        System.out.println("Результат программы = " + getMiddle(str));
    }

    public static String getMiddle(String word) {
        StringBuilder res = new StringBuilder();
        if (word.length()%2 != 0) {
             res.append(word.charAt(word.length()/2));
       } else {
            res.append(word.charAt(word.length() / 2-1));
            res.append(word.charAt(word.length()/2) );
        }
        return res.toString();
    }
}
