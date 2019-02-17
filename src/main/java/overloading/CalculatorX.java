package overloading;

public class CalculatorX {

    public static int add(int a, int b, int c) {
        return a + b + c;
    }


    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int subtract(int a, int b, int c) {
        return a - (b + c);
    }
}
