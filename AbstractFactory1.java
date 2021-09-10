package haseeb2;

public class AbstractFactory1 {

	public static void main(String[] args) {
		testAbstractFactory();
	}

	private static void testAbstractFactory() {
		Racket Tennis = haseeb2.RacketFactory.getRacket(new TennisFactory("Felt covered ball","Running"));
		Racket Badminton = haseeb2.RacketFactory.getRacket(new BadmintonFactory("shuttlecock","Lunges"));
		System.out.println("AbstractFactory PC Config::"+Tennis);
		System.out.println("AbstractFactory Server Config::"+Badminton);
}
}