import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


// formatação de data  no java 8
public class Datas {

	public static void main(String[] args) {
		
		//trazendo a data atual
		
		LocalDate hoje = LocalDate.now();
		//System.out.println(hoje);

//		LocalDate data = LocalDate.of(2099, Month.JANUARY, 25);
//		System.out.println(data);
//		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dataFormatada = formatter.format(hoje);
	}

}
