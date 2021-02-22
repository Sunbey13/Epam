package JavaFundamentals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ReverseArguments {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
       reversWord();
       chooseOperation();
    }

    private static void reversWord(){
        System.out.print("Введите слово: ");
        StringBuffer arguments = new StringBuffer(in.nextLine());
        System.out.println("\"Перевернутое\" слово: " + arguments.reverse().toString());
    }

    private static ArrayList<String> arguments = new ArrayList<>();

    private static void chooseOperation(){
        System.out.print("\n1 - Добавить аргумент"+
                "\n2 - Вывод аргументов в обратном порядке"+
                "\n3 - Выход"+
                "\nВыберите действие: ");
        int operation = in.nextInt();
        switch (operation){
            case 1:
               addArgument();
               break;
            case 2:
                reversArguments();
                break;
            case 3:
                break;
            default:
                System.out.println("\n= = = Некорректный выбор действия! = = =");
                chooseOperation();
        }
    }

    private static void addArgument(){
        System.out.print("\nВведите аргумент: ");
        String argument = in.next();
        arguments.add(argument);
        chooseOperation();
    }

    private static void reversArguments(){
        System.out.println("\nВывод по порядку: " + arguments.toString());
        int arraySize = arguments.size();
        String argumentsArray[] = arguments.toArray(new String[arraySize]);
        System.out.print("Вывод в обратном порядке: ");
        for (int i = argumentsArray.length; i > 0 ; i--) {
            System.out.print(argumentsArray[i-1] + "; ");
        }
        chooseOperation();
    }
}
