import java.util.Scanner;

// Написать программу, которая загадывает случайное целое число из отрезка [1;10]
// и просит пользователя его угадать, вводя варианты с клавиатуры, пока пользователь
// не угадает число, программа будет ему подсказывать, сообщая больше или меньше
// число загаданное, чем то, что ввёл пользователь.
public class Main {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int s = 0;
        int n = (int) (Math.random() * 10 + 1);
        System.out.println(n);
        m1:
        for (int i = 0; 1 < 10; i++) {
            System.out.println("Угадайте число от 1 до 10");
            if (sc.hasNextInt())
                s = sc.nextInt();
            if (n == s) break m1;
            if (n > s) System.out.println("Чуть больше");
            else System.out.println("Чуть меньше");
        }
        System.out.println("Поздравляю Вы угадали число");
    }
}

