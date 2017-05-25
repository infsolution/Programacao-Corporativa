package model;

public class Rota {
	private int codigo;
	private Aeroporto inicio;
	private Aeroporto conexao;
	private Aeroporto fim;
	public Rota(int codigo){
			this.codigo=codigo;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Aeroporto getInicio() {
		return inicio;
	}
	public void setInicio(Aeroporto inicio) {
		this.inicio = inicio;
	}
	public Aeroporto getConexao() {
		return conexao;
	}
	public void setConexao(Aeroporto conexao) {
		this.conexao = conexao;
	}
	public Aeroporto getFim() {
		return fim;
	}
	public void setFim(Aeroporto fim) {
		this.fim = fim;
	}
	
}
