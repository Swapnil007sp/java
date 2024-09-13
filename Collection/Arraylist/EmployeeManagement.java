import java.util.ArrayList;

public class EmployeeManagement {
    public static void main(String[] args) {
        ArrayList<Employee> hcl = new ArrayList<>();
        Employee e = new Employee(12, "jony", "5432154321");
        hcl.add(e);
        hcl.add(new Employee(23, "Matte", "1234567890"));
        hcl.add(new Employee(13, "Kio", "0909090909"));

        for (Employee emp : hcl) {
            System.out.println(emp.id);
            System.out.println(emp.mobile);
            System.out.println(emp.name);
            System.out.println("*****************************");
        }

        System.out.println("---------using simple for loop---------");

        for (int i = 0; i < hcl.size(); i++) {
            Employee emp = hcl.get(i);
            System.out.println(emp.id);
            System.out.println(emp.mobile);
            System.out.println(emp.name);
            System.out.println("******************");
        }
    }
}
