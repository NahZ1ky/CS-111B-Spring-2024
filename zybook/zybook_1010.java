import java.util.Scanner;

public class zybook_1010 {
    public static void selectionSortDescendTrace(int [] numbers, int numElements) {
        for (int i = 0; i < numElements - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < numElements; j++) {
                if (numbers[j] > numbers[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Swap numbers[i] with numbers[maxIndex]
            int temp = numbers[i];
            numbers[i] = numbers[maxIndex];
            numbers[maxIndex] = temp;

            // Output the array after each iteration of the outer loop
            for (int k = 0; k < numElements; k++) {
                System.out.print(numbers[k] + " ");
            }
            System.out.println(); // Move to the next line
        }
    }


    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int input = 0;
        int numElements = 0;
        int [] numbers = new int[10];

        while ((input = scnr.nextInt()) != -1) {
            numbers[numElements] = input;
            numElements++;
            if (numElements == 10) {
                break; // Reached maximum capacity
            }
        }

        // Call selectionSortDescendTrace method
        selectionSortDescendTrace(numbers, numElements);
        scnr.close();
    }
}

