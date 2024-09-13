public class Q8 {
    public static void main(String[] args) {
        PrinterScanner ps = new PrinterScanner();
        ps.prints();
        ps.scans();
    }
}

interface Printable {
    public void prints();
}

interface Scannable {
    public void scans();

}

class PrinterScanner implements Printable, Scannable {
    public void prints() {
        System.out.println("From printable interface");
    }

    public void scans() {
        System.out.println("From Scannable Interface");
    }
}