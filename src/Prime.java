import java.util.ArrayList;

/**
 * TODO Put here a description of what this class does.
 * 
 * @author applekw. Created Mar 24, 2011.
 */
public class Prime {
	public static ArrayList<Integer> factorization(int n) {

		ArrayList<Integer> ret = new ArrayList<Integer>();

		for (int candidate = 2; n > 1; candidate++) {
			for (; n % candidate == 0; n /= candidate) {
				ret.add(candidate);
			}
		}
		return ret;
	}

	/**
	 * TODO Put here a description of what this method does.
	 *
	 * @param i
	 * @return
	 */
	public static Object generate(int i) {
		// TODO Auto-generated method stub.
		return null;
	}
}
