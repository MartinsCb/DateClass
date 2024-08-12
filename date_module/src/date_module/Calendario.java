package date_module;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Calendario {

	public static void main(String[] args) throws ParseException {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy");
//Instanciar um DateTimeFormatter e passar o padrão de data 		
		
	long dias = ChronoUnit.DAYS.between(LocalDate.parse("12/08/2023",formatter),LocalDate.now());
	System.out.println("Possui "+ dias +  " entre a faixa de data");

	}

}
