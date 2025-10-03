package br.com.etec.biblioteca.cadastro;

public class ClasseInformacoes {
		
	String titulosAt;
	String subtitulosAt;
	String generosAt;
	String autoresAt;
	int numeroPaginasAt;
	
	public ClasseInformacoes(){
		
	}
	
	public ClasseInformacoes(String autor, String titulo){
		this.autoresAt = autor;
		this.titulosAt = titulo;
		
	}
	
}
