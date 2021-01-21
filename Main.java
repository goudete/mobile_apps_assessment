public class Main {

  public static void main(String args[]) {

    //Creating Restaurant
    Restaurant LocalTres = new Restaurant("LocalTres");

    //Init Robot waiter
    Robot robot_1 = new Robot(1);

    //Init Chef
    Chef chef_1 = new Chef(1);

    //Accept Cutstomer
    Customer customer_1 = new Customer(1);

    System.out.println(customer_1);

  }
}
