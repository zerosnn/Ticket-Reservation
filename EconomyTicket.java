public class EconomyTicket extends Ticket {
    private static final double DISCOUNT_RATE = 0.10; 

    public EconomyTicket(double baseFare) {
        super(baseFare);
    }

    @Override
    public double calculateFare() {
        return baseFare - (baseFare * DISCOUNT_RATE);
    }
}
