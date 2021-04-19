package ueb14;

import java.util.ArrayList;

public class Raum {
	private int geb;
	private int etage;
	private int raum;
	protected ArrayList<Reservierung> reservierung = new ArrayList<Reservierung>();
	
	public Raum(int geb, int etage,int raum) {
		this.etage=etage;
		this.geb= geb;
		this.raum = raum;	
	}
	//change toString method from here
	public String toString() {
		if(reservierung.size() > 0) {
			String antwort =this.getGeb()+ "-" + this.getEtage() + "." + this.raum + "\n";
			for(int i = 0; i<reservierung.size();i++) {
				antwort += "gebucht von " + reservierung.get(i).von.toString()  + " von "+ 
			reservierung.get(i).getBegin() + " bis " + reservierung.get(i).getEnde()+ "für " + reservierung.get(i).getBemerkung() + "\n";
			}	
			return antwort;
		}
		return this.getGeb()+ "-" + this.getEtage() + "." + this.getRaum();

	}
	
	public int getGeb() {
		return geb;
	}
	public int getRaum() {
		return raum;
	}
	public int getEtage() {
		return etage;
	}
	
	public Reservierung getReservierung(int index) {
		return reservierung.get(index);
	}
	
	public int getAnzahlReservierungen() {
		return reservierung.size();
	}
	
	public void addReservierung(Reservierung res) {
		reservierung.add(res);
	}
	public boolean equals (Object obj) {
		Raum raum = (Raum) obj;
		if(this.getGeb() != raum.getGeb())
			return false;
		
		return true;
		
		
	}

}
