package date_module;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDate {

    public static void main(String[] args) {
        // Obtendo a instância do Calendar
    	
        Calendar calendar = Calendar.getInstance();

        // Exibindo diferentes componentes da data e hora atual
        
        System.out.println("Data/Hora completa: " + calendar.getTime());
        System.out.println("Ano: " + calendar.get(Calendar.YEAR));
        System.out.println("Mês (0 = Janeiro): " + calendar.get(Calendar.MONTH));
        System.out.println("Dia do Mês: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Dia da Semana (1 = Domingo): " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("Hora: " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minuto: " + calendar.get(Calendar.MINUTE));
        System.out.println("Segundo: " + calendar.get(Calendar.SECOND));
        System.out.println("Milissegundo: " + calendar.get(Calendar.MILLISECOND));
        
        System.out.println();
        System.out.println("--------------SimpleDateFormat----------------");
        System.out.println();
        
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
        System.out.println("Calendar data atual e formato padrão " + simpleDateFormat.format(calendar.getTime()));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
        System.out.println("Data em Formato de banco de dados : " + simpleDateFormat2.format(calendar.getTime()));
        //para object sempre abrir um try e formatar passando um Date 
        try {
            // Parse de string para objeto Date
            SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy/MM/dd");
            Date parsedDate = simpleDateFormat3.parse("2024/08/02");
            System.out.println("Object Date: " + parsedDate);
        } catch (ParseException e) {
            System.out.println("Erro ao fazer o parse da data: " + e.getMessage());
        }
    
}

        
		}
        


