
public class Main {

	public static void main(String[] args) {
		Frota frota = new Frota();
		
		//Criação de veiculos:
		Veiculos nc1 = new Veiculos("Toyota","Corolla",12.0,"Gasolina",60,30);
		Veiculos nc2 = new Veiculos("Tesla","Model 3",10.0,"Gasolina",65,40);
		Veiculos nc3 = new Veiculos("Tesla","Model S",7.0,"Eletrico",70,50);
		Veiculos nc4 = new Veiculos("Tesla","Model 3",9.0,"Diesel",70,50);
		Veiculos nc5 = new Veiculos("Volkswagen","Golf",12.0,"Flex",60,30);
		Veiculos nc6 = new Veiculos("Volkswagen","Passat",15.0,"Gasolina",65,40);
		Veiculos nc7 = new Veiculos("Volkswagen","Golf",11.0,"Diesel",70,50);
		Veiculos nc8 = new Veiculos("Toyota","Corolla",5.0,"Eletrico",70,50);
		Veiculos nc9 = new Veiculos("Toyota","Camry",20.0,"Flex",60,30);
		Veiculos nc10 = new Veiculos("Chevrolet","Onix",13.0,"Gasolina",65,40);
		Veiculos nc11 = new Veiculos("Chevrolet","Cruze",11.0,"Diesel",70,50);
		Veiculos nc12 = new Veiculos("Chevrolet","Onix Plus",8.0,"Eletrico",70,50);
		
		//Cadastramento de veiculos:
		//frota.adicionarVeiculo(nc1);
		frota.adicionarVeiculo(nc2);
		frota.adicionarVeiculo(nc3);
		frota.adicionarVeiculo(nc4);
		frota.adicionarVeiculo(nc5);
		frota.adicionarVeiculo(nc6);
		frota.adicionarVeiculo(nc7);
		frota.adicionarVeiculo(nc8);
		frota.adicionarVeiculo(nc9);
		frota.adicionarVeiculo(nc10);
		frota.adicionarVeiculo(nc11);
		frota.adicionarVeiculo(nc12);
		
		//Consultas:
		//System.out.println(frota);
		//frota.listarlessautonomia();
		//frota.listarTopVeiculos();
		//frota.listarLesserVeiculos();
		//frota.listarVeiculosGasolina();
		//frota.listarVeiculosDiesel();
		//frota.listarVeiculosEletrico();
		//frota.listarVeiculosFlex();
		//frota.abastecerFrota("Eletrico", 20);
	}

}
