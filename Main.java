
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		ComplexNum testComplexNum1 = new ComplexNum();
		testComplexNum1.setRealNum(1);
		testComplexNum1.setImaginaryNum(2);
		
//
//
//		ComplexNum testComplexNum2 = new ComplexNum();
//		testComplexNum2.setRealNum(2);
//		testComplexNum2.setImaginaryNum(4);
		

		
//		BasicMathDoer testBasicMathDoer = new BasicMathDoer(testComplexNum1, testComplexNum2);
		AdvancedMathDoer testAdvancedMathDoer = new AdvancedMathDoer();
		
		testComplexNum1.printThis();
//		testComplexNum2.printThis();

//		testBasicMathDoer.divide().printThis();
		testAdvancedMathDoer.gotoTheNthPower(testComplexNum1, testComplexNum1, 0).printThis();
		

		
		
		
	}

}
