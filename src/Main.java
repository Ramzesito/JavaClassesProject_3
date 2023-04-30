public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditAmount = 1_000_000; // сумма кредита в рублях
        double rate = 9.99; // годовая процентная ставка
        int creditTerm = 12; // срок выплат в месяцах

        int payment = service.calculate(creditAmount, rate, creditTerm);

        System.out.println("Ежемесячный платёж составит " + payment + "р.");

        // доп.расчеты
        System.out.println("Ежемесячный платёж составит " + service.calculate(1_000_000, 9.99, 24) + "р.");
        System.out.println("Ежемесячный платёж составит " + service.calculate(1_000_000, 9.99, 36) + "р.");
    }
}
