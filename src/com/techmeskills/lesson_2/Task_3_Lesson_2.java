package com.techmeskills.lesson_2;

/** Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.
 */

public class Task_3_Lesson_2 {
    public static void main (String[] args) {
        int x;
        for (int y = 10; y <= 20; y++) {
            x = y * y;
            System.out.println(x);
            }
            System.out.println("The calculation is completed.");
        }
    }
