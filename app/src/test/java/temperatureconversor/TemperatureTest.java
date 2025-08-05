package temperatureconversor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TemperatureTest {

    @ParameterizedTest
    @CsvSource({
        "0,     32",
        "100,   212",
        "25,    77",
        "37.5,  99.5"
    })
    void shouldConvertCelsiusToFahrenheit(double cTemperature, double fTemperatureExpected) {
        ITemperature instance = new Celsius(cTemperature);

        assertEquals(fTemperatureExpected, instance.getFahrenheitValue());
    }
    
    @ParameterizedTest
    @CsvSource({
        "32,    0",
        "212,   100",
        "77,    25",
        "99.5,  37.5"
    })
    void shouldConvertFahrenheitToCelsius(double fTemperature, double cTemperatureExpected) {
        ITemperature instance = new Fahrenheit(fTemperature);

        assertEquals(cTemperatureExpected, instance.getCelsiusValue());
    }

    @Test void shouldConvertOmnidirectionalStartingFromCelsius() {
        double cExpected = 25d;

        ITemperature instance = new Celsius(cExpected);
        instance = new Fahrenheit(instance.getFahrenheitValue());

        assertEquals(cExpected, instance.getCelsiusValue());
    }

    @Test void shouldConvertOmnidirectionalStartingFromFahrenheit() {
        double fExpected = 32d;

        ITemperature instance = new Fahrenheit(fExpected);
        instance = new Celsius(instance.getCelsiusValue());

        assertEquals(fExpected, instance.getFahrenheitValue());
    }
}
