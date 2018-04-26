package student;

/**
 * Project: CSCI142     lab 01
 * Name: Campbell
 * Date: Apr 2018
 *
 * Desc: determine if a number is prime or not
 */
public class PrimalityTest
{
//constants

//fields

//constructors

//getters and setters

//other methods

	/**
	 * Determines if an integer is prime or not
	 *
	 * @param p_int (int) - the integer in question
	 *
	 * @return (boolean) - true if prime, false if composite
	 */
	public static boolean isPrime (int p_int)
	{
		if (p_int <= 1)
			return false;
		int r1;
		double r2;
		for (int i = 2; i <= Math.sqrt(p_int); i++)
		{
			    r1 = p_int/i;
			    r2 = p_int/(double)i;
			    if (r1 == r2)
			    	return false;
		}
		return true;
	}

//overrides

}//EoC PrimalityTest
//EoF
