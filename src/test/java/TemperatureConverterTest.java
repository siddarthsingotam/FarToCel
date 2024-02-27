import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TemperatureConverterTest {


     TemperatureConvertor temperatureConverter = new TemperatureConvertor();


    @Test
    public void testConvertToCelcius() {
        double input = 32;
        double expected = 0;
        double result = temperatureConverter.convertToCelcius(input);
        assertEquals(expected, result, 0.0001);
    }

    @Test
    public void testConvertToFahrenheit() {
        double input = 0;
        double expected = 32;
        double result = temperatureConverter.convertToFahrenheit(input);
        assertEquals(expected, result, 0.0001);
    }

    @Test
    public void testKelvinToCelsius() {
        float input = 273.15f;
        float expected = 0;
        float result = temperatureConverter.kelvinToCelsius(input);
        assertEquals(expected, result, 0.0001);
    }
}
