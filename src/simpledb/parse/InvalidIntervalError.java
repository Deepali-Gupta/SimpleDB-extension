package simpledb.parse;

/**
 * A runtime exception indicating that the submitted query
 * has incorrect syntax.
 * @author Edward Sciore
 */
@SuppressWarnings("serial")
public class InvalidIntervalError extends RuntimeException {
   public InvalidIntervalError() {
   }
}
