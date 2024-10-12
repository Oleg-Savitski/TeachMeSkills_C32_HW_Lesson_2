package com.techmeskills.lesson_2;


/** Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
 * Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold».
 */

public class Task_2_Lesson_2 {
    public static void main(String[] args) {
        int temperature = -21;
        if (temperature >= -5) {
            System.out.println("Warm.");

        } else if (-5 >= temperature && temperature >= -20) {
            System.out.println("Normal.");

        } else if (temperature <= -20) {
            System.out.println("Cold.");
        }
    }
}

