 import java.util.Random;
import java.util.Scanner;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(101);

        Scanner in = new Scanner(System.in);

        int num;

        do {
            System.out.println("Введите число:");
            num = in.nextInt();

            if (num == randomNumber) {
                System.out.println("Правильно!");
            } else if (num < randomNumber) {
                System.out.println("Я сам в шоке, но, загаданное число больше, брат");
            } else if (num > randomNumber) {
                System.out.println("Не ожидал от тебя такого. Загаданное число меньше, брат");
            }

        }while (num!=randomNumber);

        in.close();
    }
}
