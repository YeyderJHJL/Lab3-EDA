public class Queue<E> {
  private Node<E> head;
  private Node<E> tail;

  public boolean add(E e) {
    Node<E> newNode = new Node<E>(e);
    if (head != null) {
      this.tail.setNext(newNode);
      this.tail = newNode;
      return true;
    } else {
      this.head = newNode;
      this.tail = newNode;
      return true;
    }
  }

  public E element() {
    return this.head.getdatos();
  }

  public E poll() {
    E headElement = this.head.getdatos();
    this.head = this.head.getNext();
    return headElement;
  }
}