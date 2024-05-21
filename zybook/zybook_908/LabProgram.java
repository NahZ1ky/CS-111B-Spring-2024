package zybook_908;

import java.util.Scanner;

public class LabProgram {

    public static Pair<Integer> readIntegerPair(Scanner scnr) {
        int first = scnr.nextInt();
        int second = scnr.nextInt();
        return new Pair<>(first, second);
    }

    public static Pair<Double> readDoublePair(Scanner scnr) {
        double first = scnr.nextDouble();
        double second = scnr.nextDouble();
        return new Pair<>(first, second);
    }

    public static Pair<String> readWordPair(Scanner scnr) {
        String first = scnr.next();
        String second = scnr.next();
        return new Pair<>(first, second);
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Pair<Integer> integerPair1 = readIntegerPair(scnr);
        Pair<Integer> integerPair2 = readIntegerPair(scnr);

        Pair<Double> doublePair1 = readDoublePair(scnr);
        Pair<Double> doublePair2 = readDoublePair(scnr);

        Pair<String> wordPair1 = readWordPair(scnr);
        Pair<String> wordPair2 = readWordPair(scnr);

        // Output the pairs and their comparison symbols
        System.out.println(integerPair1 + " " + integerPair1.comparisonSymbol(integerPair2) + " " + integerPair2);
        System.out.println(doublePair1 + " " + doublePair1.comparisonSymbol(doublePair2) + " " + doublePair2);
        System.out.println(wordPair1 + " " + wordPair1.comparisonSymbol(wordPair2) + " " + wordPair2);
    }
}
