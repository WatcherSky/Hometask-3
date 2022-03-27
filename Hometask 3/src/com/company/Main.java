package com.company;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class Main {

    public static void main(String[] args) {
        // task 1)
        int a = 15;
        int b = 10;
        int c = 40;
        if ((a + b < c) || (a + c < b) || (b + c < a)) {
            System.out.println("Triange not exist");
        } else {
            System.out.println("Triange exist");
        }

        // 2
        int number = 0;
        if (number > 0) {
            number += 1;
            System.out.println(number);
        } else if (number < 0) {
            number -= 2;
            System.out.println(number);
        } else {
            number = 10;
            System.out.println(number);
        }

        //3 Сделал до 10. Могут быть случи 1001 программист, 2002 программиста, 10127 программистов) В теории, наверно, нужно разбирать число и смотреть последнее.
        int num = 5;
        String sNumber = String.valueOf(num);
        if (num == 1) {
            System.out.println("У нас " + sNumber + " программист");
        } else if (num >= 2 && num <= 4) {
            System.out.println("У нас " + sNumber + " программиста");
        } else if (num >= 5 && num <= 10) {
            System.out.println("У нас " + sNumber + " программистов");
        } else if (num <= 0) {
            System.out.println("У нас нет программистов");
        } else {
            System.out.println("Нету данных о правильном окончании. Используйте английский язык. ");
        }

        //4
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};


        for (int i=0; i<arr.length; i++ ){
            System.out.print(arr[i]+" ");
        }
        for (int i=0; i<arr.length; i++ ){
            System.out.println(arr[i]);
        }

        //5
        Random r = new Random();
        int[] arr1 = new int[15];
        int counter = 0;
        for(int i = 0; i < arr1.length; i++) {

            int result = r.nextInt(99);

            arr1[i] = result;
            if (result == 0) {
                continue;
            } else if (result % 2 == 0) {
                counter += 1;
            }

            System.out.print(arr1[i]+ " ");
            if (i == 14) {
                System.out.print("\n" );
                System.out.print(counter);
            }
        }

        //6
        System.out.println("\n" + "Задание 6" );

        int[] arr2 = new int[12];
//        for(int i = 0; i < arr2.length; i++) {
//            int resultForSixthTask = r.nextInt(15);
//            arr2[i] = resultForSixthTask;
//            System.out.print(arr2[i]+ " ");
//        }
        System.out.println("\n");
        int largest = 0;

        arr2 = new int[]{1, 3, 4, 7, 3, 6, 7};
        for ( int i = 1; i < arr2.length; i++ )
        {
            if ( arr2[i] >= arr2[largest] ) largest = i;
        }
        System.out.println(largest);  //Индекс наибольшего элемента
   }
}