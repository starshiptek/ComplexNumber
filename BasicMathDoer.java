
public class BasicMathDoer {
	
	private ComplexNum complexNum1 = new ComplexNum();
	private ComplexNum complexNum2 = new ComplexNum();
	private ComplexNum complexNumResultOfSubtraction = new ComplexNum();
	private ComplexNum complexNumResultOfAddition = new ComplexNum();
	private ComplexNum complexNumResultOfMultiply = new ComplexNum();
	private static int iSquared = -1;
	public double foilDebuggerF = 0;
	public double foilDebuggerO = 0;
	public double foilDebuggerI = 0;
	public double foilDebuggerL = 0;
	

	
	public BasicMathDoer(ComplexNum complexNum1, ComplexNum complexNum2){
		this.complexNum1 = complexNum1;
		this.complexNum2 = complexNum2;
		
		
	}
	
	
	/**
	 * complexNum1 minus ComplexNum2
	 * 
	 */
	public ComplexNum subtract(){
		complexNumResultOfSubtraction.setRealNum(this.complexNum1.getRealNum() - this.complexNum2.getRealNum());
		complexNumResultOfSubtraction.setImaginaryNum(this.complexNum1.getImaginaryNum() - this.complexNum2.getImaginaryNum());

		
		return complexNumResultOfSubtraction;
	}
	
	/**
	 * complexNum1 plus ComplexNum2
	 * 
	 */
	public ComplexNum add(){
		complexNumResultOfAddition.setRealNum(this.complexNum1.getRealNum() + this.complexNum2.getRealNum());
		complexNumResultOfAddition.setImaginaryNum(this.complexNum1.getImaginaryNum() + this.complexNum2.getImaginaryNum());
		
		return complexNumResultOfAddition;
	}
	
	
	public ComplexNum multiply(){
		
		//Step 1 "F" in FOIL 
		foilDebuggerF = this.complexNum1.getRealNum() * this.complexNum2.getRealNum();
		
		//Step 2 "O" in FOIL
		foilDebuggerO = this.complexNum1.getRealNum() * this.complexNum2.getImaginaryNum();
		
		//Step 3 "I" in FOIL -- adds the current imaginary-number part to the result of the next step of FOIL
		foilDebuggerI = foilDebuggerO + (complexNum1.getImaginaryNum()*complexNum2.getRealNum());
		
		//Step 4 "L" in FOIL -- iSquared is always -1, so I've set it up as a static variable
		foilDebuggerL = complexNum1.getImaginaryNum() * complexNum2.getImaginaryNum() * iSquared;
		
		return complexNumResultOfMultiply;
		}
}
