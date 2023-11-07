import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MeasurementTest {
    @Test
    public void test1cmIs1cm() {
        Measurement measurement = new Measurement();
        assertTrue(measurement.checkCentimeter(1, 1));
    }

    @Test
    public void test2cmIsNot1cm() {
        Measurement measurement = new Measurement();
        assertFalse(measurement.checkCentimeter(2,1));
    }

    @Test
    public void shouldThrowExceptionForNegativeCm() {
        Measurement measurement = new Measurement();
        assertThrows(IllegalArgumentException.class, () -> measurement.checkCentimeter(-1,-1));
    }
}
