import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 - задание 7.92, 2 - задание 7.94, 3 - задание 7.109");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x == 1) {
            One a = new One();
            a.multiplication();
        } else if (x == 2) {
            Two b = new Two();
            b.degree();
        } else if (x == 3) {
            Three c = new Three();
        }


    }
}
