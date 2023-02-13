//checked -> Extends Exception
//Unchecked -> Extends RuntimeException
public class InsufficientFundsException extends  Exception{
    public InsufficientFundsException() {
        super("Insufficient Balance");
    }

    public InsufficientFundsException(String message) {
        super(message);
    }
}
