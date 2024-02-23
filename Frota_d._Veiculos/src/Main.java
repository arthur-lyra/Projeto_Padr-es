
public class Main {

	public static void main(String[] args) {
		Frota frota = new Frota();
		Veiculos nc1 = new Veiculos("Chevrolet","Camaro",12.0,"Flex",60,30);
		
		System.out.println(frota);
		System.out.println(nc1);
		frota.adicionarVeiculo(nc1);
		System.out.println(frota);
	}

}
