package exercises;
import java.util.Scanner;
public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String aliceSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println(aliceSentence);

        System.out.println("For which term would you like to search the passage?");
        String searchTerm = input.nextLine();

        boolean results = aliceSentence.contains(searchTerm);

        System.out.println(results);

        input.close();
    }
}
