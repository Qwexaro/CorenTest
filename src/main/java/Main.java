import java.util.Scanner;

public class Main {

    public static int nthRoot(int value, int n) {
        if (value < 0 && n % 2 == 0) {
            System.out.println("Невозможно извлечь четный корень из отрицательного числа");
        }
        int root = 0;
        while (true) {
            int power = 1;
            for (int i = 0; i < n; i++) {
                power *= root;
            }

            if (power == value) {
                if (n % 2 == 0) {
                    System.out.println("Результат: " + -root + "\nИли");
                    return root;
                } else {
                    return root;
                }
            }

            if (power > value) {
                System.out.println("Корень не найден точно");
            }

            root++;
        }
    }

    public static void main(String[] args) {

        System.out.print("Введите число value: ");
        int value = new Scanner(System.in).nextInt();
        System.out.print("Введите степень корня n: ");
        int n = new Scanner(System.in).nextInt();

        int result = nthRoot(value, n);
        System.out.println("Результат: " + result);

    }
}
