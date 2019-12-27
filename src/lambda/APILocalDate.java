package lambda;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class APILocalDate {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		System.out.println("today: " + today);
		
		
		System.out.println();
		

		LocalDate olimpiadasRio = LocalDate.of(2022, Month.JUNE, 5);
		int years = olimpiadasRio.getYear() - today.getYear();
		System.out.println("Years for Olimpiadas Rio: " + years);
		
		
		System.out.println();
		
		
		Period period = Period.between(today, olimpiadasRio);
		System.out.println("Period with Years Between: " + period.getYears());
		
		
		System.out.println();
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Date Formatter: " + today.format(formatter));
		
		
	}



}
