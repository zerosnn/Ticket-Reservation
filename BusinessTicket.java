public class BusinessTicket extends Ticket {
    private static final double EXTRA_CHARGE_RATE = 0.25; 

    public BusinessTicket(double baseFare) {
        super(baseFare);
    }

    @Override
    public double calculateFare() {
        return baseFare + (baseFare * EXTRA_CHARGE_RATE);
    }
}
