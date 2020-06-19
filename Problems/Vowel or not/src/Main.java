import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        // write your code here
        char[] vowel = {'a', 'e', 'i', 'o', 'u'};
        ch = Character.toLowerCase(ch);
        for (int i = 0; i < vowel.length; i++) {
            if (ch == vowel[i]) {
                return true;
            }
        }
        return false;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}