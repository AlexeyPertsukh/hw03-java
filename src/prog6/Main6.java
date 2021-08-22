/*
6. Написать программу, возводящую любое заданное пользователем число в любую заданную степень
(чтобы возвести число в степень – его нужно умножать само на себя).
Для возведения во вторую степень – умножать 1 раз, для третьей степени – 2 раза и так далее.
*/

import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {
	// write your code here
    int val, degree, result;

    Scanner sc = new Scanner(System.in);

    System.out.println("Введите число: ");
    val = sc.nextInt();

    do {
        System.out.println("Введите степень: ");
        degree = sc.nextInt();
    } while(degree < 1);            // Нулевая степень зло: https://scienceland.info/algebra7/degree-zero

    result = val;

    for (int i = 1; i < degree; i++)
      result *= val;

    System.out.println(val + "^" + degree + " = " + result);

    }
}
