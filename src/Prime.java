import java.util.ArrayList;

/**
 * TODO Put here a description of what this class does.
 * 
 * @author applekw. Created Mar 24, 2011.
 */
public class Prime {
	public static ArrayList<Integer> factorization(int n) {

		ArrayList<Integer> ret = new ArrayList<Integer>();

		while (n % 2 == 0) {
			ret.add(2);
			n/=2;
		}
		if (n == 3)
			ret.add(3);
		return ret;
	}
}
