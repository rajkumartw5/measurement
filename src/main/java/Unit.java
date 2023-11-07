public enum Unit {
    CENTIMETER(0.01), METER(1), KILOMETER(1000);
    final double factor;
    Unit(double conversionFactor){
        this.factor = conversionFactor;
    }
}
