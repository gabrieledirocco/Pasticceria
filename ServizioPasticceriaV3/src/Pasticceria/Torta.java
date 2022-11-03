package Pasticceria;

public class Torta {
	
	private String nome;
	private Double prezzo;
	
	public Torta(String nome, Double prezzo) {
		this.nome = nome;
		this.prezzo = prezzo;
		System.out.println("Abbiamo una torta "+ nome+ " al prezzo di " + prezzo+ " €\n");
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}
	
	
}
