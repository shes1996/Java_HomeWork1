//Реализовать простой калькулятор (+ - / *)
//        Ввод числа ->
//        Ввод знака ->
//        Ввод числа ->

import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        Scanner act = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);

        System.out.printf("enter the number (ex: 5 or 5,2):  ");
        while (num1.hasNextDouble() != true) {
            System.out.println("Incorrect number");
            num1 = new Scanner(System.in);
        }
        double x = num1.nextDouble();

        System.out.printf("enter the action +, -, * or /: ");
        String action = act.nextLine();

        System.out.printf("enter the number (ex: 5 or 5,2): ");
        while (num2.hasNextDouble() != true) {
            System.out.println("Incorrect number");
            num2 = new Scanner(System.in);
        }
        double y = num2.nextDouble();

        if (action.contains("+")) {
            System.out.println(x + y);
        } else if (action.contains("-")) {
            System.out.println(x - y);
        } else if (action.contains("*")) {
            System.out.println(x * y);
        } else if (action.contains("/")) {
            System.out.println(x / y);
        } else System.out.println("Incorrect symbol");

    }
}