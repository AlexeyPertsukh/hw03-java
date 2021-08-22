/*
Написать программу, которая выводит полную таблицу умножения (от 1 * 1 до 10 * 10).
Таблица умножения должна быть сгруппирована по первому множителю
(сначала 1 умножается на числа с 1 по 10, далее 2 умножается на числа с 1 по 10 и так далее).
*/

import java.util.Scanner;

public class Main2_3 {

    public static void main(String[] args) {
	// write your code here

        final int   MAX_LNG=9;
        int         cellValue;
        int         type;
        String      typeStr;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("введите: 0-таблица пифагора, 1-таблица умножения: ");
            type = sc.nextInt();
        } while(type < 0 || type > 1);

        typeStr = (type==0) ? "Таблица пифагора" : "Таблица умножения";
        System.out.println("  "+typeStr);

        for (int i = type; i <= MAX_LNG + type ; i++)
        {
            for (int j = type; j <= MAX_LNG + type; j++)
            {

                if( i == 0)             //нюансы для таблицы пифагора
                    cellValue = j;
                else if( j == 0)
                    cellValue = i;
                else
                    cellValue = j * i;

                if (cellValue < 10)              //форматируем, как умеем
                    System.out.print("  ");
                else if (cellValue < 100)
                    System.out.print(" ");

                System.out.print( cellValue + "   ");    //выводим значение ячейки таблицы
            }

            System.out.println();
        }

    }
}
