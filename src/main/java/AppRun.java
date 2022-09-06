import static base.DataType.*;

public class AppRun {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // 基础
        baseSum();

        // 整数运算
        int resultNum = getSum(10);
        System.out.println(resultNum);

        // 浮点数运算
        floatSum();

        // 计算出一元二次方程的两个解
        sum1(1.0, 3.0, -4.0);

        // 判断指定年龄是否是小学生（6～12岁)
        judge1(5);  // no
        judge1(12); // yes

        // 将一组int值视为字符的Unicode编码，然后将它们拼成一个字符串
        sum2(new int[]{72, 105, 65281});

        // 创建数组
        creatArr();
    }
}
