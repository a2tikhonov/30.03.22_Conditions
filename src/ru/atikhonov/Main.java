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
        //Задание 6
        System.out.println("Доп задание");
        int age = 19;
        int salary = 58_000;
        int creditLimit;
        if (age >= 23) {
            creditLimit = salary * 3;
        } else creditLimit = salary * 2;
        if (salary >= 50_000) creditLimit *= 1.2;
            else if (salary >= 80_000) creditLimit *= 1.5;
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + creditLimit + " рублей.");
        //Задание 7
        age = 25;
        salary = 60_000;
        int wantedSum = 330_000;
        float interestRate = 10f;
        int loanTerm = 12;
        float maxMonthlyPayment = salary * 0.5f;
        float monthlyPayment;
        if (age < 23) interestRate += 1;
            else if (age < 30 ) interestRate += 0.5;
        if (salary > 80_000) interestRate -= 0.7;
        monthlyPayment = (wantedSum + wantedSum * interestRate / 100) / loanTerm;
        if (monthlyPayment <= maxMonthlyPayment) System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxMonthlyPayment + " рублей." +
                " Платеж по кредиту " + monthlyPayment + " рублей. Одобрено.");
            else System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxMonthlyPayment + " рублей." +
                " Платеж по кредиту " + monthlyPayment + " рублей. Отказано.");
    }
}
