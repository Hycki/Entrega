package com.unifacisa.Aula04;

public class Pessoa {
	
	private long id;
    private String nome;
    private int idade;
    private String sobrenome;
    private String curso;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
    	return idade;
    }
    
    public void setIdade(int idade) {
    	this.idade = idade;
    }
    
    public String getSobrenome() {
    	return sobrenome;
    }
    
    public void setSobrenome(String sobrenome) {
    	this.sobrenome = sobrenome;
    }
    
    public String getCurso() {
    	return curso;
    }

    public void setCurso(String curso) {
    	this.curso = curso;
    }

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", idade=" + idade + ", sobrenome=" + sobrenome + ", curso="
				+ curso + "]";
	}
    
    
}


