import java.util.*;
public class zybook_625{
    public static int daysInFeb(int userYear){
        boolean leapYear = false;
        if (userYear % 4 == 0){
            if (userYear % 100 == 0){
                if (userYear % 400 == 0){
                    leapYear = true;
                } else {
                    leapYear = false;
                }
            } else {
                leapYear = true;
            }
        } else {
            leapYear = false;
        }

        if (leapYear) {
            return 29;
        } else {
            return 28;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userYear = scanner.nextInt();
        int days = daysInFeb(userYear);
        scanner.close();
        System.out.printf(userYear + " has " + days + " days in February.\n");
    }
}