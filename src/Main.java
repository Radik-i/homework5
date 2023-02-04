public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();


    }

    public static void task1() {
        System.out.println("Задача 1");
        boolean clientOSisIOS = false;   //здесь руками вводить true (iOS) или false (Android)
        short clientOS;
        if (clientOSisIOS == true) clientOS = 0;
        else clientOS = 1;
        if (clientOS == 0) System.out.println("Установите версию приложения для iOS по ссылке");
        else System.out.println("Установите версию приложения для Android по ссылке");
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        boolean clientOSisIOS = false;   //здесь руками вводить true (iOS) или false (Android)
        short clientOS;
        if (clientOSisIOS == true) clientOS = 0;
        else clientOS = 1;
        short clientDeviceYear = 2012;
        if (clientOS == 0 && clientDeviceYear >=2015 ) System.out.println("Установите обычную версию приложения для iOS по ссылке");
        else if (clientOS == 0 && clientDeviceYear <2015 ) System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        else if (clientOS == 1 && clientDeviceYear >=2015 ) System.out.println("Установите обычную версию приложения для Android по ссылке");
        else System.out.println("Установите облегченную версию приложения для Android по ссылке");
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 1900;
        if (year % 400 == 0)  System.out.println(year + " год является високосным");
        else if (year % 4 == 0 && year % 100 !=0) System.out.println(year + " год является високосным");
        else System.out.println(year + " год не является високосным");
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4"); //не хватает "процедуры", на которую всегда можно было бы ссылаться и не переписывать ее все время
        int deliveryDistance = 95;
        int days=1;
        if (deliveryDistance < 20) {days = 1;
             System.out.println("Потребуется дней: "+ days +" на доставку карты");}
        else if (deliveryDistance >= 20 && deliveryDistance <= 60) {days = days +1;
             System.out.println("Потребуется дней: "+ days +" на доставку карты");}
        else if (deliveryDistance > 60 && deliveryDistance <= 100) {days = days +2;
             System.out.println("Потребуется дней: "+ days +" на доставку карты");}
        else System.out.println("Доставка карты не осуществляется");
        System.out.println();
    }
    public static void task5() {
        System.out.println("Задача 5");
        short monthNumber = 12;
        switch (monthNumber){
        case 1: case 2:  case 12: System.out.println("Зима"); break;
        case 3: case 4: case 5: System.out.println("Весна"); break;
        case 6: case 7: case 8: System.out.println("Лето"); break;
        case 9: case 10: case 11: System.out.println("Осень"); break;
        default: System.out.println("Выполнение программы невозможно!!! Введен некорректный номер месяца!!!");}
        System.out.println();
    }

}