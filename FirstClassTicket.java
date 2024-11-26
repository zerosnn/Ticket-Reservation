public class FirstClassTicket extends Ticket {
    private static final double EXTRA_CHARGE_RATE = 0.50; 

    public FirstClassTicket(double baseFare) {
        super(baseFare);
    }

    @Override
    public double calculateFare() {
        return baseFare + (baseFare * EXTRA_CHARGE_RATE);
    }
}
