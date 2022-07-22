public class EmailApp {
    public static void main(String[] args) {
        Email email = new Email("Danny", "Tram");
        System.out.println(email.showInfo());
        System.out.println();
        Email email1 = new Email("John", "Smith");
        System.out.println(email1.showInfo());
    }
}
