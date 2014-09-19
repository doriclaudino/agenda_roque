package com.agenda;

import java.util.ArrayList;

import com.registro.Registro;

public class Agenda {
	
	private ArrayList<Registro> registros = new ArrayList<Registro>();
	
	
	public ArrayList<Registro> getRegistros() {
		return registros;
	}

	public void setRegistros(ArrayList<Registro> registros) {
		this.registros = registros;
	}

	//Adicionar registro
	public int adicionar(Registro rg){
			this.registros.add(rg);
			return this.registros.size();
	}
	
	//Atualiza registro
	public void atualizar(Registro registro_velho, Registro registro_atualizado){
		getRegistros().set(getRegistros().indexOf(registro_velho), registro_atualizado);
		
	}
	
	//Excluir registro
	public int excluir(Registro r){	
		int index = getRegistros().indexOf(r);
		if(index > -1)
			getRegistros().remove(r);
		return index;					
	}
	
	//Visualizar registros
	public ArrayList<Registro> listar(){
		return getRegistros();
	}
	
	//Retornar registro
	public Registro obter(int cod){
		Registro r = new Registro();
		
		//trata o primeiro registro		
		if(this.registros.isEmpty()) return null;
			
		for (int i = 0; i < getRegistros().size(); i++) {
			r = getRegistros().get(i);
			
			if(r.getCodigo() == cod)
				return r;			
		}				
		return null;
	}

}
