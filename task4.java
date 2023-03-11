//Задано уравнение вида q + w = e, q, w, e >= 0.
//Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69 (пользователь).
//Требуется восстановить выражение до верного равенства.
//Предложить хотя бы одно решение или сообщить, что его нет.
//Ввод: 2? + ?5 = 69
//Вывод: 24 + 45 = 69

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        System.out.print("Введите уравнение, например, 2? + ?5 = 69 ");
        Scanner eq = new Scanner(System.in);
        String equals = eq.nextLine();
        System.out.println(equals);
        String strWoSpace = equals.replaceAll(" ", "");
        String[] list = strWoSpace.split("[+=]");

        StringBuilder myNumbers = new StringBuilder();
        int answ = Integer.parseInt(list[list.length - 1]);
        int countQues = 0;
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list[i].length(); j++) {
                if (Character.isDigit(list[i].charAt(j))) {
                    int digit = Integer.parseInt(String.valueOf((list[i].charAt(j))));
                    answ = (int) (answ - digit * Math.pow(10, list[i].length() - j - 1));
                } else countQues += 1;
            }
        }

        if (countQues == 4) {
            answ /= 2;
        }
        String lastSymb;
        int term1;
        int term2;
        boolean existing = false;
        int compare = Integer.parseInt(list[2]);
        while (answ > 0) {
            lastSymb = Integer.toString(answ % 10);
            term1 = Integer.parseInt(list[0].replace("?", lastSymb));
            term2 = Integer.parseInt(list[1].replace("?", lastSymb));
            if (term1 + term2 == compare) {
                System.out.println(equals.replace("?", lastSymb));
                existing = true;
                break;
            }

            answ = answ / 10;
        }

        if (existing == false) System.out.println("Такого выражения не существует");
    }
}