import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		
		if(validarModeloMarca(marca, modelo)) {
			
		this.marca = marca;
		this.modelo = modelo;
		this.autonomia = autonomia;
		this.motorizacao = motorizacao;
		this.capacidade_tanque = capacidade_tanque;
		this.quantidade_d_combustivel = quantidade_d_combustivel;
	}else {
		throw new IllegalArgumentException("O modelo informado não pertence à marca selecionada.");
	}
	}
		
	private static final Map<String, List<String>> modelosPorMarca = new HashMap<>();

    static {
       
        List<String> modelosToyota = new ArrayList<>();
        modelosToyota.add("Corolla");
        modelosToyota.add("Camry");
        modelosPorMarca.put("Toyota", modelosToyota);

        List<String> modelosTesla = new ArrayList<>();
        modelosTesla.add("Model 3");
        modelosTesla.add("Model S");
        modelosPorMarca.put("Tesla", modelosTesla);

        List<String> modelosVolkswagen = new ArrayList<>();
        modelosVolkswagen.add("Golf");
        modelosVolkswagen.add("Passat");
        modelosPorMarca.put("Volkswagen", modelosVolkswagen);
        
        List<String> modelosChevrolet = new ArrayList<>();
        modelosChevrolet.add("Onix");
        modelosChevrolet.add("Onix Plus");
        modelosChevrolet.add("Cruze");
        modelosPorMarca.put("Chevrolet", modelosChevrolet);


    }
    
	private boolean validarModeloMarca(String marca, String modelo) {
		return modelosPorMarca.containsKey(marca) && modelosPorMarca.get(marca).contains(modelo);
    }
	
	public void abastecer(double quantidade) {
        if (quantidade_d_combustivel + quantidade <= capacidade_tanque) {
        	quantidade_d_combustivel += quantidade;
            System.out.println("Veículo abastecido com sucesso.");
        } else {
            System.out.println("Capacidade do tanque excedida. Abastecimento não realizado.");
        }
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
		return "\nVeiculos = [marca= " + marca + ", modelo= " + modelo + ", autonomia= " + autonomia + ", motorizacao= "
				+ motorizacao + ", capacidade_tanque= " + capacidade_tanque + ", quantidade_d_combustivel= "
				+ quantidade_d_combustivel + "]";
	}
	}
