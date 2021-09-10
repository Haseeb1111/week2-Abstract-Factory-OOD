package haseeb2;

public class RacketFactory {

	public static Racket getRacket(RacketAbstractFactory factory){
		return factory.createRacket();
	}
}