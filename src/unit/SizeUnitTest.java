package unit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SizeUnitTest {

	@Test
	public void toByte() {

		SizeUnit.MB.toMiB(100.0);

		assertThat(SizeUnit.BYTE.toByte(0.0), is(0.0));
		assertThat(SizeUnit.BYTE.toByte(1.0), is(1.0));
		assertThat(SizeUnit.KB.toByte(1.0), is(1000.0));
		assertThat(SizeUnit.KIB.toByte(1.0), is(1024.0));
		assertThat(SizeUnit.MB.toByte(1.0), is(1000000.0));
		assertThat(SizeUnit.MIB.toByte(1.0), is(1048576.0));
		assertThat(SizeUnit.GB.toByte(1.0), is(1000000000.0));
		assertThat(SizeUnit.GIB.toByte(1.0), is(1073741824.0));
		assertThat(SizeUnit.TB.toByte(1.0), is(1000000000000.0));
		assertThat(SizeUnit.TIB.toByte(1.0), is(1099511627776.0));
		assertThat(SizeUnit.PB.toByte(1.0), is(1000000000000000.0));
		assertThat(SizeUnit.PIB.toByte(1.0), is(1125899906842624.0));
		assertThat(SizeUnit.EB.toByte(1.0), is(1000000000000000000.0));
		assertThat(SizeUnit.EIB.toByte(1.0), is(1152921504606846976.0));
	}

	@Test
	public void toKB() {
		assertThat(SizeUnit.BYTE.toKB(0.0), is(0.0));
		assertThat(SizeUnit.BYTE.toKB(1.0), is(0.001));
		assertThat(SizeUnit.KB.toKB(1.0), is(1.0));
		assertThat(SizeUnit.KIB.toKB(1.0), is(1.024));
		assertThat(SizeUnit.MB.toKB(1.0), is(1000.0));
		assertThat(SizeUnit.MIB.toKB(1.0), is(1048.576));
		assertThat(SizeUnit.GB.toKB(1.0), is(1000000.0));
		assertThat(SizeUnit.GIB.toKB(1.0), is(1073741.824));
		assertThat(SizeUnit.TB.toKB(1.0), is(1000000000.0));
		assertThat(SizeUnit.TIB.toKB(1.0), is(1099511627.776));
		assertThat(SizeUnit.PB.toKB(1.0), is(1000000000000.0));
		assertThat(SizeUnit.PIB.toKB(1.0), is(1125899906842.624));
		assertThat(SizeUnit.EB.toKB(1.0), is(1000000000000000.0));
		assertThat(SizeUnit.EIB.toKB(1.0), is(1152921504606846.976));
	}

	@Test
	public void toKiB() {
		assertThat(SizeUnit.BYTE.toKiB(0.0), is(0.0));
		assertThat(SizeUnit.BYTE.toKiB(1.0), is(0.0009765625));
		assertThat(SizeUnit.KB.toKiB(1.0), is(0.9765625));
		assertThat(SizeUnit.KIB.toKiB(1.0), is(1.0));
		assertThat(SizeUnit.MB.toKiB(1.0), is(976.5625));
		assertThat(SizeUnit.MIB.toKiB(1.0), is(1024.0));
		assertThat(SizeUnit.GB.toKiB(1.0), is(976562.5));
		assertThat(SizeUnit.GIB.toKiB(1.0), is(1048576.0));
		assertThat(SizeUnit.TB.toKiB(1.0), is(976562500.0));
		assertThat(SizeUnit.TIB.toKiB(1.0), is(1073741824.0));
		assertThat(SizeUnit.PB.toKiB(1.0), is(976562500000.0));
		assertThat(SizeUnit.PIB.toKiB(1.0), is(1099511627776.0));
		assertThat(SizeUnit.EB.toKiB(1.0), is(976562500000000.0));
		assertThat(SizeUnit.EIB.toKiB(1.0), is(1125899906842624.0));
	}

	@Test
	public void toMB() {
		assertThat(SizeUnit.BYTE.toMB(0.0), is(0.0));
		assertThat(SizeUnit.BYTE.toMB(1.0), is(0.000001));
		assertThat(SizeUnit.KB.toMB(1.0), is(0.001));
		assertThat(SizeUnit.KIB.toMB(1.0), is(0.001024));
		assertThat(SizeUnit.MB.toMB(1.0), is(1.0));
		assertThat(SizeUnit.MIB.toMB(1.0), is(1.048576));
		assertThat(SizeUnit.GB.toMB(1.0), is(1000.0));
		assertThat(SizeUnit.GIB.toMB(1.0), is(1073.741824));
		assertThat(SizeUnit.TB.toMB(1.0), is(1000000.0));
		assertThat(SizeUnit.TIB.toMB(1.0), is(1099511.627776));
		assertThat(SizeUnit.PB.toMB(1.0), is(1000000000.0));
		assertThat(SizeUnit.PIB.toMB(1.0), is(1125899906.842624));
		assertThat(SizeUnit.EB.toMB(1.0), is(1000000000000.0));
		assertThat(SizeUnit.EIB.toMB(1.0), is(1152921504606.846976));
	}

	@Test
	public void toMiB() {
		assertThat(SizeUnit.BYTE.toMiB(0.0), is(0.0));
		assertThat(SizeUnit.BYTE.toMiB(1.0), is(0.00000095367431640625));
		assertThat(SizeUnit.KB.toMiB(1.0), is(0.00095367431640625));
		assertThat(SizeUnit.KIB.toMiB(1.0), is(0.0009765625));
		assertThat(SizeUnit.MB.toMiB(1.0), is(0.95367431640625));
		assertThat(SizeUnit.MIB.toMiB(1.0), is(1.0));
		assertThat(SizeUnit.GB.toMiB(1.0), is(953.67431640625));
		assertThat(SizeUnit.GIB.toMiB(1.0), is(1024.0));
		assertThat(SizeUnit.TB.toMiB(1.0), is(953674.31640625));
		assertThat(SizeUnit.TIB.toMiB(1.0), is(1048576.0));
		assertThat(SizeUnit.PB.toMiB(1.0), is(953674316.40625));
		assertThat(SizeUnit.PIB.toMiB(1.0), is(1073741824.0));
		assertThat(SizeUnit.EB.toMiB(1.0), is(953674316406.25));
		assertThat(SizeUnit.EIB.toMiB(1.0), is(1099511627776.0));
	}

	@Test
	public void toGB() {
		assertThat(SizeUnit.BYTE.toGB(0.0), is(0.0));
		assertThat(SizeUnit.BYTE.toGB(1.0), is(0.000000001));
		assertThat(SizeUnit.KB.toGB(1.0), is(0.000001));
		assertThat(SizeUnit.KIB.toGB(1.0), is(0.000001024));
		assertThat(SizeUnit.MB.toGB(1.0), is(0.001));
		assertThat(SizeUnit.MIB.toGB(1.0), is(0.001048576));
		assertThat(SizeUnit.GB.toGB(1.0), is(1.0000));
		assertThat(SizeUnit.GIB.toGB(1.0), is(1.073741824));
		assertThat(SizeUnit.TB.toGB(1.0), is(1000.0));
		assertThat(SizeUnit.TIB.toGB(1.0), is(1099.511627776));
		assertThat(SizeUnit.PB.toGB(1.0), is(1000000.0));
		assertThat(SizeUnit.PIB.toGB(1.0), is(1125899.906842624));
		assertThat(SizeUnit.EB.toGB(1.0), is(1000000000.0));
		assertThat(SizeUnit.EIB.toGB(1.0), is(1152921504.606846976));
	}

	@Test
	public void toGiB() {
		assertThat(SizeUnit.BYTE.toGiB(0.0), is(0.0));
		assertThat(SizeUnit.BYTE.toGiB(1.0), is(0.000000000931322574615478515625));
		assertThat(SizeUnit.KB.toGiB(1.0), is(0.000000931322574615478515625));
		assertThat(SizeUnit.KIB.toGiB(1.0), is(0.00000095367431640625));
		assertThat(SizeUnit.MB.toGiB(1.0), is(0.000931322574615478515625));
		assertThat(SizeUnit.MIB.toGiB(1.0), is(0.0009765625));
		assertThat(SizeUnit.GB.toGiB(1.0), is(0.931322574615478515625));
		assertThat(SizeUnit.GIB.toGiB(1.0), is(1.0));
		assertThat(SizeUnit.TB.toGiB(1.0), is(931.322574615478515625));
		assertThat(SizeUnit.TIB.toGiB(1.0), is(1024.0));
		assertThat(SizeUnit.PB.toGiB(1.0), is(931322.574615478515625));
		assertThat(SizeUnit.PIB.toGiB(1.0), is(1048576.0));
		assertThat(SizeUnit.EB.toGiB(1.0), is(931322574.615478515625));
		assertThat(SizeUnit.EIB.toGiB(1.0), is(1073741824.0));
	}

	@Test
	public void toTB() {
		assertThat(SizeUnit.BYTE.toTB(0.0), is(0.0));
		assertThat(SizeUnit.BYTE.toTB(1.0), is(0.000000000001));
		assertThat(SizeUnit.KB.toTB(1.0), is(0.000000001));
		assertThat(SizeUnit.KIB.toTB(1.0), is(0.000000001024));
		assertThat(SizeUnit.MB.toTB(1.0), is(0.000001));
		assertThat(SizeUnit.MIB.toTB(1.0), is(0.000001048576));
		assertThat(SizeUnit.GB.toTB(1.0), is(0.001));
		assertThat(SizeUnit.GIB.toTB(1.0), is(0.001073741824));
		assertThat(SizeUnit.TB.toTB(1.0), is(1.0000));
		assertThat(SizeUnit.TIB.toTB(1.0), is(1.099511627776));
		assertThat(SizeUnit.PB.toTB(1.0), is(1000.0));
		assertThat(SizeUnit.PIB.toTB(1.0), is(1125.899906842624));
		assertThat(SizeUnit.EB.toTB(1.0), is(1000000.0));
		assertThat(SizeUnit.EIB.toTB(1.0), is(1152921.504606846976));
	}

	@Test
	public void toTiB() {
		assertThat(SizeUnit.BYTE.toTiB(0.0), is(0.0));
		assertThat(SizeUnit.BYTE.toTiB(1.0), is(0.0000000000009094947017729282379150390625));
		assertThat(SizeUnit.KB.toTiB(1.0), is(0.0000000009094947017729282379150390625));
		assertThat(SizeUnit.KIB.toTiB(1.0), is(0.000000000931322574615478515625));
		assertThat(SizeUnit.MB.toTiB(1.0), is(0.0000009094947017729282379150390625));
		assertThat(SizeUnit.MIB.toTiB(1.0), is(0.00000095367431640625));
		assertThat(SizeUnit.GB.toTiB(1.0), is(0.0009094947017729282379150390625));
		assertThat(SizeUnit.GIB.toTiB(1.0), is(0.0009765625));
		assertThat(SizeUnit.TB.toTiB(1.0), is(0.9094947017729282379150390625));
		assertThat(SizeUnit.TIB.toTiB(1.0), is(1.0));
		assertThat(SizeUnit.PB.toTiB(1.0), is(909.4947017729282379150390625));
		assertThat(SizeUnit.PIB.toTiB(1.0), is(1024.0));
		assertThat(SizeUnit.EB.toTiB(1.0), is(909494.7017729282379150390625));
		assertThat(SizeUnit.EIB.toTiB(1.0), is(1048576.0));
	}

	@Test
	public void toPB() {
		assertThat(SizeUnit.BYTE.toPB(0.0), is(0.0));
		assertThat(SizeUnit.BYTE.toPB(1.0), is(0.000000000000001));
		assertThat(SizeUnit.KB.toPB(1.0), is(0.000000000001));
		assertThat(SizeUnit.KIB.toPB(1.0), is(0.000000000001024));
		assertThat(SizeUnit.MB.toPB(1.0), is(0.000000001));
		assertThat(SizeUnit.MIB.toPB(1.0), is(0.000000001048576));
		assertThat(SizeUnit.GB.toPB(1.0), is(0.000001));
		assertThat(SizeUnit.GIB.toPB(1.0), is(0.000001073741824));
		assertThat(SizeUnit.TB.toPB(1.0), is(0.0010000));
		assertThat(SizeUnit.TIB.toPB(1.0), is(0.001099511627776));
		assertThat(SizeUnit.PB.toPB(1.0), is(1.0));
		assertThat(SizeUnit.PIB.toPB(1.0), is(1.125899906842624));
		assertThat(SizeUnit.EB.toPB(1.0), is(1000.0));
		assertThat(SizeUnit.EIB.toPB(1.0), is(1152.921504606846976));
	}

	@Test
	public void toPiB() {
		assertThat(SizeUnit.BYTE.toPiB(0.0), is(0.0));
		assertThat(SizeUnit.BYTE.toPiB(1.0), is(0.00000000000000088817841970012523233890533447266));
		assertThat(SizeUnit.KB.toPiB(1.0), is(0.00000000000088817841970012523233890533447266));
		assertThat(SizeUnit.KIB.toPiB(1.0), is(0.0000000000009094947017729282379150390625));
		assertThat(SizeUnit.MB.toPiB(1.0), is(0.00000000088817841970012523233890533447266));
		assertThat(SizeUnit.MIB.toPiB(1.0), is(0.000000000931322574615478515625));
		assertThat(SizeUnit.GB.toPiB(1.0), is(0.00000088817841970012523233890533447266));
		assertThat(SizeUnit.GIB.toPiB(1.0), is(0.00000095367431640625));
		assertThat(SizeUnit.TB.toPiB(1.0), is(0.00088817841970012523233890533447266));
		assertThat(SizeUnit.TIB.toPiB(1.0), is(0.0009765625));
		assertThat(SizeUnit.PB.toPiB(1.0), is(0.88817841970012523233890533447266));
		assertThat(SizeUnit.PIB.toPiB(1.0), is(1.0));
		assertThat(SizeUnit.EB.toPiB(1.0), is(888.17841970012523233890533447266));
		assertThat(SizeUnit.EIB.toPiB(1.0), is(1024.0));
	}

	@Test
	public void toEB() {
		assertThat(SizeUnit.BYTE.toEB(0.0), is(0.0));
		assertThat(SizeUnit.BYTE.toEB(1.0), is(0.000000000000000001));
		assertThat(SizeUnit.KB.toEB(1.0), is(0.000000000000001));
		assertThat(SizeUnit.KIB.toEB(1.0), is(0.000000000000001024));
		assertThat(SizeUnit.MB.toEB(1.0), is(0.000000000001));
		assertThat(SizeUnit.MIB.toEB(1.0), is(0.000000000001048576));
		assertThat(SizeUnit.GB.toEB(1.0), is(0.000000001));
		assertThat(SizeUnit.GIB.toEB(1.0), is(0.000000001073741824));
		assertThat(SizeUnit.TB.toEB(1.0), is(0.000001));
		assertThat(SizeUnit.TIB.toEB(1.0), is(0.000001099511627776));
		assertThat(SizeUnit.PB.toEB(1.0), is(0.001));
		assertThat(SizeUnit.PIB.toEB(1.0), is(0.001125899906842624));
		assertThat(SizeUnit.EB.toEB(1.0), is(1.0));
		assertThat(SizeUnit.EIB.toEB(1.0), is(1.152921504606846976));
	}

	@Test
	public void toEiB() {
		assertThat(SizeUnit.BYTE.toEiB(0.0), is(0.0));
		assertThat(SizeUnit.BYTE.toEiB(1.0), is(0.00000000000000000086736173798840354720596224069595));
		assertThat(SizeUnit.KB.toEiB(1.0), is(0.00000000000000086736173798840354720596224069595));
		assertThat(SizeUnit.KIB.toEiB(1.0), is(0.00000000000000088817841970012523233890533447266));
		assertThat(SizeUnit.MB.toEiB(1.0), is(0.00000000000086736173798840354720596224069595));
		assertThat(SizeUnit.MIB.toEiB(1.0), is(0.0000000000009094947017729282379150390625));
		assertThat(SizeUnit.GB.toEiB(1.0), is(0.00000000086736173798840354720596224069595));
		assertThat(SizeUnit.GIB.toEiB(1.0), is(0.000000000931322574615478515625));
		assertThat(SizeUnit.TB.toEiB(1.0), is(0.00000086736173798840354720596224069595));
		assertThat(SizeUnit.TIB.toEiB(1.0), is(0.00000095367431640625));
		assertThat(SizeUnit.PB.toEiB(1.0), is(0.00086736173798840354720596224069595));
		assertThat(SizeUnit.PIB.toEiB(1.0), is(0.0009765625));
		assertThat(SizeUnit.EB.toEiB(1.0), is(0.86736173798840354720596224069595));
		assertThat(SizeUnit.EIB.toEiB(1.0), is(1.0));
	}

	@Test
	public void convert() {
		assertThat(SizeUnit.BYTE.convert(1.0, SizeUnit.BYTE), is(1.0));
		assertThat(SizeUnit.KB.convert(1.0, SizeUnit.KB), is(1.0));
		assertThat(SizeUnit.KIB.convert(1.0, SizeUnit.KIB), is(1.0));
		assertThat(SizeUnit.MB.convert(1.0, SizeUnit.MB), is(1.0));
		assertThat(SizeUnit.MIB.convert(1.0, SizeUnit.MIB), is(1.0));
		assertThat(SizeUnit.GB.convert(1.0, SizeUnit.GB), is(1.0));
		assertThat(SizeUnit.GIB.convert(1.0, SizeUnit.GIB), is(1.0));
		assertThat(SizeUnit.TB.convert(1.0, SizeUnit.TB), is(1.0));
		assertThat(SizeUnit.TIB.convert(1.0, SizeUnit.TIB), is(1.0));
		assertThat(SizeUnit.PB.convert(1.0, SizeUnit.PB), is(1.0));
		assertThat(SizeUnit.PIB.convert(1.0, SizeUnit.PIB), is(1.0));
		assertThat(SizeUnit.EIB.convert(1.0, SizeUnit.EIB), is(1.0));

		assertThat(SizeUnit.BYTE.convert(1.0, SizeUnit.KIB), is(1024.0));
		assertThat(SizeUnit.KIB.convert(1.0, SizeUnit.MIB), is(1024.0));
		assertThat(SizeUnit.MIB.convert(1.0, SizeUnit.GIB), is(1024.0));
		assertThat(SizeUnit.GIB.convert(1.0, SizeUnit.TIB), is(1024.0));
		assertThat(SizeUnit.TIB.convert(1.0, SizeUnit.PIB), is(1024.0));
		assertThat(SizeUnit.PIB.convert(1.0, SizeUnit.EIB), is(1024.0));

		assertThat(SizeUnit.BYTE.convert(1.0, SizeUnit.KB), is(1000.0));
		assertThat(SizeUnit.KB.convert(1.0, SizeUnit.MB), is(1000.0));
		assertThat(SizeUnit.MB.convert(1.0, SizeUnit.GB), is(1000.0));
		assertThat(SizeUnit.GB.convert(1.0, SizeUnit.TB), is(1000.0));
		assertThat(SizeUnit.TB.convert(1.0, SizeUnit.PB), is(1000.0));
		assertThat(SizeUnit.PB.convert(1.0, SizeUnit.EB), is(1000.0));
	}

	@Test
	public void getSymbol() {
		assertThat(SizeUnit.BYTE.getSymbol(), is("byte"));
		assertThat(SizeUnit.KB.getSymbol(), is("kB"));
		assertThat(SizeUnit.KIB.getSymbol(), is("KiB"));
		assertThat(SizeUnit.MB.getSymbol(), is("MB"));
		assertThat(SizeUnit.MIB.getSymbol(), is("MiB"));
		assertThat(SizeUnit.GB.getSymbol(), is("GB"));
		assertThat(SizeUnit.GIB.getSymbol(), is("GiB"));
		assertThat(SizeUnit.TB.getSymbol(), is("TB"));
		assertThat(SizeUnit.TIB.getSymbol(), is("TiB"));
		assertThat(SizeUnit.PB.getSymbol(), is("PB"));
		assertThat(SizeUnit.PIB.getSymbol(), is("PiB"));
		assertThat(SizeUnit.EB.getSymbol(), is("EB"));
		assertThat(SizeUnit.EIB.getSymbol(), is("EiB"));
	}
}
