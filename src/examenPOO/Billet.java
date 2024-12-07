package examenPOO;

import java.time.LocalDate;

public abstract class Billet implements Publiable {
	
	private LocalDate datePub;
	private String billet;
	
	
	public Billet(LocalDate datePub, String billet) {
		this.datePub = datePub;
		this.billet = billet;
	}

	
	@Override
	public String toString() {
		return "Billet [datePub=" + datePub + ", billet=" + billet + "]";
	}

}
