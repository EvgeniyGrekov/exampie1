public class Main {
    public static void main(String[] args) {

//      1.4 Циклы
        System.out.println ();
        System.out.println ("     1.4. Циклы");

        // Задание 1
        System.out.println ();
        System.out.println ("     Задание 1");
        int nomber = 1;
        while (nomber < 11) {
            System.out.print (nomber + " ");
            nomber ++;
        }
        System.out.println ();
        for (int i = nomber - 1; i > 0; i--) {
            System.out.print (i + " ");
        }
        System.out.println ();
        System.out.println ("   Готово");

        // Задание 2
        System.out.println ();
        System.out.println ("     Задание 2");
        int firstFriday = 5;
        int monthDay = 31;
        for (int i = firstFriday; i < monthDay; i = i + 7) {
            System.out.println ("Сегодня пятница " + i +  "-е число. Необходимо подготовить отчет.");
        }
        int friday = 5;
        while (friday < monthDay) {
            System.out.println ("Сегодня пятница " + friday +  "-е число. Необходимо подготовить отчет.");
            friday = friday + 7;
        }
        System.out.println ("   Готово");

        // Задание 3

//        Мы решили написать астрономическое приложение, которое считает, когда над Землей пролетают кометы и их можно будет увидеть.
//        Для начала нам нужно посчитать траекторию движения кометы, которая пролетает рядом с Землей каждый 79-й год, начиная с нулевого.
//        Нам нужно узнать, в каких годах комета пролетала рядом с Землей за последние 200 лет и когда мы увидим ее в следующий раз.
//                Условия задачи:
//        В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета, а также следующий год ее появления.
//                Для вычисления периода можно создать две дополнительные переменные, которые содержат год за 200 лет до текущего (из созданной ранее переменной) в качестве старта
//                и 100 лет после в качестве завершения периода расчета.
//                В результате решения задачи в консоль должен вывестись следующий результат:
//        1896
//        1975
//        2054

        System.out.println ();
        System.out.println ("     Задание 3");
        int currentYear = 2022;
        int previousYear = currentYear - 200;
        int futureYear = currentYear + 100;
        for (int i = 0; i < futureYear; i = i + 79) {
            if (i > previousYear && i < futureYear) {
                System.out.println (i);
            }
        }
        System.out.println ("   Готово");

        // Задание 4
//        System.out.println ();
//        System.out.println ("     Задание 4");
//        System.out.println ();
//        System.out.println ("...");

        // Задание 5
//        System.out.println ();
//        System.out.println ("     Задание 5");
//        System.out.println ();
//        System.out.println ("...");

    }
}