
public class Node<T>{
    
    T node; 
    Node<T> nextNode;

    public Node(){

    }
    public Node(T datos){
        this.node=datos;
        this.nextNode=null;
    }

    public Node(T datos, Node<T> nextNode){
        this.node=datos;
        this.nextNode=nextNode;
    }
    public T getNode(){
        return this.node;
    }
    public void setNode(T datos){
        this.node=datos;
    }
    public Node<T> getNext(){
        return this.nextNode;
    }
    public void setNext(Node<T> nextNode) {
        this.nextNode=nextNode;
    }
    public String toString(){
        return this.node.toString();
    }
}