public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Первое задание
        int clientOS = 1;
        if (clientOS < 2) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        //Второе задание
        int productionYear = 2015;
        int clientDeviceYear = 2014;
        int otherUsers = 2022;
        int clientOSIos = 0;
        int clientOSIAndroid = 1;
        if (clientDeviceYear < productionYear && clientOSIos < 1) {
            System.out.println("Установите облегченную версию приложения для iOS");
        }
        if (clientDeviceYear < productionYear && clientOSIAndroid == 1) {
            System.out.println("Установите облегченную версию приложения для Android");
        }
        if (otherUsers > productionYear) {
            System.out.println("Установите приложение");
        }
        //третье задание
int year = 2021;
        if (year%4==0 && year%100!=0 || year%400==0) {
        System.out.println("Год является високосным");
    }
    else{
        System.out.println("Год не является високосным");
    }
    //Четвертое задание
        int deliveryDistance = 95;
    int deliveryDay = 1;
    if (deliveryDistance <=20){
        System.out.println("Потребуется " + deliveryDay + " день доставки");
    } else if (deliveryDistance >=20 && deliveryDistance <=60){
        System.out.println("Потребуется " + (deliveryDay + 1) + " день доставки");
    }else {
        System.out.println("Потребуется " + (deliveryDay + 2) + " дня доставки");
    }
    //Пятое задание
   int monthNumber = 1;
    switch (monthNumber){
        case 1:
            System.out.println("Зима");
            break;
        case 2:
            System.out.println("Зима");
            break;
        case 3:
            System.out.println("Весна");
            break;
        case 4:
            System.out.println("Весна");
            break;
        case 5:
            System.out.println("Весна");
            break;
        case 6:
            System.out.println("Лето");
            break;
        case 7:
            System.out.println("Лето");
            break;
        case 8:
            System.out.println("Лето");
            break;
        case 9:
            System.out.println("Осень");
            break;
        case 10:
            System.out.println("Осень");
            break;
        case 11:
            System.out.println("Осень");
            break;
        case 12:
            break;
        default:
    System.out.println("Такого месяца нет");
}
    }
    }