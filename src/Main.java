public class Main {
    public static void main(String[] args) {

        // 1.6 Массивы ч.2

        int[] arr = generateRandomArray();
        // Проверить массив создался ли
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println (arr[i] +", ");
        }
        System.out.println (arr[arr.length - 1]);

        // Задание 1
        System.out.println ();
        System.out.println ("     Задание 1");
        int summa = 0;
        for (int i = 0; i < arr.length; i++) {
            summa = summa + arr[i];
        }
        System.out.println ("Сумма трат за месяц составила " + summa + " рублей");
        System.out.println ("   Готово");


        // Задание 2
        System.out.println ();
        System.out.println ("     Задание 2");
        int minR = 200000;
        int maxR = 100000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= minR) minR = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= maxR) maxR = arr[i];
        }
        System.out.println ("Минимальная сумма трат за день составила " + minR + " рублей.");
        System.out.println ("Максимальная сумма трат за день составила " + maxR + " рублей.");
        System.out.println ("   Готово");

        // Задание 3
        System.out.println ();
        System.out.println ("     Задание 3");
        double middle = summa / 30d;
        System.out.println ("Средняя сумма трат за месяц составила " + middle + " рублей.");
        System.out.println ("   Готово");

        // Задание 4
        System.out.println ();
        System.out.println ("     Задание 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print (reverseFullName[i]);
        }
        System.out.println ();
        System.out.println ("   Готово");


    }



    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}