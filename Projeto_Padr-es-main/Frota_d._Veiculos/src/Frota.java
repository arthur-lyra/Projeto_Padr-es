import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Frota {

	private List<Veiculos> frota;
	public Frota() {
	frota = new ArrayList<>();
}
	public void adicionarVeiculo(Veiculos veiculo) {
		frota.add(veiculo);
}

	public void listarVeiculos() {
		for (Veiculos v1 : frota) {
			System.out.println(v1);
	}
		}
	
	public void listarTopVeiculos() {
        if (frota.isEmpty()) {
            System.out.println("A frota está vazia.");
            return;
        }
        // Ordene a frota com base em algum critério (por exemplo, autonomia)
        Collections.sort(frota, (v1, v2) -> Double.compare(v2.getAutonomia(), v1.getAutonomia()));
        
        System.out.println("\n---listagem de Top 10 Carros com maior Autonomia:");
        // Liste os top 10 veículos (ou todos, se houver menos de 10)
        int quantidadeDeVeiculos = Math.min(frota.size(), 10);
        for (int i = 0; i < quantidadeDeVeiculos; i++) {
            System.out.println(frota.get(i));
        }
    }
	
	public void listarLesserVeiculos() {
        if (frota.isEmpty()) {
            System.out.println("A frota está vazia.");
            return;
        }
        // Ordene a frota com base em algum critério (por exemplo, autonomia)
        Collections.sort(frota, (v1, v2) -> Double.compare(v1.getAutonomia(), v2.getAutonomia()));
        
        System.out.println("\n---listagem dos Top 10 Carros com menor Autonomia:");
        // Liste os top 10 veículos (ou todos, se houver menos de 10)
        int quantidadeDeVeiculos = Math.min(frota.size(), 10);
        for (int i = 0; i < quantidadeDeVeiculos; i++) {
            System.out.println(frota.get(i));
        }
    }
	
	public void listarVeiculosGasolina() {
		for (Veiculos ga : frota) {
			if(ga.getMotorizacao() == "Gasolina") {
				System.out.println(ga);
			}
				
			}
	}
	public void listarVeiculosDiesel() {
		for (Veiculos Di : frota) {
			if(Di.getMotorizacao() == "Diesel") {
				System.out.println(Di);
			}
				
			}
	}
	public void listarVeiculosFlex() {
		for (Veiculos fl : frota) {
			if(fl.getMotorizacao() == "Flex") {
				System.out.println(fl);
			}
				
			}
	}
	public void listarVeiculosEletrico() {
		for (Veiculos el : frota) {
			if(el.getMotorizacao() == "Eletrico") {
				System.out.println(el);
			}
				
			}
	}
	
	public void listarlessautonomia() {
		double total_autonomia = 0;
		int timer = 0;
		for (Veiculos v4 : frota) {
			timer += 1;
			total_autonomia += v4.getAutonomia(); 
		}
		double mediaautonomia = total_autonomia/timer;
		
		System.out.println("\n---listagem de Carros com Autonomia abaixo da média:");
		for(Veiculos vauto : frota) {
			if (vauto.getAutonomia()< mediaautonomia) {
				System.out.println(vauto);
			}
		}
	}
	
	
	public void abastecerFrota(String tipoCombustivel, double quantidade) {
        
		for (Veiculos veiculo : frota) {
            // Verifica se o veículo utiliza o tipo de combustível informado
            if (veiculo.getMotorizacao().equalsIgnoreCase(tipoCombustivel)) {
                veiculo.abastecer(quantidade);
                System.out.println(veiculo);
            }
        }
	}


@Override
public String toString() {
	return "Frota = [" + frota + "]";
	}

}
