public class Q7 {
    public static void main(String[] args) {
        Bike b1 = new Bike();
        b1.start();
        b1.stop();

        Car c1 = new Car();
        c1.start();
        c1.stop();
    }
}

interface Vehical {
    public void start();

    public void stop();

}

class Bike implements Vehical {
    public void start() {
        System.out.println("Bike has been Start");
    }

    public void stop() {
        System.out.println("Bike Is stopped");
    }
}

class Car implements Vehical {
    public void start() {
        System.out.println("Car has been Start");
    }

    public void stop() {
        System.out.println("Car Is stopped");
    }
}