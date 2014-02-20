package unit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * 
 * @author Markus Wichmann
 *
 */
public class TemperatureTest {
	@Test
	public void toKelvin() {
		assertThat(Temperature.KELVIN.toKelvin(0.0), is(0.0));
		
		assertThat(Temperature.KELVIN.toKelvin(1.0), is(1.0));
		assertThat(Temperature.CELSIUS.toKelvin(1.0), is(274.15));
		assertThat(Temperature.FAHRENHEIT.toKelvin(1.0), is(255.927777777777777777777777778));
	}
	
	@Test
	public void toCelsius() {
		assertThat(Temperature.CELSIUS.toCelsius(0.0), is(0.0));
		
		assertThat(Temperature.KELVIN.toCelsius(1.0), is(-272.15));
		assertThat(Temperature.CELSIUS.toCelsius(1.0), is(1.0));
		assertThat(Temperature.FAHRENHEIT.toCelsius(1.0), is(-17.2222222222222));
	}
	
	@Test
	public void toFahrenheit() {
		assertThat(Temperature.FAHRENHEIT.toFahrenheit(0.0), is(0.0));
		
		assertThat(Temperature.KELVIN.toFahrenheit(1.0), is(-457.87));
		assertThat(Temperature.CELSIUS.toFahrenheit(1.0), is(33.799999999999955));
		assertThat(Temperature.FAHRENHEIT.toFahrenheit(1.0), is(1.0));
	}
	
}
