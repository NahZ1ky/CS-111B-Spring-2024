package zybook_722;

public class Number {
    private int num;

    public Number(int n) {
        num = n;
    }

    public String toString() {
        String str = "The value is " + num;
        return str;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int n) {
        num = n;
    }

    public static void main(String [] args) {
        Number yourNum = new Number(723);
        System.out.print(yourNum);
    }
}