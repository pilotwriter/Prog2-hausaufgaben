package ueb14;

public class Uhrzeit {
	private int stunde;
	private int minute;
	
	public Uhrzeit(int stunde, int minute) {
		//kontrolle addieren
		
		this.stunde=stunde;
		this.minute= minute;
	}
	//override
	public String toString() {
		return this.getStunde() + ":"  + this.getMinute() + " Uhr";
	}

	public int getStunde() {
		return stunde;
	}

	public int getMinute() {
		return minute;
	}
	//override 
	public boolean equals (Object obj) {
		Uhrzeit uhr = (Uhrzeit) obj;
		
		if(this.getStunde() != uhr.getStunde())
		return false;
		
		if(this.getMinute() != uhr.getMinute())
			return false;
		
		return true;
		
	}

}
