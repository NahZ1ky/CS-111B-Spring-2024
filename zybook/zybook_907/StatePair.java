package zybook_907;

public class StatePair<Type1, Type2> {
    private Type1 value1;
    private Type2 value2;

    public StatePair(Type1 value1, Type2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    // Mutators (Setters)
    public void setValue1(Type1 value1) {
        this.value1 = value1;
    }

    public void setValue2(Type2 value2) {
        this.value2 = value2;
    }

    // Accessors (Getters)
    public Type1 getValue1() {
        return value1;
    }

    public Type2 getValue2() {
        return value2;
    }

    // printInfo() method
    public void printInfo() {
        System.out.println(value1 + ": " + value2);
    }
}
