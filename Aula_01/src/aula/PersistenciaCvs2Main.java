package aula;

public class PersistenciaCvs2Main {

	public static void main(String[] args) {
		PersistenciaCsv2 cadastrar = new PersistenciaCsv2();
		String url = "files/nomes.csv";
		
		cadastrar.CadastrarNomes("Luis", "Gabriel", url);
		cadastrar.CadastrarNomes("Luis", "Gabriel", url);
		cadastrar.CadastrarNomes("Luis", "Gabriel", url);
		cadastrar.CadastrarNomes("Luis", "Gabriel", url);
		cadastrar.CadastrarNomes("Luis", "Gabriel", url);
		
		System.out.println("arquivo adicionado com sucesso!");

	}

}
