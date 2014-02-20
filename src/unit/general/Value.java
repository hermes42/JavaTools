package unit.general;

/**
 * Represents a decimal value and its unit. Object of this type are immutable.
 * 
 * @author Markus Wichmann
 * 
 */
class Value<T extends Unit> {

    protected double value;
    protected T unit;
    
    Value(double value, T unit) {
        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public T getUnit() {
        return unit;
    }
    
    public Value<T> add(Value<T> other) {
        throw new UnsupportedOperationException("add is not yet implemented!");
    }
    
    public Value<T> sub(Value<T> other) {
        throw new UnsupportedOperationException("sub is not yet implemented!");
    }
    
    // TODO what's with mul, div and exp? "exponent" of unit also changes?
    // TODO how to use scalar values?
    // TODO create inherited classes of Value or use this class for everything?
}
