import java.util.NoSuchElementException;
import java.util.Scanner;

public class InputHelpZad4 {
    private int limitOfInput;

    InputHelpZad4(int limitOfInput){
        this.limitOfInput = limitOfInput;
    }

    public int readNumber() throws NegativeNumberException{
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Podaj liczbę większą lub równą " + limitOfInput);

            int number = scan.nextInt();
            if (number < limitOfInput)
                throw new NegativeNumberException("Podano liczbę mniejsza niż " + limitOfInput+ " ,w jej miejsce przypisano wartość "+ limitOfInput,limitOfInput);
            return number;
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
    public void fillArray(int[] table){
        for (int i = 0; i < table.length; i++) {
            try{
                table[i] = readNumber();
            }catch (NegativeNumberException e) {
                table[i] = 0;
            }
        }
    }
}
