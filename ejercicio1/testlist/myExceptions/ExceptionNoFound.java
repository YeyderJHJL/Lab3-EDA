
package testlist.myExceptions;

public class ExceptionNoFound extends Exception {

        private static final long serialVersionUID = 1L;
        
        public ExceptionNoFound() {
                super();
        }
        public ExceptionNoFound(String msg) {
                super(msg);
        }
}
