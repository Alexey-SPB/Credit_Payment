public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int Payment = service.calculate(1000000, 9.99, 1);
        System.out.println(Payment);
        int Payment2 = service.calculate(1000000, 9.99, 2);
        System.out.println(Payment2);
        int Payment3 = service.calculate(1000000, 9.99, 3);
        System.out.println(Payment3);
    }
}
