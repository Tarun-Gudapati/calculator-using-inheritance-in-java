class BasicCalculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

public class Calculator {
    public static void main(String[] args) {
        VeryAdvancedCal b = new VeryAdvancedCal();
        int a = b.add(1, 2);
        int s = b.sub(6, 5);
        int m = b.mul(5, 7);
        int d = b.div(77, 11);
        int p = b.pow(7, 2);
        System.out.printf("%d , %d, %d, %d ,%d", a, s, m, d, p);
    }
}
