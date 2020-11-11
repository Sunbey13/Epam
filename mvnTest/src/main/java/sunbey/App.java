package sunbey;

import java.util.Scanner;

class LearnMain {

    public static void main(String[] args){

        //1.     Приветствовать любого пользователя при вводе его имени через командную строку.
        Scanner in = new Scanner(System.in);
        System.out.print("\n ---------- Task1 ----------\nВведите Ваше имя: ");
        String name = in.nextLine();
        System.out.println("Доброе время суток, " + name);

        //2.     Отобразить в окне консоли аргументы командной строки в обратном порядке.

        Scanner rev = new Scanner(System.in);
        System.out.print("\n ---------- Task2 ----------\nВведите значения аргументов: ");
        StringBuffer obr = new StringBuffer(rev.nextLine());
        obr.reverse();
        System.out.println("Обратный порядок аргументов: " + obr.toString());

        //3.     Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

        Scanner kolvoIn = new Scanner(System.in);
        System.out.print("\n ---------- Task3 ----------\nВведите количество случайных чисел: ");
        int kolvo = kolvoIn.nextInt();
        int i = 0;
        double randNum;
        System.out.println("\nВывод чисел в строку: ");
        for (i = 0; i < kolvo; i++){
            randNum = Math.random()*20;
            System.out.print(randNum + ", ");
        }
        System.out.println("\nВывод чисел в столбец: ");
        for (i = 0; i < kolvo; i++){
            randNum = Math.random()*20;
            System.out.println(1+i + "-e число: " + randNum);
        }

        //4.     Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.

        Scanner num = new Scanner(System.in);
        System.out.print("\n ---------- Task4 ----------\nВведите первое целое число: ");
        int x = num.nextInt();
        System.out.print("Введите второе целое число: ");
        int y = num.nextInt();
        System.out.println("Сумма чисел = " + (x + y));
        System.out.println("Произведение чисел = " + (x * y));

        //5.   Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
    }
}


