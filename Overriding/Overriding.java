public class Overriding {
    public static void main(String[] args) {
        Human H1 = new John();
        Human H2 = new Ana();

        H1.walks(); // Runtime- Dynamic Polymorphism
        // H1.talks(str);
        System.out.println(H1.talks("Hello from John"));

        H2.walks();
        // H2.talks();
        System.out.println(H2.talks("Hello from Ana"));
    }
}

class Human {
    public void walks() {
        System.out.println("Human walks");
    }

    public String talks(String str) {
        return "Human talks" + str;
    }
}

class John extends Human {
    public void walks() {
        System.out.println("John walk");
    }

    public String talks(String str) {
        return "John talk : " + str;
    }
}

class Ana extends Human {
    public void walks() {
        System.out.println("Ana walks");
    }

    public String talks(String str) {
        return "Ana talks : " + str;
    }
}