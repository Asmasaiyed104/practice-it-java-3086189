package _02_06;

public class TicketMachine {

  public static void main(String[] args) {
    // Create an object called ticket of type Ticket
    Ticket ticket = new Ticket();

    // Set the destination of the ticket to New York
    ticket.setDestination("New York");

    // Set the price of the ticket to 15.30
    ticket.setPrice(15.30);

    // Set the isReturn value to true
    ticket.setIsReturn(true);

    // Print the ticket's destination to the console
    System.out.println("Destination: " + ticket.getDestination());

    // Print the ticket's price to the console
    System.out.println("Price: " + ticket.getPrice());

    // Print the ticket's isReturn value to the console
    System.out.println("Is Return: " + ticket.getIsReturn());
  }
}

class Ticket {
  private String destination;
  private double price;
  private boolean isReturn;

  // Getter and setter methods for destination
  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  // Getter and setter methods for price
  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  // Getter and setter methods for isReturn
  public boolean getIsReturn() {
    return isReturn;
  }

  public void setIsReturn(boolean isReturn) {
    this.isReturn = isReturn;
  }
}
