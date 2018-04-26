package snakecamel;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void スネークケースtoキャメル確認() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "ChocolatePie";
		String actual = scu.snakeToCamelcase("chocolate_pie");
		assertThat(actual,is(expected));
	}
	@org.junit.Test
	public void キャメルtoスネーク確認() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "candle_cake";
		String actual = scu.camelToSnakecase("CandleCake");
		assertThat(actual,is(expected));
	}
	

}
