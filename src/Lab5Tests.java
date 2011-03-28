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

	
	
	///tests for task 4
	
	@Test
	public void testOne(){
		assertEquals(new ArrayList<Integer>(), Prime.factorization(1));
	}
	
	@Test
	public void testTwo(){
		assertEquals(list(2), Prime.factorization(2));
	}
	
	@Test
	public void testThree(){
		assertEquals(list(3), Prime.factorization(3));
	}
	
	@Test
	public void testFour(){
		assertEquals(list(2, 2), Prime.factorization(4));
	}
	
	@Test
	public void testSix(){
		assertEquals(list(2,3), Prime.factorization(6));
	}
	
	@Test
	public void testEight(){
		assertEquals(list(2,2,2), Prime.factorization(8));
	}
	
	@Test
	public void testNine(){
		assertEquals(list(3,3), Prime.factorization(9));
	}
	
	@Test
	public void testLarge(){
		assertEquals(list(5,7,7,1327), Prime.factorization(325115));
	}
	
	
	
	///tests for task 5
	
	@Test
	public void testUno(){
		assertEquals(new ArrayList<Integer>(), Prime.generate(1));
	}
	
	@Test
	public void testDos(){
		assertEquals(list(1), Prime.generate(2));
	}
	
	@Test
	public void testTres(){
		assertEquals(list(1,2), Prime.generate(3));
	}
	
	@Test
	public void testQuatro(){
		assertEquals(list(1,2,3), Prime.generate(4));
	}
	
	@Test
	public void testCinco(){
		assertEquals(list(1,2,3), Prime.generate(5));
	}
	
	@Test
	public void testSixInSpanish(){
		assertEquals(list(1,2,3,5), Prime.generate(6));
	}
	
	@Test 
	public void testOcho(){
		assertEquals(list(1,2,3,5,7),Prime.generate(8));
	}
	
	@Test
	public void test20() {
		assertEquals(list(1,2,3,5,7,11,13,17,19),Prime.generate(20));
	}
	
	public ArrayList<Integer> list(int...ints){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		
		for (int i: ints){
			ret.add(i);
		}
		return ret;
	}
}


