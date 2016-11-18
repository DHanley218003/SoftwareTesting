package softwareTesting;

import junit.framework.TestCase;
/*
 * private static final double SINGLE_BRACKET1 = 21450;
 * private static final double SINGLE_BRACKET2 = 51900;
 *
 * private static final double MARRIED_BRACKET1 = 35800;
 * private static final double MARRIED_BRACKET2 = 86500;
 */
public class TaxReturnTest extends TestCase {
	
	// Test Number: 1
	// Test Objective: Calculate tax for a single person on an income less than or equal to 21450
	// Input(s): anIncome = 20,000, aStatus = SINGLE
	// Expected Output: 3000
	
	public void testcalculateTax1() {
		
		TaxReturn testObject = new TaxReturn(20000, TaxReturn.SINGLE);
		assertEquals(3000, testObject.calculateTax(), 0.1);
		
	}
	
	// Test Number: 2
	// Test Objective: Calculate tax for a single person on an income less than or equal to 51900
	// Input(s): anIncome = 25,000, aStatus = SINGLE
	// Expected Output: 3000
	
	public void testcalculateTax2() {
		
		TaxReturn testObject = new TaxReturn(25000, TaxReturn.SINGLE);
		assertEquals(4211.5, testObject.calculateTax(), 0.1);
		
	}
	// Test Number: 3
	// Test Objective: Calculate tax for a single person on an income greater than 51900
	// Input(s): anIncome = 60,000, aStatus = SINGLE
	// Expected Output: 3000
		
	public void testcalculateTax3() {
			
		TaxReturn testObject = new TaxReturn(60000, TaxReturn.SINGLE);
		assertEquals(14254.5, testObject.calculateTax(), 0.1);
					
	}
	
	// Test Number: 4
		// Test Objective: Calculate tax for a married person on an income less than or equal to 35800
		// Input(s): anIncome = 30,000, aStatus = MARRIED
		// Expected Output: 3000
			
		public void testcalculateTax4() {
				
			TaxReturn testObject = new TaxReturn(30000, TaxReturn.MARRIED);
			assertEquals(4500.0, testObject.calculateTax(), 0.1);
						
		}
		
		// Test Number: 5
		// Test Objective: Calculate tax for a single person on an less than or equal to 86500
		// Input(s): anIncome = 60,000, aStatus = MARRIED
		// Expected Output: 3000
			
		public void testcalculateTax5() {
				
			TaxReturn testObject = new TaxReturn(60000, TaxReturn.MARRIED);
			assertEquals(12146.0, testObject.calculateTax(), 0.1);
						
		}
		
		// Test Number: 6
		// Test Objective: Calculate tax for a single person on an income greater than 86500
		// Input(s): anIncome = 90,000, aStatus = MARRIED
		// Expected Output: 3000
			
		public void testcalculateTax6() {
				
			TaxReturn testObject = new TaxReturn(90000, TaxReturn.MARRIED);
			assertEquals(20651.0, testObject.calculateTax(), 0.1);
						
		}
}
