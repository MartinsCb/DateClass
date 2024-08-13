package date_module;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ApiDate {

	public static void main(String[] args) {
		
		//DATA E HORA
		
		System.out.println("Data e HOra ");
		
		LocalDate dataAtual = LocalDate.now();
		System.out.println("Data atual : " + dataAtual);
		
		LocalTime horaLocal = LocalTime.now();
		System.out.println("Hora atual : " + horaLocal.format(DateTimeFormatter.ofPattern("HH:mm.ss")));
		
		LocalDateTime horaAtDat = LocalDateTime.now();
		System.out.println("Local e data : " + horaAtDat.format
				(DateTimeFormatter.ofPattern("dd/MM/yyyy .HH:mm.ss")));
		System.out.println();
		
             //*************************DIAS/MESES/ANOS****************
		System.out.println("Dias, meses e anos ");
		
		LocalDate localDate = LocalDate.now();
		System.out.println("Data Atual : " +localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("Dia da semana : " + localDate.getDayOfWeek());
		System.out.println("Dia semana numero : " + localDate.getDayOfMonth());
		System.out.println("Mês : " + localDate.getMonthValue());
		System.out.println("DiA do ano : " + localDate.getDayOfYear());
		System.out.println();	
		

	}

}
