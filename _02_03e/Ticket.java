package _02_03e;

public class Ticket {

  public Ticket() {

  }

  private String destination;
  private double price;
  private boolean isReturn;

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public void setIsReturn(boolean isReturn) {
    this.isReturn = isReturn;
  }
  // Add a separate method to get the value of each field, called getDestination,
  // getPrice and getIsReturn.

  public String getDestination() {
    return destination;
  }

  public double getPrice() {
    return price;
  }

  public boolean getIsReturn() {
    return isReturn;
  }

}
