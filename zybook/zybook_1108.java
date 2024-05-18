import java.util.Scanner;
import java.util.InputMismatchException;

public class zybook_1108 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userNum, divNum;

        try {
            userNum = scnr.nextInt();
            divNum = scnr.nextInt();
            System.out.println(userNum / divNum);
        }
        catch (ArithmeticException ex) {
            System.out.println("Arithmetic Exception: " + ex.getMessage());
        }
        catch (InputMismatchException ex) {
            System.out.println("Input Mismatch Exception: " + ex.toString());
        }
        scnr.close();
    }
}
