package com.techmeskills.lesson_2;

import java.util.Scanner;

/** Напишите программу, где пользователь вводит любое целое положительное число. А
 * программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
 * числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
 * ввести некорректные данные.
 */

public class Task_5_Star_Lesson_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num < 0) {
            System.out.println("Invalid number.");

        } else {
            int sum = 0;
            for (int i = 1; i <= num; i++) {
                sum += i;
            }
            System.out.println("The sum of the numbers: " + sum);

        }
    }
}
