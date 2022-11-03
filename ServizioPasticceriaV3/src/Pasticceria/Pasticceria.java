package Pasticceria;

import java.util.Scanner;

public class Pasticceria {
	
	private String nome;
	Torta[] vetrina = new Torta[5];
    private static Pasticceria single_instance = null;

    private Pasticceria()
    {
    	System.out.println("Benvenuti, cosa desiderate?\n");
    }
	
	public static Pasticceria getInstance()
    {
        if (single_instance == null)
            single_instance = new Pasticceria();
  
        return single_instance;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Torta[] getVetrina() {
		return vetrina;
	}

	public void setVetrina(Torta[] vetrina) {
		this.vetrina = vetrina;
	}
	
	public Torta preparaTorta(String nome, double prezzo) {
			return new Torta(nome, prezzo);
			
		}
	
	public Torta[] allestisciVetrina(Torta[] vetrina, Pasticceria pasticceria) {
		
		String nome;
		double prezzo;
		Scanner in=new Scanner(System.in);
		Scanner num=new Scanner(System.in);
		in.useDelimiter("\\s*");
		for(int i=0; i<vetrina.length; i++) {
			System.out.println("inserisci nome torta");
			nome=in.nextLine();
			System.out.println("inserisci prezzo torta");
			prezzo=num.nextDouble();
			vetrina[i]= pasticceria.preparaTorta(nome, prezzo);
		}
		
		return vetrina;
		
	}
	
	public void mostraVetrina(Torta[] vetrina) {
		Scanner in= new Scanner(System.in);
		System.out.println("scegliere la torta desiderata \n");
		int i =0;
		for(Torta torta : vetrina) {
			i++;
			if (torta!=null) {
				System.out.println
				(i + " per torta " + torta.getNome() + " al costo di " + torta.getPrezzo() + " €");
			}
		}
	}
	
	public int caso(Torta[]vetrina, int scelta, int rimaste ){
		if (vetrina[scelta-1]!=null) {
			System.out.println("ecco a lei la torta " + vetrina[scelta-1].getNome()+"\n");
			vetrina[scelta-1] = null;
			rimaste--;
			return rimaste;
		}else {System.out.println("la torta richiesta è terminata\n");
		return rimaste;

		}
		
	}
	
	public void serviCliente(Torta[]vetrina) {
		Scanner in= new Scanner(System.in);
		int scelta;
		for (int rimaste=5;rimaste>0;) {
			mostraVetrina(vetrina);
			scelta = in.nextInt();
			switch (scelta) {
			case 1: {
				rimaste=caso(vetrina, scelta, rimaste);
				break;
			}
			case 2: {
				rimaste=caso(vetrina, scelta, rimaste);
				break;
			}
			case 3: {
				rimaste=caso(vetrina, scelta, rimaste);
				break;
			}
			case 4: {
				rimaste=caso(vetrina, scelta, rimaste);
				break;
			}
			case 5: {
				rimaste=caso(vetrina, scelta, rimaste);
				break;
			}
			default:
				System.out.println("inserire numero corretto\n");
			}
		}
	System.out.println("siamo spiacenti, tutte le torte sono state vendute, arrivederla!");
		
	}

}
