package primeList;

public class JavaA1 extends AbstractAlgorithm{

	public static void main(String[] args) {
		new JavaA1().primeList();
	}
	
	@Override
	protected boolean isPrime(int number) {
		boolean isPrime = true;
		for ( int i = 2 ; i < number ; i++ ) {
			if (number%i == 0)
					isPrime = false;
		}
		return isPrime;
	}
}
