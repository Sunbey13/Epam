package sunbey;

import java.util.Scanner;
import java.util.Collections;

public class ReverseArguments {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
       reversWord();
       reversArguments();
    }

    private static void reversWord(){
        System.out.print("Введите слово: ");
        StringBuffer arguments = new StringBuffer(in.nextLine());
        System.out.println("Слово на оборот: " + arguments.reverse().toString());
    }

    private static void reversArguments(){

    }
}
