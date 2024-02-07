package primeList;

import java.util.ArrayList;

public abstract class AbstractAlgorithm {

	private static final int CASES = 7;
	protected void primeList() {
		int n = 10000;
		for (int i = 0 ; i < CASES ; i++) {
			long t1 = System.currentTimeMillis();
			listPrimeNumbers(n);
			long t2 = System.currentTimeMillis();
			System.out.println("n= "+n+"*** time =" + ((int) (t2-t1))+ " milliseconds" );
			n = n *2;
		}
	}

	protected ArrayList<Integer> listPrimeNumbers(int n) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for ( int i = 2 ; i < n+1 ; i++) {
			if ( isPrime(i) ) {
				primes.add(i);
			}
		}
		return primes;
	}

	protected abstract boolean isPrime(int number);
}
