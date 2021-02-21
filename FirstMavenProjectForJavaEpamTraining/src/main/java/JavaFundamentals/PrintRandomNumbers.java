package JavaFundamentals;

import java.util.Scanner;

public class PrintRandomNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество случайных чисел: ");
        int howNumbers = in.nextInt();

        double randNum = Math.random()*20;

        System.out.println("Вывод чисел в строку: ");
        for (int i = 0; i < howNumbers; i++){
            System.out.print(randNum + ", ");
        }

        System.out.println("\nВывод чисел в столбец: ");
        for (int i = 0; i < howNumbers; i++){
            System.out.println(randNum);
        }
    }
}
