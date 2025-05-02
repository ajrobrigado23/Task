public class Task2 {

    public static void main(String[] args) {
        char capitalH = '\u0048';
        int intNumber = 31;
        byte byteNumber = 0;
        short shortNumber = 10;
        boolean isTrue = true;
        float floatNumber = 2.0f;

        String output = String.format("%1$C%2$d%3$d w%4$drld %5$.1f %6$b", capitalH, intNumber, shortNumber,
                byteNumber, floatNumber, isTrue);
        System.out.println(output);
    }
}
