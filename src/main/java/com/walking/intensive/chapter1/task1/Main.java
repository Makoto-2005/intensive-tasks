package com.walking.intensive.chapter1.task1;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Рекорд долгожительства на данный момент составляет 127 лет. Введите Ваш возраст: ");
        int age = in.nextInt();

        in.close();
        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {

        if (age < 0 || age > 127) {
            return "Проверьте правильность введённых данных либо обратитесь в Книгу Рекордов Гинесса.";
        }
        if (age % 100 >= 11 && age % 100 <= 19) {
            return "Вам " + age + " лет";
        }
        if (age % 10 >= 2 && age % 10 <= 4) {
            return "Вам " + age + " года";
        }
        if (age % 10 == 1) {
            return "Вам " + age + " год";
        }
        return "Вам " + age + " лет";
    }
}