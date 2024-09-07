import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tetse {
    public static void main(String[] args)
    {
        //   Pessoa tutu = new Pessoa(1.61, 52.3, "Jhesua", 2006-9-22, "m");
        LocalDate data;
        String datasString = "22/09/2006";
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        data = LocalDate.parse(datasString, formatador);
        System.out.println(data);
    }
}
