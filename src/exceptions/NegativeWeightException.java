package exceptions;

public class NegativeWeightException extends RuntimeException{

    public NegativeWeightException() {
        super("You cannot use negative number for weight");
    }
}
