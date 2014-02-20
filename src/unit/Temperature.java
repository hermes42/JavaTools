package unit;

/**
 * 
 * @author Markus Wichmann
 * 
 */
public enum Temperature {
    // TODO implements Unit

    KELVIN {
        @Override
        public double toCelsius(double t) {
            return t - CELSIUS_OFFSET;
        }

        @Override
        public double toFahrenheit(double t) {
            return (t * FAHRENHEIT_FACTOR) - FAHRENHEIT_OFFSET;
        }

        @Override
        public double toKelvin(double t) {
            return t;
        }

        @Override
        public double convert(double t, Temperature u) {
            return u.toKelvin(t);
        }
    },
    CELSIUS {
        @Override
        public double toCelsius(double t) {
            return t;
        }

        @Override
        public double toFahrenheit(double t) {
            return (t + CELSIUS_OFFSET) * FAHRENHEIT_FACTOR - FAHRENHEIT_OFFSET;
        }

        @Override
        public double toKelvin(double t) {
            return t + CELSIUS_OFFSET;
        }

        @Override
        public double convert(double t, Temperature u) {
            return u.toCelsius(t);
        }
    },
    FAHRENHEIT {
        @Override
        public double toCelsius(double t) {
            return ((t + FAHRENHEIT_OFFSET) / FAHRENHEIT_FACTOR) - CELSIUS_OFFSET;
        }

        @Override
        public double toFahrenheit(double t) {
            return t;
        }

        @Override
        public double toKelvin(double t) {
            return (t + FAHRENHEIT_OFFSET) / FAHRENHEIT_FACTOR;
        }

        @Override
        public double convert(double t, Temperature u) {
            return u.toFahrenheit(t);
        }
    };

    private static final double CELSIUS_OFFSET = 273.15;
    private static final double FAHRENHEIT_OFFSET = 459.67;
    private static final double FAHRENHEIT_FACTOR = 1.8;

    public double toCelsius(double t) {
        throw new AbstractMethodError();
    }

    public double toFahrenheit(double t) {
        throw new AbstractMethodError();
    }

    public double toKelvin(double t) {
        throw new AbstractMethodError();
    }

    public double convert(double t, Temperature u) {
        throw new AbstractMethodError();
    }

}
