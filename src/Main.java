public class Main {
    public static void main(String[] args) {
//        int age = 21;
//        if (age > 18) {
//            System.out.println("Можно праздновать");
//            if (age < 21) {
//                System.out.println("Но крепкий алкоголь нельзя!!!");
//            } else {
//                System.out.println("Иди куда хочешь и пей что хочешь");
//            }
//        } else if (age > 7) {
//            System.out.println("Иди в школу");
//        } else {
//            System.out.println("Иди в детский сад");
//        }
//        int age = 16;
//        if (age == 18) {
//            System.out.println("С окончанием школы");
//        } else if (age == 21) {
//            System.out.println("Можно выпивать");
//        } else if (age == 7) {
//            System.out.println("Иди в садик");
//        } else {
//            System.out.println("Пока новостей нет");
//        }
//    char color = 'i';
//
//        if (color == 'r') {
//            System.out.println("Красный");
//        } else if (color == 'y') {
//            System.out.println("Желтый");
//        } else {
//            System.out.println("Зеленый");
//        }
//    switch (color) {
//        case 'r':
//            System.out.println("Красный");
// break;
//        case 'y':
//            System.out.println("Желтый");
//            break;
//        case 'g':
//            System.out.println("Зеленый");
//            break;
//        case 'i':
//            System.out.println("Зеленый налево");
//            break;
//        default:
//            System.out.println("Светофор сломался");
//    }
        System.out.println("Домашняя работа");
        System.out.println("Задача № 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке ->");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке ->");
            // здесь бы проверить что есть и другие ПО, с которыми пользоваться приложением не получится
        } else {
            System.out.println("Программное обеспечение Вашего устройства не позволяет пользовать нашим ПО");
        }
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке ->");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке ->");
                break;
            default:
                System.out.println("Программное обеспечение Вашего устройства не позволяет пользовать нашим ПО");

        }
        // Пробую тернарный оператор, но он обрабатывает только два значения, поэтому третье значение выдаст тоже что и в случае со вторым!!!
        String oS = (clientOS == 0) ? "Установите версию приложения для iOS по ссылке ->" : "Установите версию приложения для Android по ссылке ->";
        System.out.println(oS);

        System.out.println("Задача № 2");
        int year = 2014;
        if (clientOS == 0 && year >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке ->");
        } else if (clientOS == 0 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке ->");
        } else if (clientOS == 1 && year >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке ->");
        } else if (clientOS == 1 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке ->");
        } else {
            System.out.println("Программное обеспечение Вашего устройства не позволяет пользовать нашим ПО");
        }
        System.out.println("Задача № 3");
        int yearV = 1585;
        if (yearV <= 1584) {
            System.out.println("Високосность года не определялась");
        } else if ((yearV % 4 == 0 && yearV % 100 != 0) || yearV % 400 == 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не високосный");
        }
        System.out.println("Самостоятельная работа для понимания логики % и високосности");

        int point = 100;
        if (point % 2 == 0) {
            System.out.println("Число делится на 2");
        }
        if (point % 3 == 0) {
            System.out.println("Число делится на 3");
        }
        if (point % 5 == 0) {
            System.out.println("Число делится на 5");
        }
        if (point%2!=0 && point%3!=0 && point%5!=0) {
            System.out.println("Число не делится ни на 2 ни на 3 ни на 5");
        }

        System.out.println("Кратность");
        if (point % 10 == 0) {
            System.out.println("Число кратно 10");
        } else {
            System.out.println("Число не кратно 10");
        }
        System.out.println("Високосный год - упрощенная");
        int yearTwo = 2026;
        if (yearTwo % 4 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год НЕ високосный");
        }
        System.out.println("Високосный год - с исключением");
        if (yearTwo % 4 == 0 && yearTwo % 100 != 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год НЕ високосный");
        }
        System.out.println("Високосный год - полное правило");
        if ((yearTwo % 4 == 0 && yearTwo % 100 != 0) || yearTwo%400==0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год НЕ високосный");
        }

        System.out.println("Остаток на понимание № 6");
        int point1 = 2;
        if (point1 % 10 == 5) {
            System.out.println("Число оканчивается на 5");
        } else if (point1 % 10 == 0) {
            System.out.println("Число оканчивается на 0");
        } else {
            System.out.println("Число оканчивается на другую цифру");
        }

        System.out.println("Задача № 4");
        int km = 45;
        if (km <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (km <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (km <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }

        System.out.println("Switch");
        int monthNumber = 2;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет");

        }


    }
}



