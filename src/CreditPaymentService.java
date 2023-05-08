public class CreditPaymentService {
    public int calculate(int summ, double rate, int term) {
        double Mrate = (rate / 12) / 100;
        int month = term * 12;
        double coef = (Mrate * (Math.pow(1 + Mrate, month))) / ((Math.pow(1 + Mrate, month)) - 1);
        double result = summ * coef;
        return (int) result;
    }
}
