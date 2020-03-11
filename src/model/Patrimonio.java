package model;

public class Patrimonio extends Entity<Patrimonio> {
	
	private Integer numeroPatrimonio;
	private Integer numeroCP;
	private String nome;
	private String marca;
	private String modelo;
	private float valor;

	public Integer getNumeroPatrimonio() {
		return numeroPatrimonio;
	}
	public void setNumeroPatrimonio(Integer numeroPatrimonio) {
		this.numeroPatrimonio = numeroPatrimonio;
	}
	public Integer getNumeroCP() {
		return numeroCP;
	}
	public void setNumeroCP(Integer numeroCP) {
		this.numeroCP = numeroCP;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
}
