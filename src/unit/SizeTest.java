package unit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.text.DecimalFormatSymbols;

import org.junit.Test;

/**
 * Test for SizeUnit.
 * 
 * @author Markus Wichmann
 * 
 */
public class SizeTest {

	private static final char DOT = DecimalFormatSymbols.getInstance().getDecimalSeparator();

	@Test
	public void toByte() {

		Size.MB.toMiB(100.0);

		assertThat(Size.BYTE.toByte(0.0), is(0.0));
		assertThat(Size.BYTE.toByte(1.0), is(1.0));
		assertThat(Size.KB.toByte(1.0), is(1000.0));
		assertThat(Size.KIB.toByte(1.0), is(1024.0));
		assertThat(Size.MB.toByte(1.0), is(1000000.0));
		assertThat(Size.MIB.toByte(1.0), is(1048576.0));
		assertThat(Size.GB.toByte(1.0), is(1000000000.0));
		assertThat(Size.GIB.toByte(1.0), is(1073741824.0));
		assertThat(Size.TB.toByte(1.0), is(1000000000000.0));
		assertThat(Size.TIB.toByte(1.0), is(1099511627776.0));
		assertThat(Size.PB.toByte(1.0), is(1000000000000000.0));
		assertThat(Size.PIB.toByte(1.0), is(1125899906842624.0));
		assertThat(Size.EB.toByte(1.0), is(1000000000000000000.0));
		assertThat(Size.EIB.toByte(1.0), is(1152921504606846976.0));
	}

	@Test
	public void toKB() {
		assertThat(Size.BYTE.toKB(0.0), is(0.0));
		assertThat(Size.BYTE.toKB(1.0), is(0.001));
		assertThat(Size.KB.toKB(1.0), is(1.0));
		assertThat(Size.KIB.toKB(1.0), is(1.024));
		assertThat(Size.MB.toKB(1.0), is(1000.0));
		assertThat(Size.MIB.toKB(1.0), is(1048.576));
		assertThat(Size.GB.toKB(1.0), is(1000000.0));
		assertThat(Size.GIB.toKB(1.0), is(1073741.824));
		assertThat(Size.TB.toKB(1.0), is(1000000000.0));
		assertThat(Size.TIB.toKB(1.0), is(1099511627.776));
		assertThat(Size.PB.toKB(1.0), is(1000000000000.0));
		assertThat(Size.PIB.toKB(1.0), is(1125899906842.624));
		assertThat(Size.EB.toKB(1.0), is(1000000000000000.0));
		assertThat(Size.EIB.toKB(1.0), is(1152921504606846.976));
	}

	@Test
	public void toKiB() {
		assertThat(Size.BYTE.toKiB(0.0), is(0.0));
		assertThat(Size.BYTE.toKiB(1.0), is(0.0009765625));
		assertThat(Size.KB.toKiB(1.0), is(0.9765625));
		assertThat(Size.KIB.toKiB(1.0), is(1.0));
		assertThat(Size.MB.toKiB(1.0), is(976.5625));
		assertThat(Size.MIB.toKiB(1.0), is(1024.0));
		assertThat(Size.GB.toKiB(1.0), is(976562.5));
		assertThat(Size.GIB.toKiB(1.0), is(1048576.0));
		assertThat(Size.TB.toKiB(1.0), is(976562500.0));
		assertThat(Size.TIB.toKiB(1.0), is(1073741824.0));
		assertThat(Size.PB.toKiB(1.0), is(976562500000.0));
		assertThat(Size.PIB.toKiB(1.0), is(1099511627776.0));
		assertThat(Size.EB.toKiB(1.0), is(976562500000000.0));
		assertThat(Size.EIB.toKiB(1.0), is(1125899906842624.0));
	}

	@Test
	public void toMB() {
		assertThat(Size.BYTE.toMB(0.0), is(0.0));
		assertThat(Size.BYTE.toMB(1.0), is(0.000001));
		assertThat(Size.KB.toMB(1.0), is(0.001));
		assertThat(Size.KIB.toMB(1.0), is(0.001024));
		assertThat(Size.MB.toMB(1.0), is(1.0));
		assertThat(Size.MIB.toMB(1.0), is(1.048576));
		assertThat(Size.GB.toMB(1.0), is(1000.0));
		assertThat(Size.GIB.toMB(1.0), is(1073.741824));
		assertThat(Size.TB.toMB(1.0), is(1000000.0));
		assertThat(Size.TIB.toMB(1.0), is(1099511.627776));
		assertThat(Size.PB.toMB(1.0), is(1000000000.0));
		assertThat(Size.PIB.toMB(1.0), is(1125899906.842624));
		assertThat(Size.EB.toMB(1.0), is(1000000000000.0));
		assertThat(Size.EIB.toMB(1.0), is(1152921504606.846976));
	}

	@Test
	public void toMiB() {
		assertThat(Size.BYTE.toMiB(0.0), is(0.0));
		assertThat(Size.BYTE.toMiB(1.0), is(0.00000095367431640625));
		assertThat(Size.KB.toMiB(1.0), is(0.00095367431640625));
		assertThat(Size.KIB.toMiB(1.0), is(0.0009765625));
		assertThat(Size.MB.toMiB(1.0), is(0.95367431640625));
		assertThat(Size.MIB.toMiB(1.0), is(1.0));
		assertThat(Size.GB.toMiB(1.0), is(953.67431640625));
		assertThat(Size.GIB.toMiB(1.0), is(1024.0));
		assertThat(Size.TB.toMiB(1.0), is(953674.31640625));
		assertThat(Size.TIB.toMiB(1.0), is(1048576.0));
		assertThat(Size.PB.toMiB(1.0), is(953674316.40625));
		assertThat(Size.PIB.toMiB(1.0), is(1073741824.0));
		assertThat(Size.EB.toMiB(1.0), is(953674316406.25));
		assertThat(Size.EIB.toMiB(1.0), is(1099511627776.0));
	}

	@Test
	public void toGB() {
		assertThat(Size.BYTE.toGB(0.0), is(0.0));
		assertThat(Size.BYTE.toGB(1.0), is(0.000000001));
		assertThat(Size.KB.toGB(1.0), is(0.000001));
		assertThat(Size.KIB.toGB(1.0), is(0.000001024));
		assertThat(Size.MB.toGB(1.0), is(0.001));
		assertThat(Size.MIB.toGB(1.0), is(0.001048576));
		assertThat(Size.GB.toGB(1.0), is(1.0000));
		assertThat(Size.GIB.toGB(1.0), is(1.073741824));
		assertThat(Size.TB.toGB(1.0), is(1000.0));
		assertThat(Size.TIB.toGB(1.0), is(1099.511627776));
		assertThat(Size.PB.toGB(1.0), is(1000000.0));
		assertThat(Size.PIB.toGB(1.0), is(1125899.906842624));
		assertThat(Size.EB.toGB(1.0), is(1000000000.0));
		assertThat(Size.EIB.toGB(1.0), is(1152921504.606846976));
	}

	@Test
	public void toGiB() {
		assertThat(Size.BYTE.toGiB(0.0), is(0.0));
		assertThat(Size.BYTE.toGiB(1.0), is(0.000000000931322574615478515625));
		assertThat(Size.KB.toGiB(1.0), is(0.000000931322574615478515625));
		assertThat(Size.KIB.toGiB(1.0), is(0.00000095367431640625));
		assertThat(Size.MB.toGiB(1.0), is(0.000931322574615478515625));
		assertThat(Size.MIB.toGiB(1.0), is(0.0009765625));
		assertThat(Size.GB.toGiB(1.0), is(0.931322574615478515625));
		assertThat(Size.GIB.toGiB(1.0), is(1.0));
		assertThat(Size.TB.toGiB(1.0), is(931.322574615478515625));
		assertThat(Size.TIB.toGiB(1.0), is(1024.0));
		assertThat(Size.PB.toGiB(1.0), is(931322.574615478515625));
		assertThat(Size.PIB.toGiB(1.0), is(1048576.0));
		assertThat(Size.EB.toGiB(1.0), is(931322574.615478515625));
		assertThat(Size.EIB.toGiB(1.0), is(1073741824.0));
	}

	@Test
	public void toTB() {
		assertThat(Size.BYTE.toTB(0.0), is(0.0));
		assertThat(Size.BYTE.toTB(1.0), is(0.000000000001));
		assertThat(Size.KB.toTB(1.0), is(0.000000001));
		assertThat(Size.KIB.toTB(1.0), is(0.000000001024));
		assertThat(Size.MB.toTB(1.0), is(0.000001));
		assertThat(Size.MIB.toTB(1.0), is(0.000001048576));
		assertThat(Size.GB.toTB(1.0), is(0.001));
		assertThat(Size.GIB.toTB(1.0), is(0.001073741824));
		assertThat(Size.TB.toTB(1.0), is(1.0000));
		assertThat(Size.TIB.toTB(1.0), is(1.099511627776));
		assertThat(Size.PB.toTB(1.0), is(1000.0));
		assertThat(Size.PIB.toTB(1.0), is(1125.899906842624));
		assertThat(Size.EB.toTB(1.0), is(1000000.0));
		assertThat(Size.EIB.toTB(1.0), is(1152921.504606846976));
	}

	@Test
	public void toTiB() {
		assertThat(Size.BYTE.toTiB(0.0), is(0.0));
		assertThat(Size.BYTE.toTiB(1.0), is(0.0000000000009094947017729282379150390625));
		assertThat(Size.KB.toTiB(1.0), is(0.0000000009094947017729282379150390625));
		assertThat(Size.KIB.toTiB(1.0), is(0.000000000931322574615478515625));
		assertThat(Size.MB.toTiB(1.0), is(0.0000009094947017729282379150390625));
		assertThat(Size.MIB.toTiB(1.0), is(0.00000095367431640625));
		assertThat(Size.GB.toTiB(1.0), is(0.0009094947017729282379150390625));
		assertThat(Size.GIB.toTiB(1.0), is(0.0009765625));
		assertThat(Size.TB.toTiB(1.0), is(0.9094947017729282379150390625));
		assertThat(Size.TIB.toTiB(1.0), is(1.0));
		assertThat(Size.PB.toTiB(1.0), is(909.4947017729282379150390625));
		assertThat(Size.PIB.toTiB(1.0), is(1024.0));
		assertThat(Size.EB.toTiB(1.0), is(909494.7017729282379150390625));
		assertThat(Size.EIB.toTiB(1.0), is(1048576.0));
	}

	@Test
	public void toPB() {
		assertThat(Size.BYTE.toPB(0.0), is(0.0));
		assertThat(Size.BYTE.toPB(1.0), is(0.000000000000001));
		assertThat(Size.KB.toPB(1.0), is(0.000000000001));
		assertThat(Size.KIB.toPB(1.0), is(0.000000000001024));
		assertThat(Size.MB.toPB(1.0), is(0.000000001));
		assertThat(Size.MIB.toPB(1.0), is(0.000000001048576));
		assertThat(Size.GB.toPB(1.0), is(0.000001));
		assertThat(Size.GIB.toPB(1.0), is(0.000001073741824));
		assertThat(Size.TB.toPB(1.0), is(0.0010000));
		assertThat(Size.TIB.toPB(1.0), is(0.001099511627776));
		assertThat(Size.PB.toPB(1.0), is(1.0));
		assertThat(Size.PIB.toPB(1.0), is(1.125899906842624));
		assertThat(Size.EB.toPB(1.0), is(1000.0));
		assertThat(Size.EIB.toPB(1.0), is(1152.921504606846976));
	}

	@Test
	public void toPiB() {
		assertThat(Size.BYTE.toPiB(0.0), is(0.0));
		assertThat(Size.BYTE.toPiB(1.0), is(0.00000000000000088817841970012523233890533447266));
		assertThat(Size.KB.toPiB(1.0), is(0.00000000000088817841970012523233890533447266));
		assertThat(Size.KIB.toPiB(1.0), is(0.0000000000009094947017729282379150390625));
		assertThat(Size.MB.toPiB(1.0), is(0.00000000088817841970012523233890533447266));
		assertThat(Size.MIB.toPiB(1.0), is(0.000000000931322574615478515625));
		assertThat(Size.GB.toPiB(1.0), is(0.00000088817841970012523233890533447266));
		assertThat(Size.GIB.toPiB(1.0), is(0.00000095367431640625));
		assertThat(Size.TB.toPiB(1.0), is(0.00088817841970012523233890533447266));
		assertThat(Size.TIB.toPiB(1.0), is(0.0009765625));
		assertThat(Size.PB.toPiB(1.0), is(0.88817841970012523233890533447266));
		assertThat(Size.PIB.toPiB(1.0), is(1.0));
		assertThat(Size.EB.toPiB(1.0), is(888.17841970012523233890533447266));
		assertThat(Size.EIB.toPiB(1.0), is(1024.0));
	}

	@Test
	public void toEB() {
		assertThat(Size.BYTE.toEB(0.0), is(0.0));
		assertThat(Size.BYTE.toEB(1.0), is(0.000000000000000001));
		assertThat(Size.KB.toEB(1.0), is(0.000000000000001));
		assertThat(Size.KIB.toEB(1.0), is(0.000000000000001024));
		assertThat(Size.MB.toEB(1.0), is(0.000000000001));
		assertThat(Size.MIB.toEB(1.0), is(0.000000000001048576));
		assertThat(Size.GB.toEB(1.0), is(0.000000001));
		assertThat(Size.GIB.toEB(1.0), is(0.000000001073741824));
		assertThat(Size.TB.toEB(1.0), is(0.000001));
		assertThat(Size.TIB.toEB(1.0), is(0.000001099511627776));
		assertThat(Size.PB.toEB(1.0), is(0.001));
		assertThat(Size.PIB.toEB(1.0), is(0.001125899906842624));
		assertThat(Size.EB.toEB(1.0), is(1.0));
		assertThat(Size.EIB.toEB(1.0), is(1.152921504606846976));
	}

	@Test
	public void toEiB() {
		assertThat(Size.BYTE.toEiB(0.0), is(0.0));
		assertThat(Size.BYTE.toEiB(1.0), is(0.00000000000000000086736173798840354720596224069595));
		assertThat(Size.KB.toEiB(1.0), is(0.00000000000000086736173798840354720596224069595));
		assertThat(Size.KIB.toEiB(1.0), is(0.00000000000000088817841970012523233890533447266));
		assertThat(Size.MB.toEiB(1.0), is(0.00000000000086736173798840354720596224069595));
		assertThat(Size.MIB.toEiB(1.0), is(0.0000000000009094947017729282379150390625));
		assertThat(Size.GB.toEiB(1.0), is(0.00000000086736173798840354720596224069595));
		assertThat(Size.GIB.toEiB(1.0), is(0.000000000931322574615478515625));
		assertThat(Size.TB.toEiB(1.0), is(0.00000086736173798840354720596224069595));
		assertThat(Size.TIB.toEiB(1.0), is(0.00000095367431640625));
		assertThat(Size.PB.toEiB(1.0), is(0.00086736173798840354720596224069595));
		assertThat(Size.PIB.toEiB(1.0), is(0.0009765625));
		assertThat(Size.EB.toEiB(1.0), is(0.86736173798840354720596224069595));
		assertThat(Size.EIB.toEiB(1.0), is(1.0));
	}

	@Test
	public void convert() {
		assertThat(Size.BYTE.convert(1.0, Size.BYTE), is(1.0));
		assertThat(Size.KB.convert(1.0, Size.KB), is(1.0));
		assertThat(Size.KIB.convert(1.0, Size.KIB), is(1.0));
		assertThat(Size.MB.convert(1.0, Size.MB), is(1.0));
		assertThat(Size.MIB.convert(1.0, Size.MIB), is(1.0));
		assertThat(Size.GB.convert(1.0, Size.GB), is(1.0));
		assertThat(Size.GIB.convert(1.0, Size.GIB), is(1.0));
		assertThat(Size.TB.convert(1.0, Size.TB), is(1.0));
		assertThat(Size.TIB.convert(1.0, Size.TIB), is(1.0));
		assertThat(Size.PB.convert(1.0, Size.PB), is(1.0));
		assertThat(Size.PIB.convert(1.0, Size.PIB), is(1.0));
		assertThat(Size.EIB.convert(1.0, Size.EIB), is(1.0));

		assertThat(Size.BYTE.convert(1.0, Size.KIB), is(1024.0));
		assertThat(Size.KIB.convert(1.0, Size.MIB), is(1024.0));
		assertThat(Size.MIB.convert(1.0, Size.GIB), is(1024.0));
		assertThat(Size.GIB.convert(1.0, Size.TIB), is(1024.0));
		assertThat(Size.TIB.convert(1.0, Size.PIB), is(1024.0));
		assertThat(Size.PIB.convert(1.0, Size.EIB), is(1024.0));

		assertThat(Size.BYTE.convert(1.0, Size.KB), is(1000.0));
		assertThat(Size.KB.convert(1.0, Size.MB), is(1000.0));
		assertThat(Size.MB.convert(1.0, Size.GB), is(1000.0));
		assertThat(Size.GB.convert(1.0, Size.TB), is(1000.0));
		assertThat(Size.TB.convert(1.0, Size.PB), is(1000.0));
		assertThat(Size.PB.convert(1.0, Size.EB), is(1000.0));
	}

	@Test
	public void getSymbol() {
		assertThat(Size.BYTE.getSymbol(), is("byte"));
		assertThat(Size.KB.getSymbol(), is("kB"));
		assertThat(Size.KIB.getSymbol(), is("KiB"));
		assertThat(Size.MB.getSymbol(), is("MB"));
		assertThat(Size.MIB.getSymbol(), is("MiB"));
		assertThat(Size.GB.getSymbol(), is("GB"));
		assertThat(Size.GIB.getSymbol(), is("GiB"));
		assertThat(Size.TB.getSymbol(), is("TB"));
		assertThat(Size.TIB.getSymbol(), is("TiB"));
		assertThat(Size.PB.getSymbol(), is("PB"));
		assertThat(Size.PIB.getSymbol(), is("PiB"));
		assertThat(Size.EB.getSymbol(), is("EB"));
		assertThat(Size.EIB.getSymbol(), is("EiB"));
	}

	@Test
	public void format() {
		assertThat(Size.BYTE.format(1.0, Size.GB), is("1000000000 byte"));
		assertThat(Size.BYTE.format(1.0, Size.KIB), is("1024 byte"));

		assertThat(Size.GB.format(1.0, Size.BYTE), is("0 GB"));
		assertThat(Size.KIB.format(10, Size.BYTE), is("0" + DOT + "01 KiB"));
	}

	@Test
	public void formatValueSI() {

		// TODO 999999 => 1000 kB (rounding error) correct?

		assertThat(Size.formatValueSI(1.0), is("1 byte"));
		assertThat(Size.formatValueSI(1000.0), is("1 kB"));
		assertThat(Size.formatValueSI(1000000.0), is("1 MB"));
		assertThat(Size.formatValueSI(1000000000.0), is("1 GB"));
		assertThat(Size.formatValueSI(1000000000000.0), is("1 TB"));
		assertThat(Size.formatValueSI(1000000000000000.0), is("1 PB"));
		assertThat(Size.formatValueSI(1000000000000000000.0), is("1 EB"));

		assertThat(Size.formatValueSI(1.1), is("1 byte"));
		assertThat(Size.formatValueSI(1100.0), is("1" + DOT + "1 kB"));
		assertThat(Size.formatValueSI(1100000.0), is("1" + DOT + "1 MB"));
		assertThat(Size.formatValueSI(1100000000.0), is("1" + DOT + "1 GB"));
		assertThat(Size.formatValueSI(1100000000000.0), is("1" + DOT + "1 TB"));
		assertThat(Size.formatValueSI(1100000000000000.0), is("1" + DOT + "1 PB"));
		assertThat(Size.formatValueSI(1100000000000000000.0), is("1" + DOT + "1 EB"));

		assertThat(Size.formatValueSI(1.111), is("1 byte"));
		assertThat(Size.formatValueSI(1111.0), is("1" + DOT + "11 kB"));
		assertThat(Size.formatValueSI(1111000.0), is("1" + DOT + "11 MB"));
		assertThat(Size.formatValueSI(1111000000.0), is("1" + DOT + "11 GB"));
		assertThat(Size.formatValueSI(1111000000000.0), is("1" + DOT + "11 TB"));
		assertThat(Size.formatValueSI(1111000000000000.0), is("1" + DOT + "11 PB"));
		assertThat(Size.formatValueSI(1111000000000000000.0), is("1" + DOT + "11 EB"));

		assertThat(Size.formatValueSI(1234567.0, Size.MB), is("1" + DOT + "23 TB"));
	}

	@Test
	public void formatValueBinary() {

		// TODO 1048575 => 1000 KiB (rounding error) correct?

		assertThat(Size.formatValueBinary(1.0), is("1 byte"));
		assertThat(Size.formatValueBinary(1024.0), is("1 KiB"));
		assertThat(Size.formatValueBinary(1048576.0), is("1 MiB"));
		assertThat(Size.formatValueBinary(1073741824.0), is("1 GiB"));
		assertThat(Size.formatValueBinary(1099511627776.0), is("1 TiB"));
		assertThat(Size.formatValueBinary(1125899906842624.0), is("1 PiB"));
		assertThat(Size.formatValueBinary(1152921504606846976.0), is("1 EiB"));

		assertThat(Size.formatValueBinary(1.0 * 1.1), is("1 byte"));
		assertThat(Size.formatValueBinary(1024.0 * 1.1), is("1" + DOT + "1 KiB"));
		assertThat(Size.formatValueBinary(1048576.0 * 1.1), is("1" + DOT + "1 MiB"));
		assertThat(Size.formatValueBinary(1073741824.0 * 1.1), is("1" + DOT + "1 GiB"));
		assertThat(Size.formatValueBinary(1099511627776.0 * 1.1), is("1" + DOT + "1 TiB"));
		assertThat(Size.formatValueBinary(1125899906842624.0 * 1.1), is("1" + DOT + "1 PiB"));
		assertThat(Size.formatValueBinary(1152921504606846976.0 * 1.1), is("1" + DOT + "1 EiB"));

		assertThat(Size.formatValueBinary(1.0 * 1.111), is("1 byte"));
		assertThat(Size.formatValueBinary(1024.0 * 1.111), is("1" + DOT + "11 KiB"));
		assertThat(Size.formatValueBinary(1048576.0 * 1.111), is("1" + DOT + "11 MiB"));
		assertThat(Size.formatValueBinary(1073741824.0 * 1.111), is("1" + DOT + "11 GiB"));
		assertThat(Size.formatValueBinary(1099511627776.0 * 1.111), is("1" + DOT + "11 TiB"));
		assertThat(Size.formatValueBinary(1125899906842624.0 * 1.111), is("1" + DOT + "11 PiB"));
		assertThat(Size.formatValueBinary(1152921504606846976.0 * 1.111), is("1" + DOT + "11 EiB"));

		assertThat(Size.formatValueBinary(1234567.0, Size.MIB), is("1" + DOT + "18 TiB"));
	}

	@Test
	public void parse() {
		assertThat(Size.parse("1 byte"), is(1.0));
		assertThat(Size.parse("1.8 byte"), is(1.8));
		assertThat(Size.parse("100000 byte"), is(100000.0));
		assertThat(Size.parse("10000000000 byte"), is(10000000000.0));

		assertThat(Size.parse("1234.5678 kB"), is(1234567.8));
		assertThat(Size.parse("1234.5678 MB"), is(1234567800.0));
		assertThat(Size.parse("1234.5678 GB"), is(1234567800000.0));
		assertThat(Size.parse("1234.5678 TB"), is(1234567800000000.0));
		assertThat(Size.parse("1234.5678 PB"), is(1234567800000000000.0));
		assertThat(Size.parse("1234.5678 EB"), is(1234567800000000000000.0));

		assertThat(Size.parse("1234.5678 KiB"), is(1264197.4272));
		assertThat(Size.parse("1234.5678 MiB"), is(1294538165.4528));
		assertThat(Size.parse("1234.5678 GiB"), is(1325607081423.6672));
		assertThat(Size.parse("1234.5678 TiB"), is(1357421651377835.2128));
		assertThat(Size.parse("1234.5678 PiB"), is(1389999771010903257.9072));
		assertThat(Size.parse("1234.5678 EiB"), is(1423359765515164936096.9728));
	}
	
}
