import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaString {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("Alura Online");
		palavras.add("Editora casa do codigo");
		palavras.add("Caelum");

		// Collections.sort(palavras,comparador);

		palavras.sort((s1, s2) -> {
			if (s1.length() < s2.length())
				return -1;
			if (s1.length() > s2.length())
				return 1;

			return 0;
		}

		);
		
		//palavras.sort(Comparator.comparing(s-> s.length()));
		System.out.println(palavras);

		//palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		palavras.sort(Comparator.comparing( String::length));
		

		palavras.forEach(
				System.out::println)

		;

	}

}

//class ComparadorPorTamanho implements Comparator<String>{
////comparando string por tamanho na lista
//	
//	@Override
//	public int compare(String s1, String s2) {
//		if (s1.length() < s2.length())
//			return -1;
//		if (s1.length() > s2.length())
//			return 1;
//		
//		return 0;
//	}
//	
//	
//	
//}