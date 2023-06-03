
public class Node<T> {

    T datos;
    Node<T> nextNode;

    public Node() {

    }

    public Node(T datos) {
        this.datos = datos;
        this.nextNode = null;
    }

    public Node(T datos, Node<T> nextNode) {
        this.datos = datos;
        this.nextNode = nextNode;
    }

    public T getdatos() {
        return this.datos;
    }

    public void setdatos(T datos) {
        this.datos = datos;
    }

    public Node<T> getNext() {
        return nextNode;
    }

    public void setNext(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

}