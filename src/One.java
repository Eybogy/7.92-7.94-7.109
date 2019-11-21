import java.util.Scanner;

/* Задача 7.92. Напишите программу, перемножающую два натураль-
ных числа, которая не использует операции умножения. */

public class One {
    public static Integer count(int n1, int n2, int counter) {
        if (n2 != 0){
            return n2;
        }
        return 1;
    }

    static void multiplication() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int n1 = in.nextInt();
        int counter = n1;
        System.out.println("Введите второе число");
        int n2 = in.nextInt();
        int result = 0;
        while (counter != 0) {
            result += count(n1, n2, counter);
            counter -= 1;
        }
        System.out.println(result);
    }
}