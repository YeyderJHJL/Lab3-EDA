
package testlist;

import testlist.myExceptions.ExceptionNoFound;

public class CilindroList  {
        
        private NodeAltura head;

        public CilindroList() {
                this.head = null;
        }
        
        public boolean isEmpty(){
                return this.head == null;
        }
        
        public NodeAltura peek() throws ExceptionNoFound{
                if(this.head == null){
                        throw new ExceptionNoFound("El cilindro no tiene pilas, está vacia");
                }
                
                NodeAltura aux = head;
                
                while(aux.getNext() != null){
                        aux = aux.getNext();
                }
                
                return aux;
        }
        
        public NodeAltura pop() throws ExceptionNoFound{
                if(this.head == null){
                        throw new ExceptionNoFound("El cilindro no tiene pilas, está vacia");
                }
                
                NodeAltura aux = head;
                
                while(aux.getNext().getNext() != null){
                        aux = aux.getNext();
                }
                NodeAltura eliminado = aux;
                aux.setNext(aux.getNext().getNext()); ;
                return eliminado;
        }
        
        public NodeAltura push(NodeAltura e){
                
                //código
                
                return null;
        }
        
        public int search(Object o){
                
                //código
                
                return -1;
        }
}
