package temperatureconversor;

public interface ITemperature {

    static final double CELSIUS_FAHRENHEIT_SCALE = 9d / 5d;
    static final double FAHRENHEIT_CELSIUS_SCALE = 5d / 9d;
    static final double OFFSET = 32d;

    double getCelsiusValue();

    double getFahrenheitValue();

}
