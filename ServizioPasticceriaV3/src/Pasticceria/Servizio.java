package Pasticceria;


public class Servizio {
	
	public static void main(String [] args) {
		
		Torta[] vetrina = new Torta[5];
		Pasticceria germani = Pasticceria.getInstance();
		germani.allestisciVetrina(vetrina, germani);
		germani.serviCliente(vetrina);
		
	}

}
