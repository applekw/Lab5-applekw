import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


/**
 * TODO Put here a description of what this class does.
 *
 * @author applekw.
 *         Created Mar 24, 2011.
 */
public class Lab5Tests {

	@Test
	public void testOne(){
		assertEquals(new ArrayList<Integer>(), Prime.factorization(1));
	}
	
	@Test
	public void testTwo(){
		assertEquals(list(2), Prime.factorization(2));
	}
	
	
	public ArrayList<Integer> list(int...ints){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		
		for (int i: ints){
			ret.add(i);
		}
		return ret;
	}
}


