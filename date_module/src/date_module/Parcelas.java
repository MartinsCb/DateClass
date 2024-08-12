package date_module;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Parcelas {

    public static void main(String[] args) throws ParseException {
        // Define a data inicial
        Date dateInitial = new SimpleDateFormat("dd/MM/yyyy").parse("12/08/2024");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateInitial);

        // Loop para calcular e imprimir as 12 parcelas
        for (int parcela = 1; parcela <= 12; parcela++) {
            // Adiciona 1 mês à data do calendário
            calendar.add(Calendar.MONTH, 1);

            // Imprime a data de vencimento da parcela
            System.out.println("Parcela de número: " + parcela + " vencimento: " + 
                new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
        }
    }
}
