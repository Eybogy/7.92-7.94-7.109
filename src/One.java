import java.util.Scanner;

/* Задача 7.92. Напишите программу, перемножающую два натураль-
ных числа, которая не использует операции умножения. */

public class One {
    public static void count(int n1, int n2, int result) {
        if (n1 == 0) {
            result += 0;
            System.out.println(result);
        } else {
            result += n2;
            count(n1 - 1, n2, result);
        }
    }

    static void multiplication() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int n1 = in.nextInt();
        System.out.println("Введите второе число");
        int n2 = in.nextInt();
        int result = 0;
        count(n1, n2, result);
    }
}