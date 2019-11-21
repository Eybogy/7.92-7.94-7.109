/* Задача 7.109. Напишите программу, находящую наибольший общий
    делитель gcd(X, Y) двух натуральных чисел X и Y . */

public class Three {
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
