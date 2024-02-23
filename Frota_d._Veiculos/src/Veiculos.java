
public class Veiculos {

	private String marca;
	private String modelo;
	private double autonomia;
	private String motorizacao;
	private double capacidade_tanque;
	private double quantidade_d_combustivel;
	
	public Veiculos(
			String marca,
			String modelo,
			double autonomia,
			String motorizacao,
			double capacidade_tanque,
			double quantidade_d_combustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.autonomia = autonomia;
		this.motorizacao = motorizacao;
		this.quantidade_d_combustivel = quantidade_d_combustivel;
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

	public double getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}

	public String getMotorizacao() {
		return motorizacao;
	}

	public void setMotorizacao(String motorizacao) {
		this.motorizacao = motorizacao;
	}

	public double getCapacidade_tanque() {
		return capacidade_tanque;
	}

	public void setCapacidade_tanque(double capacidade_tanque) {
		this.capacidade_tanque = capacidade_tanque;
	}

	public double getQuantidade_d_combustivel() {
		return quantidade_d_combustivel;
	}

	public void setQuantidade_d_combustivel(double quantidade_d_combustivel) {
		this.quantidade_d_combustivel = quantidade_d_combustivel;
	}

	@Override
	public String toString() {
		return "Veiculos [marca=" + marca + ", modelo=" + modelo + ", autonomia=" + autonomia + ", motorizacao="
				+ motorizacao + ", capacidade_tanque=" + capacidade_tanque + ", quantidade_d_combustivel="
				+ quantidade_d_combustivel + "]";
	}
	}
