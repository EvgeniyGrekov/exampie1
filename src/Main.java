import java.util.Locale;
public class Main {

    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Вася Пупкин", 1, 5000.0);
        employees[1] = new Employee("Федя Васечкин", 2, 8000.0);
        employees[2] = new Employee("Вася Федичкинн", 3, 9000.0);
        employees[3] = new Employee("Петя Манукян", 4, 3000.0);
        employees[4] = new Employee("Люся Кокаинова", 5, 7000.0);
        employees[6] = new Employee(null, 1, 5000.0);
        employees[8] = new Employee("Уй Алупкин", 1, 6000.0);
        getAndCalkulateSalarySum();

        printAllEmployees();

        System.out.println();
        System.out.println("Сумма затрат на зарплаты в месяц = " + getAndCalkulateSalarySum());
        System.out.println("Сотрудник с минимальной зарплатой - " + getEmployeeMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой - " + getEmployeeMaxSalary());
        System.out.println("Средняя зарплата в месяц = " + getAndCalculateAverageSalary());
        System.out.println();

        printFullNameAllEmployee();

        System.out.println();

        System.out.println("Всё ОК");

    }

    public static void printAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

    public static double getAndCalkulateSalarySum() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum = sum + employee.getSalary();
            }
        }
        return sum;
    }

    public static Employee getEmployeeMinSalary() {
        double minSalary = -1;
        Employee minSalaryEmpl = null;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                minSalary = employees[i].getSalary();
                minSalaryEmpl = employees[i];
                index = i;
                break;
            }
        }
        for (int i = index; i < employees.length; i++) {
            if (employees[i] != null) {
                if (minSalary > employees[i].getSalary()) {
                    minSalary = employees[i].getSalary();
                    minSalaryEmpl = employees[i];
                }
            }
        }
        return minSalaryEmpl;
    }

    public static Employee getEmployeeMaxSalary() {
        double maxSalary = -1;
        Employee maxSalaryEmpl = null;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                maxSalary = employees[i].getSalary();
                maxSalaryEmpl = employees[i];
                index = i;
                break;
            }
        }
        for (int i = index; i < employees.length; i++) {
            if (employees[i] != null) {
                if (maxSalary < employees[i].getSalary()) {
                    maxSalary = employees[i].getSalary();
                    maxSalaryEmpl = employees[i];
                }
            }
        }
        return maxSalaryEmpl;
    }
    public static double getAndCalculateAverageSalary(){
        double sumSalaryAllEmpl = getAndCalkulateSalarySum();
        if (employees.length != 0) {
            return sumSalaryAllEmpl / Employee.getCounter();
        } else {
            return 0;
        }
    }

    public static void printFullNameAllEmployee(){
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }

    }
}

    // Учёт сотрудников
    // Автоматизация процессов бухгалтерии и отдела кадров
    //
    // Бухгалтерия и отдел кадров смогут узнавать следующую информацию:
    // 1. Получить список всех сотрудников.
    // 2. Посчитать сумму затрат на зарплаты.
    // 3. Найти сотрудника с минимальной заплатой.
    // 4. Найти сотрудника с максимальной зарплатой.
    // 5. Подсчитать среднее значение зарплат.

//        1. Создать класс Employee, который содержит информацию о Ф.И.О., отделе и зарплате сотрудника. Отделы для простоты должны быть названы от 1 до 5.
//        2. Добавить статическую переменную-счетчик, которая будет отвечать за id.
//        3. Добавить в класс Employee поле id, которое проставляется из счетчика, а затем счетчик увеличивает свое значение.
//        4. Добавить возможность получать значения полей из Employee (геттеры) для всех полей.
//        5. Добавить возможность устанавливать значения полей отдела и зарплаты (сеттеры).
//        6. По умолчанию все поля должны передавать через конструктор (кроме id) и заполняться в нем (включая id, который нужно получить из счетчика).
//        7. Создать внутри класса с методом main поле типа Employee[10], которое будет выполнять роль «хранилища» для записей о сотрудниках.
//        8. Создать статические методы, которые будут взаимодействовать с массивом и предоставлять результат:
//           a. Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
//           b. Посчитать сумму затрат на зарплаты в месяц.
//           c. Найти сотрудника с минимальной зарплатой.
//           d. Найти сотрудника с максимальной зарплатой.
//           e. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
//           f. Получить Ф. И. О. всех сотрудников (вывести в консоль).

