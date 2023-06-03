import testlist.myExceptions.ExceptionNoFound;

public class StackList <E> implements Stack<E>{
    
private Node<E> head;
    private int size;

    public StackList() {
        this.head = null;
        this.size = 0;
    }

    public E peek() throws ExceptionNoFound{
        if(this.head == null){
            throw new ExceptionNoFound("El cilindro no tiene pilas, está vacia");
        }
        return head.getNode();
    }

    public E pop() throws ExceptionNoFound{
        if(this.head == null){
            throw new ExceptionNoFound("El cilindro no tiene pilas, está vacia");
        }
        Node<E> aux = head;
        head = head.getNext();
        this.size--;
        return aux.getNode();
    }

    public E push(E e){
        Node<E> a = new Node<>(e);
        a.setNext(head);
        head = a;
        this.size++;
        return e;
    }

    @SuppressWarnings("empty-statement")
    public int search(Object o){
        if(!(o instanceof Node)){
            return -1;
        }
        
        Node<E> aux = head;
        int i = 0;
        for(; aux != null && !aux.equals(o); aux = aux.getNext(), i++);
        if(aux != null){
            return i;
        }
        return -1;
    }

    public boolean isEmpty(){
        return this.head == null;
    }

    public String toString(){
        String ret = "";
        Node<E> aux = head;
        while(aux != null){
            ret += aux.getNode()+", ";
            aux = aux.getNext();
        }
        return ret; 
    }

}
