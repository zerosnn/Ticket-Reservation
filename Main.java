public class Main {
    public static void main(String[] args) {
        Ticket economyTicket = new EconomyTicket(200.00);
        Ticket businessTicket = new BusinessTicket(200.00);
        Ticket firstClassTicket = new FirstClassTicket(200.00);

        System.out.println("Economy Ticket Details:");
        economyTicket.displayTicketDetails();
        System.out.println();

        System.out.println("Business Ticket Details:");
        businessTicket.displayTicketDetails();
        System.out.println();

        System.out.println("First Class Ticket Details:");
        firstClassTicket.displayTicketDetails();
    }
}
