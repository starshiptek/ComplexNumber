
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		ComplexNum testComplexNum1 = new ComplexNum();
		testComplexNum1.setRealNum(5);
		testComplexNum1.setImaginaryNum(6);
		


		ComplexNum testComplexNum2 = new ComplexNum();
		testComplexNum2.setRealNum(5);
		testComplexNum2.setImaginaryNum(6);
		

		
		BasicMathDoer testBasicMathDoer = new BasicMathDoer(testComplexNum1, testComplexNum2);
		
		testComplexNum1.printThis();
		testComplexNum2.printThis();

		//testBasicMathDoer.subtract().printThis();
		System.out.println(foilDebuggerF);
		
		
	}

}
