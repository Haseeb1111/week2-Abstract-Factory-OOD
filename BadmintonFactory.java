package haseeb2;

public class BadmintonFactory implements RacketAbstractFactory {

	private String equipment;
	private String footwork;
	
	public BadmintonFactory(String equipment, String footwork){
		this.equipment=equipment;
		this.footwork=footwork;
	}
	@Override
	public Racket createRacket() {
		return new Badminton(equipment,footwork);
	}

}
