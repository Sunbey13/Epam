package MainTask;

import java.util.Scanner;

public class FindNameOfMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final String arrayMonth[] = {"январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};

        System.out.print("Введите номер месяца: ");
        int numMonth = in.nextInt();
        if (numMonth > 0 && numMonth < 13){
            System.out.println(numMonth + "-м месяцем является " + arrayMonth[numMonth - 1]);
        } else {
            System.out.println("Данные некорректны!");
        }
    }
}
