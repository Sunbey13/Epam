package sunbey;

import java.util.Scanner;

public class FindSummArguments {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое целое число: ");
        int x = in.nextInt();

        System.out.print("Введите второе целое число: ");
        int y = in.nextInt();

        System.out.println("Сумма чисел: " + summArguments(x,y) + "\nПроизведение чисел: " + proizvArguments(x,y));
    }

    private static int summArguments(int x, int y){
        return (x + y);
    }

    private static int proizvArguments(int x, int y){
        return (x * y);
    }
}
