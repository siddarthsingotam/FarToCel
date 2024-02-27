public class TemperatureConvertor {

    public double convertToCelcius(double temp) {
        return (temp - 32) * 5 / 9;
    }

    public double convertToFahrenheit(double temp) {
        return (temp * 9 / 5) + 32;
    }

    public float kelvinToCelsius(float kelvin) {
        return (float) (kelvin - 273.15);
    }

}
