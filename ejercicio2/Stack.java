import testlist.myExceptions.ExceptionNoFound;

public interface Stack<E> {
  //metodos de Stack
    E peek() throws ExceptionNoFound;
    E pop() throws ExceptionNoFound;
    E push(E e);
    int search(E o);    
}
