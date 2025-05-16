package TaskIV;

public class Task9 {

    public static void main(String[] args) {

        try {
            System.out.println(add(2147483640, 8));
        } catch (ArithmeticException e) {
            System.out.println("Overflow!!!");
        }

    }

    public static int add(int a, int b) {
        return Math.addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return Math.subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return Math.multiplyExact(a, b);
    }

    public static float divide(int a, int b) {
        return Math.floorDiv(a, b);
    }
}
