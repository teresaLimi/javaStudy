package base;

public class DataType {
    public static void baseSum() {
        int x = 1;
        System.out.println(x);
        x = 100;
        System.out.println("x=" + x);

        int n = 200;
        x = n;
        x = x + 200;
        System.out.println("x = " + x);
        System.out.println("n = " + n);
    };

    public static int getSum(int sumNum) {
        int sum = ((1 + sumNum) * sumNum) / 2;
        return sum;
    };

    public static void floatSum() {
        double x = 1.0 / 10;
        double y = 1 - 9.0 / 10;
        System.out.println("double x = " + x);
        System.out.println("double y = " + y);

        // 类型提升
        int n = 5;
        double s = n + x;
        System.out.println(s);

        // 溢出
        double d1 = 0.0 / 0;
        double d2 = 1.0 / 0;
        double d3 = -1.0 / 0;
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    };

    public static void sum1(double a, double b, double c) {
        double d = Math.sqrt((b * b) - (4 * a * c));
        double r1 = (d - b) / (2 * a);
        double r2 = (-d - b) / (2 * a);
        System.out.println(r1);
        System.out.println(r2);
        return;
    };

    public static void judge1(int age) {
        String result = age >= 6 && age <= 12 ? "yes" : "no";
        System.out.println(result);
        return;
    }

    public static void sum2(int[] list) {
        String s = "";
        for (int item : list) {
            s += "/u" + item;
        }
        System.out.println(s);
        return;
    }
}
