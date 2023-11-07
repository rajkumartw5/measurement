public class Measurement {
    public boolean checkCentimeter(int givenUnit, int unitToCheck) {
        if (givenUnit < 0 || unitToCheck < 0)
            throw new IllegalArgumentException();
        return givenUnit == unitToCheck;
    }
}
