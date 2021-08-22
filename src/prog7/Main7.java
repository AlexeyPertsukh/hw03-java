/*
7. Вычислить факториала введённого числа.
Факториал числа представляет собой произведение всех натуральных чисел от 1 до этого числа включительно.
Например, факториал числа 7 выглядит так: 1 * 2 * 3 * 4 * 5 * 6 * 7
*/

import java.util.Scanner;

public class Main7 {

    public static void main(String[] args) {
	// write your code here
        int val;
        int result=1;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Введите число для расчета факториала: ");
            val = sc.nextInt();
        }while ( val < 1);

        for (int i = 1; i <= val; i++)
            result *= i;

        System.out.println("Факториал " + val + " = " + result );

    }
}
