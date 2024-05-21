import java.util.Scanner;

public class zybook_1206 {
    public static int getMonthAsInt(String monthString) {
        int monthInt;

        // Java switch/case statement
        switch (monthString) {
            case "January":
                monthInt = 1;
                break;
            case "February":
                monthInt = 2;
                break;
            case "March":
                monthInt = 3;
                break;
            case "April":
                monthInt = 4;
                break;
            case "May":
                monthInt = 5;
                break;
            case "June":
                monthInt = 6;
                break;
            case "July":
                monthInt = 7;
                break;
            case "August":
                monthInt = 8;
                break;
            case "September":
                monthInt = 9;
                break;
            case "October":
                monthInt = 10;
                break;
            case "November":
                monthInt = 11;
                break;
            case "December":
                monthInt = 12;
                break;
            default:
                monthInt = 0;
        }

        return monthInt;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        while (true) {
            String dateInput = scnr.nextLine();

            if (dateInput.equals("-1")) {
                break;
            }

            // Check if the dateInput follows the correct format
            if (dateInput.matches("[A-Za-z]+\\s\\d{1,2},\\s\\d{4}")) {
                // Extract month, day, year
                String month = dateInput.substring(0, dateInput.indexOf(' '));
                String day = dateInput.substring(dateInput.indexOf(' ') + 1, dateInput.indexOf(','));
                String year = dateInput.substring(dateInput.indexOf(',') + 2);

                // Convert month to integer
                int monthInt = getMonthAsInt(month);

                // If monthInt is valid, print the date in the required format
                if (monthInt != 0) {
                    System.out.println(monthInt + "-" + day + "-" + year);
                }
            }
        }
        scnr.close();
    }
}
