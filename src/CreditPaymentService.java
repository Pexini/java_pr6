public class CreditPaymentService {
    public double calculate(int sumCred, int timeCred, double percentCred) {
        double mountlyRate = percentCred / (100 * 12);
        double x = Math.pow(1 + mountlyRate, timeCred);

        double payment = 1_000_000 * (mountlyRate * x / (x - 1));
        double finpay = (int) payment;
        return finpay;

    }
}

