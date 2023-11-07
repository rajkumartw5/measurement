import java.util.Objects;

public class Measurement {
    private final double value;
    private final Unit unit;

    public Measurement(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Measurement that)) return false;
        return value == that.value &&  Objects.equals(unit, that.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }

    public Measurement add(Measurement measurement) {
        //double convertedValue = 0;
        if(this.unit == Unit.METER)
            return new Measurement(this.value + (measurement.value * measurement.unit.factor), this.unit);
        else
            return new Measurement(this.value + (measurement.value / this.unit.factor), this.unit);
            //convertedValue = measurement.value / this.unit.factor;
        //return new Measurement(this.value + convertedValue, this.unit);
    }



//    public double convert(Measurement measurement, double conversionFactor) {
//        return measurement.value * conversionFactor;
//    }

//    public int convertMeterToCentimeter(Measurement measurement) {
//        if (this.unit.equals(Unit.METER)) {
//            if (measurement.unit.equals(Unit.CENTIMETER)) {
//                return 100;
//            }
//        }
//    }

    public boolean checkCentimeter(int givenUnit, int unitToCheck) {
        if (givenUnit < 0 || unitToCheck < 0)
            throw new IllegalArgumentException();
        return givenUnit == unitToCheck;
    }
}
