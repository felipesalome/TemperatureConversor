package temperatureconversor;

public class Fahrenheit implements ITemperature {

    private double temperature;

    public Fahrenheit(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public double getCelsiusValue() {
        return (temperature - OFFSET) * FAHRENHEIT_CELSIUS_SCALE;
    }

    @Override
    public double getFahrenheitValue() {
        return this.temperature;
    }

}
