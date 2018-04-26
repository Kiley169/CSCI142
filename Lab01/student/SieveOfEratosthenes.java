package student;

/**
 * Project: CSCI142 Lab 01
 * Name: Campbell
 * Date: Apr 2018
 *
 * Desc: Make a Sieve of Eratosthenes
 */
public class SieveOfEratosthenes
{
//constants

//fields

//constructors

//getters and setters

//other methods
	public static int[] makeSieve (int p_upperBound)
	{
		int prime = 0;
		int composite = 1;
		int[] sieve =  new int[p_upperBound];
		int spot;
		for (int i = 0; i < p_upperBound; i++)
		{
			if (sieve[i] == 0)//unknown
			{
				spot = PrimalityTest.isPrime(i) ? prime : composite;
				sieve[i] = spot;
				
				if (i > 1)
				{
					for (int j =  2 * i; j < p_upperBound; j+= i)
						sieve[j] = composite;
				}

			}
		}
		return sieve;

	}

//overrides

}//EoC SieveOfEratosthenes
//EoF
