package model;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	private int codigo;
	private List<Produto> compras = new ArrayList<>();
	private float bonus;
	public Compra(int codigo){
		this.codigo=codigo;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public List<Produto> getCompras() {
		return compras;
	}
	public void setCompras(List<Produto> compras) {
		this.compras = compras;
	}
	public void addProduto(Produto produto){
		this.compras.add(produto);
	}
	public float calculaBonus(){
		float bonus=0;
		for(int i=0;i<this.compras.size();i++){
			bonus+=this.compras.get(i).getBonus();
		}
		return bonus;
	}
	public float getBonus() {
		return bonus;
	}
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	
}
