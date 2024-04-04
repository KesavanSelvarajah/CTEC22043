public class Temperature {
    private double celsius;
    private double fahrenheit;

    Temperature() {

    }

    Temperature(double celsius) {
        this.celsius = celsius;
    }

    public double toCelsius() {
        return celsius;
    }

    public double toFahrenheit() {
        return fahrenheit;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public void calculateFahrenheit() {
        fahrenheit = celsius * 9 / 5 + 32;
    }

    public void calculateCelsius() {
        celsius = (fahrenheit - 32) * 5 / 9;
    }

}
