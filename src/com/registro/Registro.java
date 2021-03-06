package com.registro;

public class Registro {
	
	private int codigo; 		//C�digo da pessoa	
	private String nome;		//Nome da pessoa
	private String endere�o;	//Endere�o da pessoa
	private String num_telefone;//Telefone da pessoa
	private String email;		//Endere�o de email
	
	public Registro(){};
	
	/**
	 * @param codigo
	 * @param nome
	 * @param endere�o
	 * @param num_telefone
	 * @param email
	 */
	public Registro(int codigo, String nome, String endere�o,
			String num_telefone, String email) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.endere�o = endere�o;
		this.num_telefone = num_telefone;
		this.email = email;
	}


	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	public String getNum_telefone() {
		return num_telefone;
	}
	public void setNum_telefone(String num_telefone) {
		this.num_telefone = num_telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	@Override
	public String toString() {
		return "Registro [codigo=" + codigo + ", nome=" + nome + ", endere�o="
				+ endere�o + ", num_telefone=" + num_telefone + ", email="
				+ email + "]";
	}	

}
