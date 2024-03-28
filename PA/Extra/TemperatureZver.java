public class TemperatureZver {
    private double degrees;
    private char unit;

    // Constructor
    TemperatureZver(double degrees, char unit) {
        this.degrees = degrees;
        this.unit = unit;
    }

    TemperatureZver(double degrees) {
        this(degrees, 'C');
    }

    TemperatureZver(char unit) {
        this(0.0, unit);
    }

    TemperatureZver() {
        this(0.0, 'C');
    }

    // Write methods
    public void writeOutput() { // debugger
        System.out.printf("It is %.1f in %c", degrees, unit);
    }
    public void writeC() { // something is wrong HERE
        if (unit == 'C' || unit == 'c') {
            System.out.printf("It is %.1f in C", degrees);
        } else if (unit != 'C' && unit != 'c') {
            System.out.printf("It is %.1f in C", ((degrees - 32) * (5.0 / 9.0)));
        }
    }
    public void writeF() {
        if (this.unit == 'F' || this.unit == 'f') {
            System.out.printf("It is %.1f in F", degrees);
        } else if (this.unit != 'F' && this.unit != 'f') {
            System.out.printf("It is %.1f in F", ((degrees * (9.0 / 5.0)) + 32));
        }
    }

    // Getter methods
    public double getC() {
        if (this.unit == 'C' || this.unit == 'c') {
            return degrees;
        } else if (this.unit == 'F' || this.unit == 'f') {
            return ((degrees - 32) * (5.0 / 9.0));
        } else {
            System.out.println("input error. Error code: 1");
            return 1;
        }
    }

    public double getF() {
        if (this.unit == 'F' || this.unit == 'f') {
            return degrees;
        } else if (this.unit == 'C' || this.unit == 'c') {
            return ((degrees * (9.0 / 5.0)) + 32);
        } else {
            System.out.println("input error. Error code: 2");
            return 2;
        }
    }

    // Setter methods
    public void set(double degrees, char unit) {
        this.degrees = degrees;
        this.unit  = unit;
    }
    public void set(char unit) {
        this.unit  = unit;
    }
    public void set(double degrees) {
        this.degrees = degrees;
    }






}
