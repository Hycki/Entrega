package etapa1;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.select.Elements;

public class Csv {
	
	public void CadastrarNomes(Elements nome, String url) {
		CriarArquivo(url);
		
		try {
			List<String> existentes = LinhaExistentes(url);
			String linha = nome + ";";
			existentes.add(linha);
			
			String todasLinhas = UnicaLinha(existentes);
			FileWriter arquivo = new FileWriter(url);
			arquivo.write(todasLinhas);
			arquivo.close();
		}catch (Exception error) {
			System.out.println("Erro de gerar arqivo" + url);
		}
	}
	
	public String UnicaLinha(List<String> existentes) {
		
		String unicalinha = "";
		for(String linha: existentes) {
			unicalinha+= linha + "\n";
		}
		return unicalinha;
	}
	
	public void CriarArquivo(String url) {
		
		try {
			File arquivo = new File(url);
			arquivo.createNewFile();
			
		}catch(Exception erro) {
			System.out.println("Erro ao criar arquivo");
		}
	}
	
	public List<String> LinhaExistentes(String url){
		
		List<String> result = new ArrayList<String>();
	

	try {
		Path path = Paths.get(url);
		result = Files.readAllLines(path);
		
	}catch(Exception erro) {
		System.out.println("Erro ao ler arquivo");
		
	}
	return result;
		
	}

}
