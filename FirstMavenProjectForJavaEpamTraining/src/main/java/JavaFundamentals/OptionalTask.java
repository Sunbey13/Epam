package JavaFundamentals;

import java.util.Scanner;

public class OptionalTask {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите число N чисел: ");
        int howNumbers = in.nextInt();

        String arrayNumbers[] = new String[howNumbers];

        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.print("Введите " + (i+1) + "-е число: ");
            arrayNumbers[i] = in.next();
        }

        printNumbersMinLength(arrayNumbers);
        printNumbersMaxLength(arrayNumbers);
        printWithIncreaseLength(arrayNumbers, findMinLength(arrayNumbers), findMaxLength(arrayNumbers));
        System.out.println("\nСредняя длина чисел: " + findAverageLength(findMinLength(arrayNumbers), findMaxLength(arrayNumbers)));
        printWordLessAverageLength(arrayNumbers);
        printWordMoreAverageLength(arrayNumbers);
    }

    private static int findMinLength(String arrayNumbers[]){
        int minLength = arrayNumbers[0].length();
        for (int i = 0; i < arrayNumbers.length; i++) {
            if(arrayNumbers[i].length() < minLength){
                minLength = arrayNumbers[i].length();
            }
        }
        return minLength;
    }

    private static void printNumbersMinLength(String arrayNumbers[]){
        for (String number: arrayNumbers) {
            if(number.length() == findMinLength(arrayNumbers)){
                System.out.println("Число наименьшей длины: " + number + "(длина: " + findMinLength(arrayNumbers) + ")");
            }
        }
    }

    private static int findMaxLength(String arrayNumbers[]) {
        int maxLength = arrayNumbers[0].length();
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i].length() > maxLength) {
                maxLength = arrayNumbers[i].length();
            }
        }
        return maxLength;
    }

    private static void printNumbersMaxLength(String arrayNumbers[]){
        for (String number : arrayNumbers) {
            if (number.length() == findMaxLength(arrayNumbers)) {
                System.out.println("Число наибольшей длины: " + number + "(длина: " + findMaxLength(arrayNumbers) + ")");
            }
        }
    }

    private static void printWithIncreaseLength(String[] arrayNumbers, int minLength, int maxLength){
        System.out.println("\nЧисла по увеличению длины:");
        for (int j = minLength; j <= maxLength; j++) {
            for (int i = 0; i < arrayNumbers.length; i++) {
                if (arrayNumbers[i].length() == j){
                    System.out.println(arrayNumbers[i]);
                }
            }
        }
    }

    private static int findAverageLength(int minLength, int maxLength){
       return (minLength + maxLength)/2;
    }

    private static void printWordLessAverageLength(String arrayNumbers[]){
        System.out.println("\nЧисла длиной меньше средней:");
        for (int i = 0; i < arrayNumbers.length; i++) {
            if(arrayNumbers[i].length() < findAverageLength(findMinLength(arrayNumbers), findMaxLength(arrayNumbers))){
                System.out.println(arrayNumbers[i] + "(длина: " + arrayNumbers[i].length() + ")");
            }
        }
    }

    private static void printWordMoreAverageLength(String arrayNumbers[]){
        System.out.println("\nЧисла длинной больше средней:");
        for (int i = 0; i < arrayNumbers.length; i++) {
            if(arrayNumbers[i].length() >= findAverageLength(findMinLength(arrayNumbers), findMaxLength(arrayNumbers))){
                System.out.println(arrayNumbers[i] + "(длинна: " + arrayNumbers[i].length() + ")");
            }
        }
    }
}
