public class Employee {

    private int id;
    private String fullName;
    private int department;
    private double salary;
    private static int counter;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Id работника = " + id +
                ", ФИО = '" + fullName + '\'' +
                ", отдел = " + department +
                ", ЗП = " + salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Employee.counter = counter;
    }

    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = ++counter;
    }

}

