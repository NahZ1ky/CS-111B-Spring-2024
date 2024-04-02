public class Temperature {
    private double degrees;
    private char unit;

// Constructor
    // init both values
    Temperature(double degrees, char unit) {
        this.degrees = degrees;
        this.unit = unit;
    }

    // init only degrees
    Temperature(double degrees) {
        this(degrees, 'C');
    }

    // init only unit
    Temperature(char unit) {
        this(0.0, unit);
    }

    // init nothing, default to: 0.0 degree Celsius
    Temperature() {
        this(0.0, 'C');
    }




// Write methods
    // output both values
    public void writeOutput() { // debugger
        System.out.printf("Temperature = %.1f degree %c", degrees, unit);
    }

    // output C value
    public void writeC() { // something is wrong HERE
        if (unit == 'C' || unit == 'c') {
            System.out.printf("Temperature = %.1f degree C", degrees);
        } else if (unit != 'C' && unit != 'c') {
            System.out.printf("Temperature = %.1f degree C", ((degrees - 32) * (5.0 / 9.0)));
        }
    }

    // output F value
    public void writeF() {
        if (this.unit == 'F' || this.unit == 'f') {
            System.out.printf("Temperature = %.1f degree F", degrees);
        } else if (this.unit != 'F' && this.unit != 'f') {
            System.out.printf("Temperature = %.1f degree F", ((degrees * (9.0 / 5.0)) + 32));
        }
    }




// Getter methods
    // get C value
    public double getC() {
        if (this.unit == 'C' || this.unit == 'c') {
            return degrees;
        } else if (this.unit == 'F' || this.unit == 'f') {
            return ((degrees - 32) * (5.0 / 9.0));
        } else {// error code: 1
            System.out.println("input error. Error code: 1");
            return 1;
        }
    }

    // get F value
    public double getF() {
        if (this.unit == 'F' || this.unit == 'f') {
            return degrees;
        } else if (this.unit == 'C' || this.unit == 'c') {
            return ((degrees * (9.0 / 5.0)) + 32);
        } else { // error code: 2
            System.out.println("input error. Error code: 2");
            return 2;
        }
    }




// Setter methods
    // set both values
    public void set(double degrees, char unit) {
        this.degrees = degrees;
        this.unit  = unit;
    }

    // set only units
    public void set(char unit) {
        this.unit  = unit;
    }

    // set only degrees
    public void set(double degrees) {
        this.degrees = degrees;
    }




    // toString method
    public String toString(){
        String result = "temperature " + this.degrees + this.unit;
        return result;
    }
}
