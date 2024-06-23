import java.util.Scanner;

public class NegativeNumberException extends Exception{
    private int limitOfInput;
    public NegativeNumberException(String message, int limitOfInput){
        super(message);
        this.limitOfInput =limitOfInput;
    }
}
