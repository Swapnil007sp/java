public class Q1 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.model = "BMW";
        c1.year = 2020;
        c1.color = "Mineral Grey Metallic";
        c1.carDetails();
    }
}

class Car {
    String model;
    int year;
    String color;

    public void carDetails() {
        System.out.println("Model is : " + model);
        System.out.println("Year is : " + year);
        System.out.println("Color : " + color);
    }
}