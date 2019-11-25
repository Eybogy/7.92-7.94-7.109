/* Задача 7.92. Напишите программу, перемножающую два натураль-
    ных числа, которая не использует операции умножения. */

public class One {
    public static Integer count(int n1, int n2) {
        if (n1 == 1) {
            return n2;
        }
        return count(n1 - 1, n2) + count(1, n2);
    }
}