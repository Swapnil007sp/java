public class Q3 {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.name = "Jack";
        m1.salary = 30000.00;
        m1.department = "Banking";
        m1.details();
    }
}

class Employee {
    String name;
    double salary;
}

class Manager extends Employee {
    String department;

    public void details() {
        System.out.println("Name is : " + name);
        System.out.println("Salary is : " + salary);
        System.out.println("Department is : " + department);

    }
}