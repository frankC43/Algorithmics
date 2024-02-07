package primeList;

public class JavaA3 extends AbstractAlgorithm{

	public static void main(String[] args) {
		new JavaA2().primeList();
	}
	
	@Override
	protected boolean isPrime(int number) {
		for ( int i = 2 ; i < (number/2)+1 ; i++ ) {
			if (number%i == 0)
					return false;
		}
		return true;
	}
}
