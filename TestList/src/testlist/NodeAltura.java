
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
        
}
