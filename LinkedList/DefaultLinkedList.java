package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class DefaultLinkedList {

  @SuppressWarnings("resource")
  public static void main(String[] args) {
    LinkedList<Integer> numList = new LinkedList<Integer>();
    Scanner input = new Scanner(System.in);

    for (int i = 0; i < 3; i++) {
      System.out.println("Enter an integer : ");
      int number = input.nextInt();
      numList.addFirst(number);
    }

    System.out.println("The list size : " + numList.size());

    for (int i = 0; i < numList.size(); i++) {
      System.out.println(numList.get(i));
    }

    numList.removeLast();

    System.out.println("\nAfter removal");

    for (int i = 0; i < numList.size(); i++) {
      System.out.println(numList.get(i));
    }

  }
}
