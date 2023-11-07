import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MeasurementTest {
    @Test
    public void test1cmIs1cm() {
        Measurement oneCentimeter = new Measurement(1, Unit.CENTIMETER);
        Measurement anotherOneCentimeter = new Measurement(1, Unit.CENTIMETER);
        assertTrue(oneCentimeter.equals(anotherOneCentimeter));
//        assertTrue(measurement.checkCentimeter(1, 1));
    }

    @Test
    public void test2cmIsNot1cm() {
        Measurement oneCentimeter = new Measurement(1, Unit.CENTIMETER);
        Measurement twoCentimeter = new Measurement(2, Unit.CENTIMETER);
        assertFalse(oneCentimeter.equals(twoCentimeter));
//        Measurement measurement = new Measurement(1, "cm");
//        assertFalse(measurement.checkCentimeter(2,1));
    }

    @Test
    public void shouldReturnTrueIf1meterEquals100Centimeters() {
        Measurement oneMeter = new Measurement(1, Unit.METER);
        Measurement hundredCentimeters = new Measurement(100, Unit.CENTIMETER);
        assertTrue(oneMeter.equals(hundredCentimeters));
    }

    @Test
    public void shouldReturn2mWhileAdding1mAnd100Cm() {
        Measurement oneMeter = new Measurement(1, Unit.METER);
        Measurement hundredCentimeters = new Measurement(100, Unit.CENTIMETER);
        Measurement twoMeters = new Measurement(2, Unit.METER);
        assertTrue(twoMeters.equals(oneMeter.add(hundredCentimeters)));
    }

    @Test
    public void shouldReturn300cmWhileAdding200cmAnd1m() {
        Measurement twoHundredCentimeters = new Measurement(200, Unit.CENTIMETER);
        Measurement oneMeter = new Measurement(1, Unit.METER);
        Measurement threeHundredCentimeters = new Measurement(300, Unit.CENTIMETER);
        assertTrue(threeHundredCentimeters.equals(twoHundredCentimeters.add(oneMeter)));
    }

//    @Test
//    public void shouldThrowExceptionForNegativeCm() {
//        Measurement measurement = new Measurement(1, "cm");
//        assertThrows(IllegalArgumentException.class, () -> measurement.checkCentimeter(-1,-1));
//    }
}
