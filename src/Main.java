import java.util.Locale;
public class Main {

    public static void isLeapYearAndPrint(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год");
        }else System.out.println(year + " - не високосный год");
    }

    public static void checkAndPrintAppsVersion(int clientOS, int year) {
        if (clientOS == 0 && year >= 2015) {
            System.out.println("Установите новую версию IOS по ссылке ...");
        } else if (clientOS == 0 && year < 2015) {
            System.out.println("Установите облегчённую версию IOS по ссылке ...");
        } else if (clientOS == 1 && year < 2015) {
            System.out.println("Установите облегчённую версию Android по ссылке ...");
        } else if (clientOS == 1 && year >= 2015) {
            System.out.println("Установите новую версию Android по ссылке ...");
        } else
            System.out.println("Для вашей ОС нет приложения");

    }

    public static int calculateDeliveryDays(int distance) {
        if (distance <= 20){
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            throw new RuntimeException("Доставка не выполняется");
        }
    }


    public static void main(String[] args) {
        int year = 2015;
        isLeapYearAndPrint(year);
        int clientOS = 0;
        checkAndPrintAppsVersion(clientOS, year);
        int deliveryDistance = 95;
        System.out.println("количество дней на доставку - " + calculateDeliveryDays(deliveryDistance));


    }



}