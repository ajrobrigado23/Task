import java.util.Scanner;

public class Number {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number >= 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }

        String output = (number % 2 == 0) ? "Even number" : "Odd Number";
        System.out.println(output);
    }
}
