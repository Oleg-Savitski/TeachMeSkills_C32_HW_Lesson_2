package com.techmeskills.lesson_2;

/**Необходимо, чтоб программа выводила на экран вот такую последовательность:
 * 7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.
 */

public class Task_4_Lesson_2 {
    public static void main(String[] args) {
        int num = 7;
        while (num <= 98) {
            System.out.println(num);
            num += 7;
        }
        System.out.println("The cycle is over.");
    }
}
