
package testlist;

public class NodeAltura {
        private int altura;
        private NodeAltura next;
        public NodeAltura() {
                this.altura = 0;
                this.next = null;
        }
        
        public NodeAltura(int altura) {
                this.altura = altura;
        }

        public NodeAltura(int altura, NodeAltura next) {
                this.altura = altura;
                this.next = next;
        }

        public int getAltura() {
                return altura;
        }

        public NodeAltura getNext() {
                return next;
        }

        public void setAltura(int altura) {
                this.altura = altura;
        }

        public void setNext(NodeAltura next) {
                this.next = next;
        }
        
        public boolean equals(Object o){
                if(!(o instanceof NodeAltura)){
                        return false;
                }
                NodeAltura aux = (NodeAltura) o;
                return this.getAltura() == aux.getAltura();
        }
        
        public String toString(){
                return this.altura+"";
        }
}
