package br.com.projetoJsf;

import javax.inject.Named;

@Named(value="pessoaBean")
public class PessoaBean {
	
	
	private String nome;
	private String sobrenome;
	private String nomeCompleto;
	
	public String mostrarNome() {
		nomeCompleto = nome+" -- "+sobrenome;
		return nomeCompleto;
	}
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	
	
	
	
	
	
	

}
