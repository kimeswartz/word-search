import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a sentence:");

        Scanner myScanner = new Scanner(System.in);

        String userSentenceInput = myScanner.nextLine();

        System.out.println("You typed: " + "'" + userSentenceInput + "'." + "\n" + "Now, type any word for me to check if your sentence contains that word: ");

        String[] sentenceToList = userSentenceInput.split(" ");

        String userWordInput = myScanner.nextLine();

        boolean wordFound = false;

        for (String element : sentenceToList) {
            if (element.contains(userWordInput)) {
                System.out.println("Input word: " + element);
                System.out.println("True, the sentence has the word: " + element);
                wordFound = true;
                break;

            }
        }

        if (!wordFound) {
            System.out.println("Your given sentence does not contain that word!");
        }
    }
}