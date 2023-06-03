
package myExceptions;

public class ExceptionTheresAnError extends Exception {

        private static final long serialVersionUID = 1L;

        public ExceptionTheresAnError() {
                super();
        }

        public ExceptionTheresAnError(String msg) {
                super(msg);
        }
}
