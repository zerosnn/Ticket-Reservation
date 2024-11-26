public abstract class Ticket {
    protected double baseFare; 

    public Ticket(double baseFare) {
        this.baseFare = baseFare;
    }

    public abstract double calculateFare();

    public void displayTicketDetails() {
        System.out.println("Base Fare: $" + baseFare);
        System.out.println("Total Fare: $" + calculateFare());
    }
}
