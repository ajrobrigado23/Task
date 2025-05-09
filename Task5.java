import java.util.Scanner;

// Check whose largest number in 3 inputs
public class Task5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] userNumbersArray = new int[3];
        int userNumber = 0;
        int largestNumber = -1;
        int maxLength = userNumbersArray.length;

        for (int i = 0 ; i < maxLength; i ++) {
            System.out.print("Enter a number: ");
            userNumber = input.nextInt();
            userNumbersArray[i] = userNumber;
            if (userNumbersArray[i] > largestNumber) {
                largestNumber = userNumbersArray[i];
            }
        }

        input.close();

        String output = (largestNumber == userNumbersArray[1] && largestNumber == userNumbersArray[maxLength - 1]) ?
                "All numbers are equal" : "Largest Number: %d".formatted(largestNumber);

        System.out.println(output);
    }
}
