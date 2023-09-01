package etapa1;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


public class Main {

	public static void main(String[] args) throws IOException  {
		
		
		Csv cadastrar = new Csv();
		String url = "files/site.txt";
		
		Document doc = Jsoup.connect("https://www.bananeiras.pb.gov.br/coronavirus/").get();
		
		cadastrar.CadastrarNomes(doc.getElementsByTag("valor-recebidas-aplicadas" ),url);
		
		System.out.println("arquivo adicionado com sucesso!");

	}

}
