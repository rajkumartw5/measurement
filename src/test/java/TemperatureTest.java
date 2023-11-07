import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TemperatureTest {
    @Test
    public void shouldReturnTrueIf0CelsiusEquals32F() {
        Temperature zeroC = new Temperature(0, TemperatureUnit.CELSIUS);
        Temperature thirtyTwoF = new Temperature(32, TemperatureUnit.FARENHEIT);
        assertTrue(zeroC.equals(thirtyTwoF));
    }

    @Test
    public void shouldReturnTrueIf0CelsiusNotEquals1F() {
        Temperature zeroC = new Temperature(0, TemperatureUnit.CELSIUS);
        Temperature oneF = new Temperature(1, TemperatureUnit.FARENHEIT);
        assertFalse(zeroC.equals(oneF));
    }

    @Test
    public void shouldReturnTrueIf0Celsius273K() {
        Temperature zeroC = new Temperature(0, TemperatureUnit.CELSIUS);
        Temperature kelvin = new Temperature(273.15, TemperatureUnit.KELVIN);
        assertTrue(zeroC.equals(kelvin));
    }
}
