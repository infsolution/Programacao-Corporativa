package model;

import java.util.ArrayList;
import java.util.List;

public class EmpresaAerea {
	private String nome;
	private int codigo;
	private List<Aeronave> frota = new ArrayList<>();
	private List<Funcionario> funcioanrios = new ArrayList<>();
	public EmpresaAerea(String nome){
		this.nome=nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public List<Aeronave> getFrota() {
		return frota;
	}
	public void setFrota(List<Aeronave> frota) {
		this.frota = frota;
	}
	public List<Funcionario> getFuncioanrios() {
		return funcioanrios;
	}
	public void setFuncioanrios(List<Funcionario> funcioanrios) {
		this.funcioanrios = funcioanrios;
	}
	
}
