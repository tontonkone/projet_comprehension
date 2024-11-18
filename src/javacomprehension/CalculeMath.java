package javacomprehension;

import java.util.Iterator;

/**
 * @author km84
 */

public class CalculeMath {
	/**
	 * Function de calcul factorielle d'un nombre
	 * @param val 
	 * @return factorielle
	 */
	
	public int fac(int val) {
		int result = val;
		for (int k = val - 1 ; k > 0; k--) {
			result *= k;
		}
		return result;
	}

}
