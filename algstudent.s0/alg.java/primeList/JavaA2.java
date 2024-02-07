package primeList;

public class JavaA2 extends AbstractAlgorithm{

	public static void main(String[] args) {
		new JavaA2().primeList();
	}
	
	@Override
	protected boolean isPrime(int number) {
		for ( int i = 2 ; i < number ; i++ ) {
			if (number%i == 0)
					return false;
		}
		return true;
	}
}
