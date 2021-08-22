/*
4. Написать программу «Неголливудская стрельба».

Пользователь выбирает один из 3-х пистолетов:
1 - пистолет Макарова образца 1994 года (ёмкость обоймы 12 патронов),
2 – Glock 17 (ёмкость обоймы 17 патронов),
3 - Colt M1911 – (ёмкость обоймы 8).

Далее пользователь вводит число обойм, которые он собирается расстрелять.
После этого программа имитирует режим непрерывной стрельбы, выводя на экран слово «Выстрел!».
Когда заканчивается очередная обойма, программа выводит на экран слово «Перезарядка».
Когда все боеприпасы выводит сообщение «Боеприпасы закончились».
* */

import java.util.Random;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
	// write your code here

    final int   MAX_CLIP = 5;

    int gunType, gunClip;
    int gunCartrige=0;
    int gunCartrigeCurrent;
    int cntShot;

    Scanner sc = new Scanner(System.in);
    final Random random = new Random();

    do{
        System.out.println("Введите тип пистолета:");
        System.out.println("1 - Макаров обр. 1994 г. (12 патронов)");
        System.out.println("2 – Glock 17 (17 патронов)");
        System.out.println("3 - Colt M1911  (8 патронов)");

        gunType = sc.nextInt();
    }while(gunType < 1 || gunType > 3 );

    //Определяем кол-во патронов на обойму
    switch (gunType)
    {
        case 1:
            gunCartrige = 12;
            break;

        case 2:
            gunCartrige = 17;
            break;
        case 3:
            gunCartrige = 8;
            break;
        default:
            break;
    }

        //вводим кол-во обойм
     do{
         System.out.println("Введите количество обойм:");

         gunClip = sc.nextInt();

         if(gunClip > MAX_CLIP )
            System.out.println("Хочешь оставить Красную Армию без патронов? На складе только " + MAX_CLIP + " обойм.");

      }while(gunClip < 1 || gunClip > MAX_CLIP );

    //стреляем
        for (int i = 1; i <= gunClip; i++)
        {

            gunCartrigeCurrent = gunCartrige;   //патронов по полной

            System.out.println("Обойма " + i);

            cntShot = 0;        //счетчик выстрелов

            //стреляем, пока есть патроны в обойме
            do
            {
                cntShot++;             //сделали выстрел

                if( random.nextInt(20) != 13)     //есть шанс осечки
                    System.out.print(cntShot + ". Выстрел!  ");
                else
                    System.out.print(cntShot + ". осечка...  ");

                gunCartrigeCurrent--;   //списали патрон

                if (cntShot % 6 == 0 || cntShot % gunCartrige == 0)
                    System.out.println();

            }while(gunCartrigeCurrent > 0);

            System.out.println();


            if(i < gunClip)      //есть еще обоймы?
              System.out.println( "Перезарядка");
        }

        System.out.println("Боеприпасы закончились");

    }
}
