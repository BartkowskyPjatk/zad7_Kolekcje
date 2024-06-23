import java.util.NoSuchElementException;
import java.util.Scanner;

public class InputHelpZad4 {


    public int readNumber() throws NegativeNumberException{
        Scanner scan = new Scanner(System.in);
            System.out.println("Podaj liczbę większą lub równą 0");

            int number = scan.nextInt();
            if (number < 0)
                throw new NegativeNumberException("Podano liczbę mniejsza niż 0, w jej miejsce przypisano wartość 0");
            return number;
    }
    public void fillArray(int[] table){
        for (int i = 0; i < table.length; i++) {
            try{
                table[i] = readNumber();
            }catch (NegativeNumberException e) {
                e.printStackTrace();
                table[i] = 0;
            }
        }
    }
}
