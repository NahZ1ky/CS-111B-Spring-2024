import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class zybook_909 {

    // Input 5 Integers and return the Integers in an ArrayList
    public static ArrayList<Integer> inputIntegers(Scanner scnr) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            integers.add(scnr.nextInt());
        }
        return integers;
    }

    // Input 5 Doubles and return the Doubles in an ArrayList
    public static ArrayList<Double> inputDoubles(Scanner scnr) {
        ArrayList<Double> doubles = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            doubles.add(scnr.nextDouble());
        }
        return doubles;
    }

    // Input 5 Strings, and return the Strings in an ArrayList
    public static ArrayList<String> inputWords(Scanner scnr) {
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            words.add(scnr.next());
        }
        return words;
    }

    // Output the elements of the ArrayList parameter
    public static <TheType extends Comparable<TheType>> void print(ArrayList<TheType> list) {
        for (TheType element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Return the min, median, and max of the ArrayList parameter in a new ArrayList
    public static <TheType extends Comparable<TheType>> ArrayList<TheType> getStatistics(ArrayList<TheType> list) {
        Collections.sort(list);
        ArrayList<TheType> statistics = new ArrayList<>();
        statistics.add(list.get(0)); // Minimum
        statistics.add(list.get(list.size() / 2)); // Median
        statistics.add(list.get(list.size() - 1)); // Maximum
        return statistics;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Input a list of 5 Integers and print the ArrayList's statistics
        ArrayList<Integer> integers = inputIntegers(scnr);
        print(integers);
        ArrayList<Integer> integerStatistics = getStatistics(integers);
        print(integerStatistics);
        System.out.println();

        // Input a list of 5 Doubles and print the ArrayList's statistics
        ArrayList<Double> doubles = inputDoubles(scnr);
        print(doubles);
        ArrayList<Double> doubleStatistics = getStatistics(doubles);
        print(doubleStatistics);
        System.out.println();

        // Input a list of 5 words (Strings) and print the ArrayList's statistics
        ArrayList<String> words = inputWords(scnr);
        print(words);
        ArrayList<String> wordStatistics = getStatistics(words);
        print(wordStatistics);
    }
}
