
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		ComplexNum testComplexNum1 = new ComplexNum();
		testComplexNum1.setRealNum(2);
		testComplexNum1.setImaginaryNum(-2);
		


		ComplexNum testComplexNum2 = new ComplexNum();
		testComplexNum2.setRealNum(1);
		testComplexNum2.setImaginaryNum(1000);
		

		
		BasicMathDoer testBasicMathDoer = new BasicMathDoer(testComplexNum1, testComplexNum2);
		
		testComplexNum1.printThis();
		testComplexNum2.printThis();

		testBasicMathDoer.multiply().printThis();
		
		
	}

}
