public class Temperature {
    private double degrees;
    private char unit;

    // Constructor
    Temperature(double degrees, char unit) {
        this.degrees = degrees;
        this.unit = unit;
    }

    Temperature(double degrees) {
        this(degrees, 'C');
    }

    Temperature(char unit) {
        this(0.0, unit);
    }

    Temperature() {
        this(0.0, 'C');
    }

    // Write methods
    public void writeOutput() { // debugger
        System.out.printf("%.1f, %c", degrees, unit);
    }

    public void writeC() {
        System.out.printf("It is %.1f in %c", degrees, unit);
    }

    public void writeF() {
        System.out.printf("It is %.1f in %c", degrees, unit);
    }





}
