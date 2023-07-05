public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();


        int sumCred = 1_000_000;
        int timeCred = 12;
        double percentCred = 9.99;
        int monPay1 = service.calculate(sumCred, timeCred, percentCred);
        System.out.println();
        System.out.println("на 12/мес платеж равен:");
        System.out.println(monPay1);

        int timeCred2 = 24;
        int monPay2 = service.calculate(sumCred, timeCred2, percentCred);
        System.out.println();
        System.out.println("на 24/мес платеж равен:");
        System.out.println(monPay2);

        int timeCred3 = 36;
        int monPay3 = service.calculate(sumCred, timeCred3, percentCred);
        System.out.println();
        System.out.println("на 36/мес платеж равен:");
        System.out.println(monPay3);


    }
}
