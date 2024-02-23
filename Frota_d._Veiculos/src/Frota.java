import java.util.ArrayList;
import java.util.List;

public class Frota {
	@Override
	public String toString() {
		return "Frota [frota=" + frota + "]";
	}

	private List<Veiculos> frota;
public Frota() {
	frota = new ArrayList<>();
}
public void adicionarVeiculo(Veiculos veiculo) {
    frota.add(veiculo);
}

public void listarVeiculos() {
    for (Veiculos veiculo : frota) {
        System.out.println(veiculo);
    }
}
}
