package snakecamel;

public class Main {
	public static void main(String[] args){
		
		SnakeCamelUtil scu = new SnakeCamelUtil();
		scu.snakeToCamelcase("chocolate_cake");
		scu.camelToSnakecase("LemonPie");
		scu.capitalize("doraemon");
		scu.uncapitalize("Obake");
	}

}
