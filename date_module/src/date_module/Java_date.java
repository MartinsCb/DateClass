package date_module;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Java_date {

    public static void main(String[] args) {
        try {
            // Data atual
            Date date = new Date();
            
            System.out.println("Completa: " + date);
            System.out.println("Dia da semana (0 = domingo): " + date.getDay());
            System.out.println("Hora exata: " + date.getHours());
            System.out.println("Minutos: " + date.getMinutes());
            System.out.println("Segundos: " + date.getSeconds());
            System.out.println("Milissegundos desde 1970: " + date.getTime());
            System.out.println("Mês (0 = janeiro): " + date.getMonth());
            System.out.println("Ano (desde 1900): " + (date.getYear() + 1900));
            
            System.out.println();
            System.out.println("*********** SimpleDateFormat ***********");
            System.out.println();
            
            // Formatação de datas
            
            SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            System.out.println("Data atual em formato de string: " + simpleDateFormat1.format(date));
            
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            System.out.println("Data para banco de dados: " + simpleDateFormat2.format(date));
            
            // Parse de string para objeto Date
            
            SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = "2024-08-06 14:26:23";
            Date parsedDate = simpleDateFormat3.parse(dateString);
            System.out.println("Object date: " + parsedDate);
            
        } catch (ParseException e) {
            System.out.println("Erro ao fazer o parse da data: " + e.getMessage());
        }
    }
}
