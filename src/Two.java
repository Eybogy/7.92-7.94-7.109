/* Задача 7.94. Напишите программу, вводящую целое число a и нату-
    ральное n, вычисляющую и печатающую a в степени n без использования вызова функции возведения в степень. */

public class Two {
    public static Integer count(int a, int n) {
        if (n == 1) {
            return a;
        }
        return count(a, n - 1) * count(a, 1);
    }
}