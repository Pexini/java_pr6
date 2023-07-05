
public class CreditPaymentService {
    public int calculate(int sumCred, int timeCred, double percentCred) {
        double mountlyRate = percentCred / (100 * 12);
        double x = Math.pow(1 + mountlyRate, timeCred);

        double payment = sumCred * (mountlyRate * x / (x - 1));
        int pay = (int) payment;
        return pay;


    }
}

