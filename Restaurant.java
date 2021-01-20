
class Restaurant {
  //class attributes
  String name;

  //constructor
  public Restaurant(String n) {
    this.name = n
  }

  //methods
  public Customer acceptCustomer(Customer c) {
    Customer cust = new Customer(c);
    return cust
  }

  public Robot initRobot(Robot r) {
    Robot robo = new Robot(r);
    return robo
  }

  public Chef initChef(Chef c) {
    Chef kitchenMaster = new Chef(c);
    return kitchenMaster
  }

}
