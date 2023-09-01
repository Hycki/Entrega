package aula;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PersistenciPropiedades {

	public static void main(String[] args) {
		Properties propriedades = new Properties();
		propriedades.setProperty("usuario","joao");
		propriedades.setProperty("senha","secreta");
		
		try {
			FileOutputStream arquivo = new FileOutputStream("config.properties");
			propriedades.store(arquivo,"Configurações de usuarios");
			
			arquivo.close();
			System.out.println("Propriedadess gravadas com sucesso!");
			
		} catch (IOException e){
			System.out.println("Erro ao gravar propriedades: " + e.getMessage());
		}

	}

}
