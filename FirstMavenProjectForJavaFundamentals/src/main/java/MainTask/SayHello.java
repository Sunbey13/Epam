package MainTask;

import java.util.Scanner;

public class SayHello {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите Ваше имя: ");
        String name = in.nextLine();
        System.out.println("Доброе время суток, " + name);
    }
}
