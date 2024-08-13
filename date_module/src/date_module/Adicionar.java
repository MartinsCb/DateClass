package date_module;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Adicionar {

	public static void main(String[] args) {
		
		LocalDate dataBase = LocalDate.now();
		System.out.println("Data Hoje " + dataBase);
		System.out.println("Adiciona dias : " + dataBase.plusDays(5));
		System.out.println("semanas : " + dataBase.plusWeeks(5));
		System.out.println("Meses : " + dataBase.plusMonths(5));
		System.out.println("Anos : " + dataBase.plusYears(10));
		System.out.println();
		System.out.println("Remove (dias/anos e meses)  " + dataBase.minusDays(5));
		System.out.println();
		
		System.out.println("Sistema de parcelas por mês ");
		System.out.println();
		
		for (int mes = 1; mes <= 12; mes ++) {
			dataBase = dataBase.plusMonths(1);
			System.out.println("Data de vencimento do boleto : "  + dataBase.format
					(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " do mês : " + mes );
		}

	}

}
