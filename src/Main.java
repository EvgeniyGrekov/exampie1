public class Main {
    public static void main(String[] args) {
    // Задание 1
        int dog = 11;
        byte cat = 1;
        short mouse = 3;
        long elephant = 110L;
        double sugarWeight = 4.5;
        float saltWeight = 1.5f;
        boolean dogIsAdult = dog > 10;
        char dollar = 36;
        System.out.println (" ");
        System.out.println ("Первая задача");
        System.out.println (dogIsAdult);
        System.out.println (" ");

    // Задание 2
        System.out.println ("Вторая задача");
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOfAllBoxers = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;
        System.out.println ("Общий вес боксёров " + weightOfAllBoxers);
        System.out.println ("Разница в весе " + weightDifference);
        System.out.println (" ");

    // Задание 3
        System.out.println ("Третья задача");
        int bananaCount = 5;
        int bananaWeight = 80;
        int milkCount = 2;
        int milkWeight = 105;
        int iceCreamCount = 2;
        int iceCreamWeight = 100;
        int eggCount = 4;
        int eggWeight = 70;
        System.out.println ("Бананы: колличество - " + bananaCount + ", вес - " + bananaWeight);
        System.out.println ("Молоко: колличество - " + milkCount + ", вес - " + milkWeight);
        System.out.println ("Мороженное: колличество - " + iceCreamCount + ", вес - " + iceCreamWeight);
        System.out.println ("Яйца: колличество - " + eggCount + ", вес - " + eggWeight);
        int totalWeightG = bananaCount * bananaWeight + milkCount * milkWeight + iceCreamCount * iceCreamWeight + eggCount * eggWeight;
        System.out.println ("Общий вес завтрака в граммах - " + totalWeightG);
        float totalWeightKg = totalWeightG/1000f;
        System.out.println ("Общий вес завтрака в килограммах - " + totalWeightKg);
        System.out.println (" ");

    // Задание 4
        System.out.println ("Четвёртая задача");
        int delWeight = 7000;
        int weight250 = 250;
        int weight500 = 500;
        double deysFor250 = (double) delWeight / weight250;
        double deysFor500 = (double) delWeight / weight500;
        double deysAverage = (deysFor250 + deysFor500) / 2;
        System.out.println (deysFor250 + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм");
        System.out.println (deysFor500 + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 500 грамм");
        System.out.println (deysAverage + " дней уйдёт на похудение в среднем");
        System.out.println (" ");

    // Задание 5
        // Отойдем от спорта и представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников.
        // В компании есть правило, что чем дольше сотрудник работает в компании, тем ценнее он для бизнеса.
        // Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год.
        // Каждый год повышение составляет 10% от текущей зарплаты.
        //
        // К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:
        // Маша получает 67 760 рублей в месяц
        // Денис получает 83 690 рублей в месяц
        // Кристина получает 76 230 рублей в месяц
        // Каждому нужно увеличить зарплату на 10% от текущей месячной. Дополнительно руководитель попросил посчитать
        // разницу между годовым доходом с нынешней зарплатой и после повышения.
        // Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.
        //
        // Выведите в консоль информацию по каждому сотруднику.
        // Например, “Маша теперь получает **** рублей. Годовой доход вырос на **** рублей”.
        //
        // Критерии оценки
        // – Все переменные присвоены верно
        // – Операция умножения выполнена верно
        // – Операция сложения выполнена верно
        // – Все условия задания выполнены
        //
        System.out.println ("Пятая задача");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        System.out.println ("ЗП Маши до повышения " + salaryMasha);
        System.out.println ("ЗП Дениса до повышения " + salaryDenis);
        System.out.println ("ЗП Кристины до повышения " + salaryKristina);
        System.out.println (" ");
        int newSalaryMasha = salaryMasha / 100 * 10 + salaryMasha;
        int newSalaryDenis = salaryDenis / 100 * 10 + salaryDenis;
        int newSalaryKristina = salaryKristina / 100 * 10 + salaryKristina;
        int diffSalaryMasha = newSalaryMasha - salaryMasha;
        int diffSalaryDenis = newSalaryDenis - salaryDenis;
        int diffSalaryKristina = newSalaryKristina - salaryKristina;
        System.out.println ("ЗП Маши после повышения " + newSalaryMasha + " Разница за год составит " + diffSalaryMasha * 12);
        System.out.println ("ЗП Дениса после повышения " + newSalaryDenis + " Разница за год составит " + diffSalaryDenis * 12);
        System.out.println ("ЗП Кристины после повышения " + newSalaryKristina + " Разница за год составит " + diffSalaryKristina * 12);
        System.out.println (" ");





    }
}