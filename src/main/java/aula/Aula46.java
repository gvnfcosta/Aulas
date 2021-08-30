package aula;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Aula46 {
    public static void main(String[] args) throws ParseException {

        Calendar calendar = Calendar.getInstance();
        Date data = calendar.getTime();
        calendar.add(Calendar.DAY_OF_MONTH, 10);
        Date pagamento = calendar.getTime();
        calendar.add(Calendar.DAY_OF_MONTH, -10);
        calendar.add(Calendar.DAY_OF_MONTH, 10);
        Date vencimento = calendar.getTime();
        System.out.println(data);
        System.out.println(pagamento);
        System.out.println(vencimento);

        if (pagamento.after(vencimento)) {
            System.out.println("Pagamento atrasado");
        }else{
            System.out.println("Pagamento em dia");
        }

/*        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        String data = formatter.format(agora);
        System.out.println(data);

        Um cliente tem 10 dias para pagar uma fatura após a sua data de vencimento sem que os juros sejam cobrados.
        Caso essa data caia em um sábado ou domingo, o cliente pode pagar na segunda-feira seguinte.
        Crie uma estrutura que receba uma data de vencimento e calcule quantos dias ele tem para pagar.
*/

    }
}
