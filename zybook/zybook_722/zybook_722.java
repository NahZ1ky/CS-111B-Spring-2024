package zybook_722;
import java.util.Scanner;

public class zybook_722 {
    public static void main(String [] args){
        Scanner scnr = new Scanner(System.in);

        int inputNum = scnr.nextInt();
        Number yourNum = new Number(inputNum);
        System.out.print(yourNum);

        scnr.close();
    }
}

