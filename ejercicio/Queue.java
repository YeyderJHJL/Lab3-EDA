public class Queue<E> {
  private Node<E> head;
  private Node<E> tail;

  public boolean add(E e) {
    Node<E> newNode = new Node<E>(e);
    if (head != null) {
      tail.setNext(newNode);
      tail = newNode;
      return true;
    } else {
      head = newNode;
      tail = newNode;
      return true;
    }
  }

  public E element() {
    return head.getdatos();
  }
}