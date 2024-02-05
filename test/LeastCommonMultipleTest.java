package Sprint0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LeastCommonMultipleTest {

	@Test
	public void findGreatestCommonDivisorTest(){
		//assuming only positive integers
		
		//Test case 1: GCD of 7 and 13 is 1
		assertEquals(1, LeastCommonMultiple.findGreatestCommonDivisor(7, 13));
		
		//Test case 2: GCD of 476 and 343 is 7
		assertEquals(7, LeastCommonMultiple.findGreatestCommonDivisor(476, 343));
		
		//Test case 3: GCD of 196 and 336 is 28
		assertEquals(28, LeastCommonMultiple.findGreatestCommonDivisor(196, 336));
				
		//Test case 4: GCD of 35 and 10 is 5
		assertEquals(5, LeastCommonMultiple.findGreatestCommonDivisor(35, 10));	
	}

	@Test
	public void calculateLeastCommonMultiple() {
		//assuming only positive integers
		
		//Test case 1: LCM of 16 and 20 is 80
		int lcmResult1 = LeastCommonMultiple.calculateLeastCommonMultiple(16, 20);
		assertTrue(lcmResult1 == 80);
		
		//Test case 2: LCM of 51 and 32 is 1632
		int lcmResult2 = LeastCommonMultiple.calculateLeastCommonMultiple(51, 32);
		assertTrue(lcmResult2 == 1632);
		
		//Test case 3: LCM of 34 and 68 is 68
		int lcmResult3 = LeastCommonMultiple.calculateLeastCommonMultiple(34, 68);
		assertFalse(lcmResult3 != 68);
		
		//Test case 4: LCM of 1 and 1 is 1
		int lcmResult4 = LeastCommonMultiple.calculateLeastCommonMultiple(1, 1);
		assertFalse(lcmResult4 != 1);
	}
}

	
