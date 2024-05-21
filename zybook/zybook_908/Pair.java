package zybook_908;

public class Pair<TheType extends Comparable<TheType>> implements Comparable<Pair<TheType>> {
    public TheType firstVal;
    public TheType secondVal;

    // Constructor
    public Pair(TheType aVal, TheType bVal) {
        this.firstVal = aVal;
        this.secondVal = bVal;
    }

    // toString method
    @Override
    public String toString() {
        return "[" + firstVal + ", " + secondVal + "]";
    }

    // compareTo method
    @Override
    public int compareTo(Pair<TheType> otherPair) {
        int firstComparison = this.firstVal.compareTo(otherPair.firstVal);
        if (firstComparison != 0) {
            return firstComparison;
        }
        return this.secondVal.compareTo(otherPair.secondVal);
    }

    // comparisonSymbol method
    public char comparisonSymbol(Pair<TheType> otherPair) {
        int comparisonResult = this.compareTo(otherPair);
        if (comparisonResult < 0) {
            return '<';
        } else if (comparisonResult > 0) {
            return '>';
        } else {
            return '=';
        }
    }
}
