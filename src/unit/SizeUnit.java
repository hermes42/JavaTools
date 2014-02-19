package unit;

import java.security.InvalidParameterException;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

/**
 * A SizeUnit represents a data size such as bytes. It contains methods to
 * convert between different SizeUnits.
 * 
 * @author Markus Wichmann
 * 
 */
public enum SizeUnit {

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
	private final double factorToByte;

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
	private SizeUnit(final double factor, final String symbol) {
		factorToByte = factor;
		unitSymbol = symbol;
	}

	/**
	 * Converts the given value in the current unit to byte.
	 * 
	 * @param b
	 *            value in current unit
	 * @return value in byte
	 */
	public double toByte(final double b) {
		return b * factorToByte;
	}

	/**
	 * Converts the given value in the current unit to KB (SI unit).
	 * 
	 * @param b
	 *            value in current unit
	 * @return value in KB
	 */
	public double toKB(final double b) {
		return b * (factorToByte / KB.factorToByte);
	}

	/**
	 * Converts the given value in the current unit to KiB (binary unit).
	 * 
	 * @param b
	 *            value in current unit
	 * @return value in KiB
	 */
	public double toKiB(final double b) {
		return b * (factorToByte / KIB.factorToByte);
	}

	/**
	 * Converts the given value in the current unit to MB (SI unit).
	 * 
	 * @param b
	 *            value in current unit
	 * @return value in MB
	 */
	public double toMB(final double b) {
		return b * (factorToByte / MB.factorToByte);
	}

	/**
	 * Converts the given value in the current unit to MiB (binary unit).
	 * 
	 * @param b
	 *            value in current unit
	 * @return value in MiB
	 */
	public double toMiB(final double b) {
		return b * (factorToByte / MIB.factorToByte);
	}

	/**
	 * Converts the given value in the current unit to GB (SI unit).
	 * 
	 * @param b
	 *            value in current unit
	 * @return value in GB
	 */
	public double toGB(final double b) {
		return b * (factorToByte / GB.factorToByte);
	}

	/**
	 * Converts the given value in the current unit to GiB (binary unit).
	 * 
	 * @param b
	 *            value in current unit
	 * @return value in GiB
	 */
	public double toGiB(final double b) {
		return b * (factorToByte / GIB.factorToByte);
	}

	/**
	 * Converts the given value in the current unit to TB (SI unit).
	 * 
	 * @param b
	 *            value in current unit
	 * @return value in TB
	 */
	public double toTB(final double b) {
		return b * (factorToByte / TB.factorToByte);
	}

	/**
	 * Converts the given value in the current unit to TiB (binary unit).
	 * 
	 * @param b
	 *            value in current unit
	 * @return value in TiB
	 */
	public double toTiB(final double b) {
		return b * (factorToByte / TIB.factorToByte);
	}

	/**
	 * Converts the given value in the current unit to PB (SI unit).
	 * 
	 * @param b
	 *            value in current unit
	 * @return value in PB
	 */
	public double toPB(final double b) {
		return b * (factorToByte / PB.factorToByte);
	}

	/**
	 * Converts the given value in the current unit to PiB (binary unit).
	 * 
	 * @param b
	 *            value in current unit
	 * @return value in PiB
	 */
	public double toPiB(final double b) {
		return b * (factorToByte / PIB.factorToByte);
	}

	/**
	 * Converts the given value in the current unit to EB (SI unit).
	 * 
	 * @param b
	 *            value in current unit
	 * @return value in EB
	 */
	public double toEB(final double b) {
		return b * (factorToByte / EB.factorToByte);
	}

	/**
	 * Converts the given value in the current unit to EiB (binary unit).
	 * 
	 * @param b
	 *            value in current unit
	 * @return value in EiB
	 */
	public double toEiB(final double b) {
		return b * (factorToByte / EIB.factorToByte);
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
	 * Convert the given value in the given unit to this unit.
	 * 
	 * @param b
	 *            value in the given unit
	 * @param u
	 *            unit of the value
	 * @return converted value in this unit
	 */
	public double convert(final double b, final SizeUnit u) {
		return b * (u.factorToByte / factorToByte);
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
	public String format(final double b, final SizeUnit u) {
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
	public static SizeUnit getBySymbol(final String symbol) {
		String tmp = symbol.trim();
		for (SizeUnit unit : SizeUnit.values()) {
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
	public static String formatValueSI(final double b, final SizeUnit u) {
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
		if (b >= SizeUnit.EB.factorToByte) {
			return SizeUnit.EB.format(b);
		} else if (b >= SizeUnit.PB.factorToByte) {
			return SizeUnit.PB.format(b);
		} else if (b >= SizeUnit.TB.factorToByte) {
			return SizeUnit.TB.format(b);
		} else if (b >= SizeUnit.GB.factorToByte) {
			return SizeUnit.GB.format(b);
		} else if (b >= SizeUnit.MB.factorToByte) {
			return SizeUnit.MB.format(b);
		} else if (b >= SizeUnit.KB.factorToByte) {
			return SizeUnit.KB.format(b);
		} else {
			return SizeUnit.BYTE.format(b);
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
	public static String formatValueBinary(final double b, final SizeUnit u) {
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
		if (b >= SizeUnit.EIB.factorToByte) {
			return SizeUnit.EIB.format(b);
		} else if (b >= SizeUnit.PIB.factorToByte) {
			return SizeUnit.PIB.format(b);
		} else if (b >= SizeUnit.TIB.factorToByte) {
			return SizeUnit.TIB.format(b);
		} else if (b >= SizeUnit.GIB.factorToByte) {
			return SizeUnit.GIB.format(b);
		} else if (b >= SizeUnit.MIB.factorToByte) {
			return SizeUnit.MIB.format(b);
		} else if (b >= SizeUnit.KIB.factorToByte) {
			return SizeUnit.KIB.format(b);
		} else {
			return SizeUnit.BYTE.format(b);
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
		SizeUnit unit = getBySymbol(tokenizer.nextToken());

		if (unit == null) {
			throw new NullPointerException("No size unit with the given symbol found");
		}

		return unit.toByte(value);
	}
}
