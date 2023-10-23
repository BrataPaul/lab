import java.util.Scanner;
public class ReverseWord {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("dati cuvant:");

        String word = myObj.nextLine();

        String nstr = "";
        char ch;
        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
            nstr = ch + nstr;
        }
        System.out.println("Reversed word: " + nstr);


    }
}

