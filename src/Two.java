/* Задача 7.94. Напишите программу, вводящую целое число a и нату-
    ральное n, вычисляющую и печатающую a в степени n без использования вызова функции возведения в степень. */

public class Two {
    public static Integer count(int a, int n, int result) {
        if (n == 0) {
            return result;
        }
        result *= a;
        return count(a, n - 1, result);
    }
}