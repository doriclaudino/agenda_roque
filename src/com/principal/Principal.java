package com.principal;

import java.util.Scanner;

import com.agenda.Agenda;
import com.registro.Registro;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Agenda ag = new Agenda();
		Registro rg = new Registro();			
		
		imprimeMenu();
		int opcao = Integer.parseInt(sc.next());
		while (opcao != 0) {			
			switch (opcao) {
			case 1: 
				System.out.println("~\tCADATRO\t\t~");
				System.out.println("~\tCódigo.:");
			    int codigo = Integer.parseInt(sc.next());
			
				/*
			    while(ag.obter(codigo) != null){
					System.out.println("O código "+codigo+" já existe.");
					System.out.println("~\tCódigo.:");
					codigo = Integer.parseInt(sc.nextLine());
				}*/
			    
				rg.setCodigo(codigo);
				
				/*System.out.println("~\tNome.:");
				rg.setNome(sc.next());
				
				System.out.println("~\tEndereço.:");
				rg.setEndereço(sc.next());
				
				System.out.println("~\tTelefone.:");
				rg.setNum_telefone(sc.next());
				
				System.out.println("~\tE-mail.:");
				rg.setEmail(sc.next());		*/
								
				ag.adicionar(rg);			
				break;
			case 2 : 
				System.out.println("remover");
				break;	
			case 3 :
				System.out.println("~\tLISTAR\t\t~");
				for (int i = 0; i < ag.listar().size(); i++) {
					ag.listar().toString();
					System.out.println(ag.getRegistros().get(i).toString());
				}
				break;
			case 4 :
				System.out.println("alterar");
				break;
			}
			imprimeMenu();
			opcao = Integer.parseInt(sc.next());
		}
	
	}

	public static void imprimeMenu(){
		System.out.println("~\tSISTEMA\t\t~");
		System.out.println("~\t(1) - CADASTRO\t~");
		System.out.println("~\t(2) - REMOVER\t~");
		System.out.println("~\t(3) - LISTAR\t~");
		System.out.println("~\t(4) - ALTERAR\t~");
		System.out.println("~\t\t\t~");
		System.out.println("~\t(0) - SAIR\t~");
		System.out.println("~\t\t\t~");
	}
	

	
}
