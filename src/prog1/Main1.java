/*
1. Организовать бесконечный ввод чисел с клавиатури, пока пользователь не введёт 0.
После ввода нуля, показать на экран количество чисел, которые были введены и их общую сумму.
*/
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
	// write your code here

        int val;
        int cnt = 0;
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Введите любое число (0-выход) :");
            val = sc.nextInt();
            sum += val;
            cnt++;
        } while (val != 0);

        System.out.println("Введено : " + cnt + " чисел");
        System.out.println("Их общая сумма: " + sum);


    }
}
