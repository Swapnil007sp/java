public class Q4 {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.calculateArea(23.34, 34);
        Shape s1 = new Shape();
        s1.calculateArea(34.65, 65);
    }
}

class Shape {
    public void calculateArea(int length, int breadth) {
        System.out.println("Area of Square is : " + length * breadth);
    }

    public void calculateArea(double length, int width) {
        System.out.println("Area of Rectangle is : " + length * width);
    }

    public void calculateArea(int r) {
        System.out.println("Area of circle is : " + 3.14 * r * r);
    }

}

class Square extends Shape {
    public void calculateArea(double length, int width) {
        System.out.println("from subclass");
    }
}