package Queue;

public class ArrayQueue {
  int maxQueueSize = 100;
  char[] newQueue = new char[maxQueueSize];
  int queueFront, queueRear;

  ArrayQueue() {
    queueFront = 0;
    queueRear = -1;
  }

  private boolean isEmpty() {
    return ((queueRear - queueFront) == -1);
  }

  private boolean isFull() {
    return (queueRear == maxQueueSize - 1);
  }

  private char front() {
    return newQueue[queueFront];
  }

  private char rear() {
    return newQueue[queueRear];
  }

  private void addQueue(char elem) {
    if (!isFull()) {
      newQueue[++queueRear] = elem;
    } else
      System.out.println("Full array");
  }

  private char deleteQueue() {
    if (!isEmpty()) {
      return newQueue[queueFront++];
    } else {
      System.out.println("Empty Queue");
      return '\0';
    }
  }

  private void printQueue() {
    for (int i = queueFront; i <= queueRear; i++) {
      System.out.println(newQueue[i]);
    }
  }

  public static void main(String[] args) {
    ArrayQueue Q1 = new ArrayQueue();

    Q1.addQueue('F');
    Q1.addQueue('A');
    Q1.addQueue('B');
    Q1.addQueue('E');
    Q1.addQueue('Q');

    Q1.printQueue();

    System.out.println("Remove " + Q1.deleteQueue());
    System.out.println("Remove " + Q1.deleteQueue());

    Q1.printQueue();

    System.out.println("Front - " + Q1.front());
    System.out.println("Rear - " + Q1.rear());
  }
}
