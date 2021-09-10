package haseeb2;
public class TennisFactory implements RacketAbstractFactory {

	private String equipment;
	private String footwork;
	
	public TennisFactory(String equipment, String footwork){
		this.equipment=equipment;
		this.footwork=footwork;
    }
	@Override
	public Racket createRacket() {
		return new Tennis(equipment, footwork);
	}

}