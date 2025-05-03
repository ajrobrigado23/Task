import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder reverseString = new StringBuilder();
        String input = scanner.nextLine();
        reverseString.append(input);
        reverseString.reverse();

        String output = reverseString.toString().equals(input) ? "The input string is a palindrome" :
                "The input string is not a palindrome" ;
        System.out.println(output);
    }
}
