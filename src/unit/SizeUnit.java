package unit;

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
}
