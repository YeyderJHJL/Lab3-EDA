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
    if (this.head != null) {
      if (this.head.getNext() != null) {
        E headElement = this.head.getdatos();
        this.head = this.head.getNext();
        return headElement;
      } else {
        E headElement = this.head.getdatos();
        this.head = null;
        return headElement;
      }
    } else {
      return null;
    }
  }
}