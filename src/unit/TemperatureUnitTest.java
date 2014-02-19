package unit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TemperatureUnitTest {
	@Test
	public void toKelvin() {
		assertThat(TemperatureUnit.KELVIN.toKelvin(0.0), is(0.0));
		
		assertThat(TemperatureUnit.KELVIN.toKelvin(1.0), is(1.0));
		assertThat(TemperatureUnit.CELSIUS.toKelvin(1.0), is(274.15));
		assertThat(TemperatureUnit.FAHRENHEIT.toKelvin(1.0), is(255.927777777777777777777777778));
	}
	
	@Test
	public void toCelsius() {
		assertThat(TemperatureUnit.CELSIUS.toCelsius(0.0), is(0.0));
		
		assertThat(TemperatureUnit.KELVIN.toCelsius(1.0), is(-272.15));
		assertThat(TemperatureUnit.CELSIUS.toCelsius(1.0), is(1.0));
		assertThat(TemperatureUnit.FAHRENHEIT.toCelsius(1.0), is(-17.2222222222222));
	}
	
	@Test
	public void toFahrenheit() {
		assertThat(TemperatureUnit.FAHRENHEIT.toFahrenheit(0.0), is(0.0));
		
		assertThat(TemperatureUnit.KELVIN.toFahrenheit(1.0), is(-457.87));
		assertThat(TemperatureUnit.CELSIUS.toFahrenheit(1.0), is(33.799999999999955));
		assertThat(TemperatureUnit.FAHRENHEIT.toFahrenheit(1.0), is(1.0));
	}
}
