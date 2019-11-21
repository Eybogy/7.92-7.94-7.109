import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 - задание 7.92, 2 - задание 7.94, 3 - задание 7.109");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x == 1) {
            System.out.println("Введите первое число");
            int n1 = in.nextInt();
            System.out.println("Введите второе число");
            int n2 = in.nextInt();
            int result = 0;
            System.out.println(One.count(n1, n2, result));
        } else if (x == 2) {
            System.out.println("Введите первое число");
            int a = in.nextInt();
            System.out.println("Введите второе число");
            int n = in.nextInt();
            int result = 1;
            System.out.println(Two.count(a, n, result));
        } else if (x == 3) {
            System.out.println("Введите первое число");
            int a = in.nextInt();
            System.out.println("Введите второе число");
            int b = in.nextInt();
            System.out.println(Three.gcd(a, b));
        }
    }
}
