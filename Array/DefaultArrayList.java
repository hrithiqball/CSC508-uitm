package Array;

import java.util.ArrayList;

public class DefaultArrayList {

  private static void print(ArrayList<String> customer) {
    System.err.println("-----------------");
    for (int i = 0; i < customer.size(); i++) {
      System.out.println("Index " + i + " : " + customer.get(i));
    }
    System.err.println("-----------------");
  }

  public static void main(String[] args) {
    ArrayList<String> customer = new ArrayList<String>();

    customer.add("John");
    customer.add("Mike");
    customer.add("Sue");
    customer.add("Joanna");

    print(customer);

    customer.remove(2);

    print(customer);

    customer.set(1, "Hendry");

    print(customer);
  }
}
