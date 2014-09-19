package com.registro;

public class Registro {
	
	private int codigo; 		//Código da pessoa	
	private String nome;		//Nome da pessoa
	private String endereço;	//Endereço da pessoa
	private String num_telefone;//Telefone da pessoa
	private String email;		//Endereço de email
	
	public Registro(){};
	
	/**
	 * @param codigo
	 * @param nome
	 * @param endereço
	 * @param num_telefone
	 * @param email
	 */
	public Registro(int codigo, String nome, String endereço,
			String num_telefone, String email) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.endereço = endereço;
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
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
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
		return "Registro [codigo=" + codigo + ", nome=" + nome + ", endereço="
				+ endereço + ", num_telefone=" + num_telefone + ", email="
				+ email + "]";
	}	

}
