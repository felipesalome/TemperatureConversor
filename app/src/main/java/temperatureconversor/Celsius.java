package temperatureconversor;

public class Celsius implements ITemperature {

    private double temperature; 

    public Celsius(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public double getCelsiusValue() {
        return this.temperature;
    }

    @Override
    public double getFahrenheitValue() {
        return (this.temperature * CELSIUS_FAHRENHEIT_SCALE) + OFFSET;
    }

}
