package unit.general;

/**
 * 
 * @author Markus Wichmann
 * 
 */
public enum Length implements Unit {
    METER(1.0, "m"),
    INCH(39.37, "\""),
    FOOT(INCH.getFactorToBase() * 12.0, "foot"),
    YARD(FOOT.getFactorToBase() * 3.0, "yrd");

    private final double factorToBase;
    private final String unitSymbol;

    private Length(final double factorToBase, final String unitSymbol) {
        this.factorToBase = factorToBase;
        this.unitSymbol = unitSymbol;
    }

    public double getFactorToBase() {
        return factorToBase;
    }
    
    public String getSymbol() {
        return unitSymbol;
    }
}
