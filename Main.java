
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		ComplexNum testComplexNum1 = new ComplexNum();
		testComplexNum1.setImaginaryNum(129);
		testComplexNum1.setRealNum(2.5);


		ComplexNum testComplexNum2 = new ComplexNum();
		testComplexNum2.setImaginaryNum(100);
		testComplexNum2.setRealNum(-3);

		
		BasicMathDoer testBasicMathDoer = new BasicMathDoer(testComplexNum1, testComplexNum2);
		
		testComplexNum1.printThis();
		testComplexNum2.printThis();

		//testBasicMathDoer.subtract().printThis();
		testBasicMathDoer.add().printThis();
		
		
	}

}
