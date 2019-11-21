import java.util.Scanner;

/* Задача 7.94. Напишите программу, вводящую целое число a и нату-
ральное n, вычисляющую и печатающую a в степени n без использования вызова функции возведения в степень. */

public class Two {
    public static void count(int a, int n, int result) {
        if (n == 0) {
            System.out.println(result);
        } else {
            result *= a;
            count(a, n - 1, result);
        }
    }
   static void degree() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = in.nextInt();
        System.out.println("Введите второе число");
        int n = in.nextInt();
        int counter = n;
        int result = 1;
        count(a, n, result);
    }
}