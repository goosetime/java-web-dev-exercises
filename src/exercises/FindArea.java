package exercises;
import java.util.Scanner;

public class FindArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of the rectangle? Please use whole numbers only.");
        int length = input.nextInt();

        System.out.println("What is the width of the rectangle? Please use whole numbers only.");
        int width = input.nextInt();

        System.out.println("The area of this rectangle is " + (length * width));
    }
}
