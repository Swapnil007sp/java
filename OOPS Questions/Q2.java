public class Q2 {
    public static void main(String[] args) {
        Person p1 = new Person("john", 24, "Pune");
        p1.personDetails();
    }
}

class Person {
    String name;
    int age;
    String address;

    public Person(String name, int age, String address) {
        System.out.println("Constructor called...");
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void personDetails() {
        System.out.println("name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Address : " + address);
    }
}
