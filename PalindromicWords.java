package MathAndStringClasses;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromicWords {

    static void isPalindrom(String word) {
        int wordReversCount = word.length() - 1;
        for (int i = 0; i < word.length(); ++i) {
            if (word.charAt(i) == word.charAt(wordReversCount)) {
                if (wordReversCount == 0) {
                    System.out.println("Girilen Kelime Palindromik Kelimedir");
                }
                wordReversCount--;
            } else {
                System.out.println("Girilen Kelime Palindromik Kelime Değil");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Kelime Giriniz:");
        String word = inp.nextLine();
        isPalindrom(word);

    }
}
