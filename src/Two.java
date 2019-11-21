import java.util.Scanner;

/* Задача 7.94. Напишите программу, вводящую целое число a и нату-
ральное n, вычисляющую и печатающую a в степени n без использования вызова функции возведения в степень. */

public class Two {
    public static Integer count(int n) {
        if (n != 0) {
            return n;
        }
        return  0;
    }

    static void degree() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = in.nextInt();
        int counter = a;
        System.out.println("Введите второе число");
        int n = in.nextInt();
        int result = 1;
        while (counter != 0) {
            result *= count(n);
            counter -= 1;
        }
        System.out.println(result);
    }
}