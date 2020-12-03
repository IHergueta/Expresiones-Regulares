package Regex;

import java.util.regex.*;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//validar usuario
		String regex = "([A-Z]\\w+\\s[A-Z]\\w+\\s[A-Z]\\w+)";
		
		System.out.println(Pattern.matches(regex, "Ignacio Hergueta Guerra"));
		
		//extraer año de una fecha
		Pattern patron = Pattern.compile("(\\d{2})\\/(\\d{2})\\/(\\d{4})");
		
		Matcher matcher = patron.matcher("01/01/2000");
		Matcher matcher2 = patron.matcher("01/01/2013");
		
		while(matcher.find() && matcher2.find()) {
		
		System.out.println("Año: " + matcher.group(3));
		System.out.println("Año: " + matcher2.group(3));
		}
		
	}

}
