package Queue;

import java.util.Queue;

public class DefinedQueue {

  private Queue<Integer> queue;

  private void enqueue(int item) {
    queue.add(item);
  }

  private int dequeue() {
    if (!queue.isEmpty()) {
      return queue.poll();
    } else {
      throw new IllegalStateException("Queue is empty");
    }
  }

  private int peek() {
    if (!queue.isEmpty()) {
      return queue.peek();
    } else {
      throw new IllegalStateException("Queue is empty");
    }
  }

  private boolean isEmpty() {
    return queue.isEmpty();
  }

  private int size() {
    return queue.size();
  }

  private void printQueue() {
    for (int item : queue) {
      System.out.println(item);
    }
  }

  public static void main(String[] args) {
    DefinedQueue Q1 = new DefinedQueue();

    Q1.enqueue(1);
    Q1.enqueue(2);
    Q1.enqueue(3);
    Q1.enqueue(4);
    Q1.enqueue(5);

    Q1.printQueue();

    System.out.println("Dequeue: " + Q1.dequeue());
    System.out.println("Dequeue: " + Q1.dequeue());
    System.out.println("Dequeue: " + Q1.dequeue());

    System.out.println("Peek: " + Q1.peek());
    System.out.println("Size: " + Q1.size());
    System.out.println("Is empty: " + Q1.isEmpty());
  }
}