import myExceptions.ExceptionTheresAnError;

public class TestQueue<E> implements Queue<E> {
  private Node<E> head;
  private Node<E> tail;

  public boolean add(E e) throws ExceptionTheresAnError {
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

  public E element() throws ExceptionTheresAnError {
    if (this.head == null) {
      throw new ExceptionTheresAnError("No se puede observar la cabeza de la cola porque esta vacia");
    } else {
      return this.head.getdatos();
    }
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

  public boolean offer(E e) {
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

  public E peek() {
    return this.head.getdatos();
  }

  public E remove() throws ExceptionTheresAnError {
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
      throw new ExceptionTheresAnError("No se puede remover la cabeza de la cola porque esta vacia");
    }
  }
}