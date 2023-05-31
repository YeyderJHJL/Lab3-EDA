

public class NOde<T>{
    
    T data; 
    Node enlace;

    public Node(){

    }
    public Node(T data){
        this.data=data;
        this.enlace=null;
    }

    public Node(T data, Node enlace){
        this.data=data;
        this.enlace=enlace;
    }
    public T getData(){
        return this.data;
    }
    public void setData(T data){
        this.data=data;
    }
    public Node<T> getNext(){
        return enlace;
    }
    public void setNext(Node<T> enlace) {
        this.enlace=enlace;
    }

}