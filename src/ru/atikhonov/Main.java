package ru.atikhonov;

public class Main {

    public static void main(String[] args) {
        //Задание 1
        byte clientOS = 1;
        if (clientOS == 1) System.out.println("Установите версию приложения для Android по ссылке");
            else System.out.println("Установите версию приложения для iOS по ссылке");
        //Задание 2
        short clientDeviceYear =  2014;
        if (clientOS == 1 && clientDeviceYear >= 2015) System.out.println("Установите версию приложения для Android по ссылке");
            else if (clientOS == 1 && clientDeviceYear < 2015) System.out.println("Установите облегченную версию приложения для Android по ссылке");
        if (clientOS == 0 && clientDeviceYear >= 2015) System.out.println("Установите версию приложения для iOS по ссылке");
            else if (clientOS == 0 && clientDeviceYear < 2015) System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        //Задание 3
        short year = 3308;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) System.out.println(year + " год является високосным");
            else System.out.println(year + " год не является високосным");
        //Задание 4
        short deliveryDistance = 95;
        short deliveryDays = 1;
        if (deliveryDistance >= 20 && deliveryDistance < 60) deliveryDays += 1;
            else if (deliveryDistance >= 60 && deliveryDistance <= 100) deliveryDays += 2;
        System.out.println("Потребуется дней: " + deliveryDays);
        //Задание 5
        byte  monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber + " месяц принадлежит зиме");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " месяц принадлежит весне");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " месяц принадлежит лету");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " месяц принадлежит осени");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}
