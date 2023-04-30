public class CreditPaymentService {
    public int calculate(int creditAmountInRub, double creditRateInPercent, int creditTermInMonths) {
        double payment;
        double monthRate = creditRateInPercent/12/100;
        payment = creditAmountInRub * monthRate * Math.pow(1+monthRate, creditTermInMonths) / (Math.pow(1+monthRate, creditTermInMonths)-1);
        return (int)payment;
    }
}
