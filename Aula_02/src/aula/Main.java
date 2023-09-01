package aula;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Csv cadastrar = new Csv();
		String url = "files/titulos.csv";
		
		Document doc = Jsoup.connect("https://pt.wikipedia.org/wiki/Fórmula_1").get();
		
		cadastrar.CadastrarNomes(doc.getElementsByTag("h1"),url);
		
		System.out.println("arquivo adicionado com sucesso!");
	}

}
