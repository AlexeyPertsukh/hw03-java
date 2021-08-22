/*

5. Вывести на экран ряд чисел Фибоначчи, состоящий из n элементов. N задаёт до какого числа вести расчёт. N  Задаётся пользователем.
Числа Фибоначчи – это элементы числовой последовательности 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, …,
в которой каждое последующее число равно сумме двух предыдущих.

 */

import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
	// write your code here

        int val0=0;
        int val1=0;
        int val2=0;

        int n;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Введите количество чисел фибаначи: ");
            n = sc.nextInt();
        }while(n < 1);

        for (int i = 0; i < n; i++) {
            val0 = val1;
            val1 = val2;

            if (i < 2)
                val2 = i;
            else
                val2 = val0 + val1;

            System.out.println(val2);

        }




    }
}
