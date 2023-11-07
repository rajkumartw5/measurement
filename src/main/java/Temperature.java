import java.util.Objects;

public class Temperature {
    private final double value;
    private final TemperatureUnit unit;
    public Temperature(double value, TemperatureUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Temperature that)) return false;

        if (this.unit.equals(TemperatureUnit.CELSIUS) && that.unit.equals(TemperatureUnit.FARENHEIT)) {
            Temperature tempInF = this.convertCToF();
            return tempInF.value == that.value;
        } else if (this.unit.equals(TemperatureUnit.CELSIUS) && that.unit.equals(TemperatureUnit.KELVIN)) {
            Temperature tempInK = this.convertCToK();
            return tempInK.value == that.value;
        }
//        if (this.unit.equals(that.unit)){
//            return value == that.value;
//        } else

        return unit.equals(that.unit) && value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }


    public Temperature convertCToF(){
        return new Temperature((9/5) * this.value + 32, TemperatureUnit.FARENHEIT);
    }

    public Temperature convertCToK() {
        return new Temperature(this.value + 273.15, TemperatureUnit.KELVIN);
    }

    public Temperature convertFToC() {
        return new Temperature((5/9) * (this.value - 32), TemperatureUnit.CELSIUS);
    }

    public Temperature convertFToK() {
        return new Temperature((5/9) * (this.value + 459.67), TemperatureUnit.KELVIN);
    }
}
