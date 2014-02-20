package unit;

import java.security.InvalidParameterException;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

import unit.general.Unit;

/**
 * A SizeUnit represents a data size such as bytes. It contains methods to
 * convert between different SizeUnits.
 * 
 * @author Markus Wichmann
 * 
 */
public enum Size implements Unit {

    /**
     * Size in byte.
     */
    BYTE(1, "byte"),
    /**
     * Size in Kilobyte (SI). 1 KB = 1000 byte
     */
    KB(1000, "kB"),
    /**
     * Size in Kilobyte (binary). 1 KB = 1024 byte
     */
    KIB(1024.0, "KiB"),
    /**
     * Size in Megabyte (SI). 1 MB = 1000 KB = 1000000 byte
     */
    MB(1000000.0, "MB"),
    /**
     * Size in Megabyte (binary). 1 MB = 1024 KB = 1048576 byte
     */
    MIB(1048576.0, "MiB"),
    /**
     * Size in Gigabyte (SI). 1 GB = 1000 MB = 1000000 KB = 1000000000 byte
     */
    GB(1000000000.0, "GB"),
    /**
     * Size in Gigabyte (binary). 1 GB = 1024 MB = 1048576 KB = 1073741824 byte
     */
    GIB(1073741824.0, "GiB"),
    /**
     * Size in Terabyte (SI). 1 TB = 1000 GB = 1000000 MB = 1000000000 KB
     */
    TB(1000000000000.0, "TB"),
    /**
     * Size in Terabyte (binary). 1 TB = 1024 GB = 1048576 MB = 1073741824 KB
     */
    TIB(1099511627776.0, "TiB"),
    /**
     * Size in Petabyte (SI). 1 PB = 1000 TB = 1000000 GB = 1000000000 MB
     */
    PB(1000000000000000.0, "PB"),
    /**
     * Size in Petabyte (binary). 1 PB = 1024 TB = 1048576 GB = 1073741824 MB
     */
    PIB(1125899906842624.0, "PiB"),
    /**
     * Size in Exabyte (SI). 1 EB = 1000 PB = 1000000 TB = 1000000000 GB
     */
    EB(1000000000000000000.0, "EB"),
    /**
     * Size in Exabyte (binary). 1 EiB = 1024 PiB = 1048576 TiB = 1073741824 GiB
     */
    EIB(1152921504606846976.0, "EiB");

    private static final String STRING_FORMAT = "%s %s";
    private static final DecimalFormat VALUE_FORMAT_LARGE = new DecimalFormat("0.##");
    private static final DecimalFormat VALUE_FORMAT_SMALL = new DecimalFormat("0");

    /**
     * Factor of this unit to bytes as base unit.
     */
    private final double factorToBase;

    /**
     * This units symbol, e.g. byte, kB, KiB, MB or MiB.
     */
    private final String unitSymbol;

    /**
     * Creates a new SizeUnit instance. Only used for constant enum values
     * above. Both parameter are saved in instance variables.
     * 
     * @param factor
     *            factor to byte
     * @param symbol
     *            unit symbol
     */
    private Size(final double factor, final String symbol) {
        factorToBase = factor;
        unitSymbol = symbol;
    }

    /**
     * Gets the factor this unit types base unit. 
     * 
     * @return factor to the base unit
     */
    public double getFactorToBase() {
        return factorToBase;
    }
    
    /**
     * Gets the symbol for this unit, e.g. byte, KB, KiB, MB or MiB.
     * 
     * @return symbol of this unit
     */
    public String getSymbol() {
        return unitSymbol;
    }
    
    /**
     * Converts the given value in the current unit to byte.
     * 
     * @param b
     *            value in current unit
     * @return value in byte
     */
    public double toByte(final double b) {
        return b * factorToBase;
    }

    /**
     * Converts the given value in the current unit to KB (SI unit).
     * 
     * @param b
     *            value in current unit
     * @return value in KB
     */
    public double toKB(final double b) {
        return b * (factorToBase / KB.factorToBase);
    }

    /**
     * Converts the given value in the current unit to KiB (binary unit).
     * 
     * @param b
     *            value in current unit
     * @return value in KiB
     */
    public double toKiB(final double b) {
        return b * (factorToBase / KIB.factorToBase);
    }

    /**
     * Converts the given value in the current unit to MB (SI unit).
     * 
     * @param b
     *            value in current unit
     * @return value in MB
     */
    public double toMB(final double b) {
        return b * (factorToBase / MB.factorToBase);
    }

    /**
     * Converts the given value in the current unit to MiB (binary unit).
     * 
     * @param b
     *            value in current unit
     * @return value in MiB
     */
    public double toMiB(final double b) {
        return b * (factorToBase / MIB.factorToBase);
    }

    /**
     * Converts the given value in the current unit to GB (SI unit).
     * 
     * @param b
     *            value in current unit
     * @return value in GB
     */
    public double toGB(final double b) {
        return b * (factorToBase / GB.factorToBase);
    }

    /**
     * Converts the given value in the current unit to GiB (binary unit).
     * 
     * @param b
     *            value in current unit
     * @return value in GiB
     */
    public double toGiB(final double b) {
        return b * (factorToBase / GIB.factorToBase);
    }

    /**
     * Converts the given value in the current unit to TB (SI unit).
     * 
     * @param b
     *            value in current unit
     * @return value in TB
     */
    public double toTB(final double b) {
        return b * (factorToBase / TB.factorToBase);
    }

    /**
     * Converts the given value in the current unit to TiB (binary unit).
     * 
     * @param b
     *            value in current unit
     * @return value in TiB
     */
    public double toTiB(final double b) {
        return b * (factorToBase / TIB.factorToBase);
    }

    /**
     * Converts the given value in the current unit to PB (SI unit).
     * 
     * @param b
     *            value in current unit
     * @return value in PB
     */
    public double toPB(final double b) {
        return b * (factorToBase / PB.factorToBase);
    }

    /**
     * Converts the given value in the current unit to PiB (binary unit).
     * 
     * @param b
     *            value in current unit
     * @return value in PiB
     */
    public double toPiB(final double b) {
        return b * (factorToBase / PIB.factorToBase);
    }

    /**
     * Converts the given value in the current unit to EB (SI unit).
     * 
     * @param b
     *            value in current unit
     * @return value in EB
     */
    public double toEB(final double b) {
        return b * (factorToBase / EB.factorToBase);
    }

    /**
     * Converts the given value in the current unit to EiB (binary unit).
     * 
     * @param b
     *            value in current unit
     * @return value in EiB
     */
    public double toEiB(final double b) {
        return b * (factorToBase / EIB.factorToBase);
    }

    /**
     * Convert the given value in the given unit to this unit.
     * 
     * @param b
     *            value in the given unit
     * @param u
     *            unit of the value
     * @return converted value in this unit
     */
    public double convert(final double b, final Size u) {
        return b * (u.factorToBase / factorToBase);
    }

    /**
     * Formats the given value into a string in this value.
     * 
     * @param b
     *            byte value to format
     * @return formatted String representation of the given value
     */
    public String format(final double b) {
        return format(b, BYTE);
    }

    /**
     * Formats the given value into a string in this value.
     * 
     * @param b
     *            value to format
     * @param u
     *            SizeUnit for the value
     * @return formatted String representation of the given value
     */
    public String format(final double b, final Size u) {
        DecimalFormat decimalFormat = VALUE_FORMAT_LARGE;
        if (this == BYTE) {
            decimalFormat = VALUE_FORMAT_SMALL;
        }
        return String.format(STRING_FORMAT, decimalFormat.format(this.convert(b, u)), this.getSymbol());
    }

    /**
     * Retrieves the corresponding SizeUnit for the given unit symbol.
     * 
     * @param symbol
     *            unit symbol to search for
     * @return SizeUnit for the given unit symbol or null
     */
    public static Size getBySymbol(final String symbol) {
        String tmp = symbol.trim();
        for (Size unit : Size.values()) {
            if (unit.getSymbol().equals(tmp)) {
                return unit;
            }
        }
        return null;
    }

    /**
     * Formats the given value in the best suitable SizeUnit. Only SI units are
     * used.
     * 
     * @param b
     *            value to format
     * @param u
     *            SizeUnit of the value
     * @return formatted String representation of the given value
     */
    public static String formatValueSI(final double b, final Size u) {
        return formatValueSI(u.toByte(b));
    }

    /**
     * Formats the given byte value in the best suitable SizeUnit. Only SI units
     * are used.
     * 
     * @param b
     *            byte value to format
     * @return formatted String representation of the given value
     */
    public static String formatValueSI(final double b) {
        if (b >= Size.EB.factorToBase) {
            return Size.EB.format(b);
        } else if (b >= Size.PB.factorToBase) {
            return Size.PB.format(b);
        } else if (b >= Size.TB.factorToBase) {
            return Size.TB.format(b);
        } else if (b >= Size.GB.factorToBase) {
            return Size.GB.format(b);
        } else if (b >= Size.MB.factorToBase) {
            return Size.MB.format(b);
        } else if (b >= Size.KB.factorToBase) {
            return Size.KB.format(b);
        } else {
            return Size.BYTE.format(b);
        }
    }

    /**
     * Formats the given value in the best suitable SizeUnit. Only binary units
     * are used.
     * 
     * @param b
     *            value to format
     * @param u
     *            SizeUnit of the value
     * @return formatted String representation of the given value
     */
    public static String formatValueBinary(final double b, final Size u) {
        return formatValueBinary(u.toByte(b));
    }

    /**
     * Formats the given byte value in the best suitable SizeUnit. Only binary
     * units are used.
     * 
     * @param b
     *            byte value to format
     * @return formatted String representation of the given value
     */
    public static String formatValueBinary(final double b) {
        if (b >= Size.EIB.factorToBase) {
            return Size.EIB.format(b);
        } else if (b >= Size.PIB.factorToBase) {
            return Size.PIB.format(b);
        } else if (b >= Size.TIB.factorToBase) {
            return Size.TIB.format(b);
        } else if (b >= Size.GIB.factorToBase) {
            return Size.GIB.format(b);
        } else if (b >= Size.MIB.factorToBase) {
            return Size.MIB.format(b);
        } else if (b >= Size.KIB.factorToBase) {
            return Size.KIB.format(b);
        } else {
            return Size.BYTE.format(b);
        }
    }

    /**
     * Parses the given input String to its byte value. Supports all size units
     * this class supports.
     * 
     * @param input
     *            String to parse
     * @return number of byte as represented by input
     * @throws InvalidParameterException
     *             if string doesn't contain two parts seperated by ' ' or '\t'.
     * @throws NumberFormatException
     *             if first part of the string isn't a valid number
     */
    public static double parse(final String input) throws InvalidParameterException, NumberFormatException {
        StringTokenizer tokenizer = new StringTokenizer(input.trim());
        if (tokenizer.countTokens() != 2) {
            throw new InvalidParameterException("input should only contain a number and a unit symbol");
        }

        double value = Double.parseDouble(tokenizer.nextToken());
        Size unit = getBySymbol(tokenizer.nextToken());

        if (unit == null) {
            throw new NullPointerException("No size unit with the given symbol found");
        }

        return unit.toByte(value);
    }

}
