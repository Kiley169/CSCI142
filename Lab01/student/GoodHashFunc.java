package student;

/**
 * Project: CSCI142  Lab 01
 * Name: Campbell
 * Date: Apr 2018
 *
 * Desc: use an create a Hash Function
 */
public class GoodHashFunc
{
//constants

//fields

//constructors

//getters and setters

//other methods

	/**
	 * create a hashcode for the String
	 * the hash code:  h = s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]*31^0
	 * 	where s is the string
	 * 	where n is size of the string
	 *
	 * @param p_String - the String to be hashed
	 * @return  (int) - the hashcode for p_string
	 */
	public static int computeHash(String p_String)
	{
		//h = s[0]*31(n-1) + s[1]*31(n-2) + ... + s[n-1]*310
		int[] letterValues = new int[p_String.length()];

		for (int i = 0; i <p_String.length() ; i++)
		{
			letterValues[i] = p_String.substring(i,i+1).hashCode() * (int)Math.pow(31,p_String.length()-(i+1));
		}
		int answer = 0;
		int index = 0;
		while (index < letterValues.length)
		{
			answer += letterValues[index];
			index += 1;
		}

		return answer;

	}

//overrides

}//EoC GoodHashFunc
//EoF
