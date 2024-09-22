package AC1;

public class Principal {
    public static void main(String[] args) {
    	
    	// arrumar espaçamento

        Moto moto = new Moto("Modelo da Moto:", ", ABC1D23", ", Montadora", 15000.0, "Preto", 2022, "500cc", 180.0, "12345XYZ", "Dianteira");

       Carro carro = new Carro("Fusca", "ABC-1234", "Volkswagen", 20000.0,"azul", 1976, 2, 60.0, "hatchback", "manual", "gasolina");

       Caminhao caminhao = new Caminhao("Scania R450", "XYZ-9876", "Scania", 300000.0, "branco", 2020, 3, "20 toneladas", "4 metros", "cabinada", "caminhão baú");

       
    System.out.println(moto.descricaoMoto()); 
    	System.out.println("");
    System.out.println(carro.descricaoCarro());
    	System.out.println("");
    System.out.println(caminhao.descricaoCaminhao()); 
    	System.out.println("");
    	
    System.out.println("Modelo Insert: ");
	    System.out.println(moto.insert());
	    System.out.println(carro.insert());
	    System.out.println(caminhao.insert());
    
    }
}