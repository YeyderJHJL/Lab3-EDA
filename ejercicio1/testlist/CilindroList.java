
package testlist;

import testlist.myExceptions.ExceptionNoFound;

public class CilindroList <Integer> implements Comparable<CilindroList> {
        
        private NodeAltura head;

        public CilindroList() {
                this.head = null;
        }
        
        public int peek() throws ExceptionNoFound{
                if(this.head == null){
                        throw new ExceptionNoFound("El cilindro no tiene pilas, está vacia");
                }
                return head.getAltura();
        }
        
        public int pop() throws ExceptionNoFound{
                if(this.head == null){
                        throw new ExceptionNoFound("El cilindro no tiene pilas, está vacia");
                }
                NodeAltura aux = head;
                head = head.getNext();
                return aux.getAltura();
        }
        
        public NodeAltura push(NodeAltura e){
                NodeAltura aux = head;
                e.setNext(aux);
                head = e;
                
                return e;
        }
        
        @SuppressWarnings("empty-statement")
        public int search(Object o){
                if(!(o instanceof NodeAltura)){
                        return -1;
                }
                
                NodeAltura aux = head;
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
                NodeAltura aux = head;
                while(aux != null){
                        ret += aux.getAltura()+", ";
                        aux = aux.getNext();
                }
                return ret; 
        }
        
        public int sum(){
                NodeAltura aux = head;
                int suma = 0;
                
                while(aux != null){
                        suma += aux.getAltura();
                        aux = aux.getNext();
                }
                return suma;
        }
        
        @Override
        public int compareTo(CilindroList o){
                return this.sum() - o.sum();
        }
}
