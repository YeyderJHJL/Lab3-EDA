import testlist.myExceptions.ExceptionNoFound;

public interface Stack<E> {
  //metodos de Stack
    public E peek() throws ExceptionNoFound;
    public E pop() throws ExceptionNoFound;
    public E push(E e);
    public int search(Object o);    
}
