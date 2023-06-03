import myExceptions.ExceptionTheresAnError;

public interface Queue<E> {
  // Metodos de Queue
  public boolean add(E e) throws ExceptionTheresAnError;

  public E element() throws ExceptionTheresAnError;

  public boolean offer(E e);

  public E peek();

  public E poll();

  public E remove() throws ExceptionTheresAnError;
}