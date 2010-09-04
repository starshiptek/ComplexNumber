
public class BasicMathDoer {
	
	private ComplexNum complexNum1 = new ComplexNum();
	private ComplexNum complexNum2 = new ComplexNum();
	private ComplexNum complexNumResultOfSubtraction = new ComplexNum();
	private ComplexNum complexNumResultOfAddition = new ComplexNum();
	private ComplexNum complexNumResultOfMultiply = new ComplexNum();
	private ComplexNum complexNumResultOfDivision = new ComplexNum();
	private ComplexNum complexNumConjugateOfDenominator = new ComplexNum();
	private ComplexNum complexNumNumerator = new ComplexNum();
	private ComplexNum complexNumDenominator = new ComplexNum();
	
	private static int iSquared = -1;
	private double foilStep_F = 0;
	private double foilStep_O = 0;
	private double foilStep_I = 0;
	private double foilStep_L = 0;

	

	
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
	

	public ComplexNum add(){
		complexNumResultOfAddition.setRealNum(this.complexNum1.getRealNum() + this.complexNum2.getRealNum());
		complexNumResultOfAddition.setImaginaryNum(this.complexNum1.getImaginaryNum() + this.complexNum2.getImaginaryNum());
		
		return complexNumResultOfAddition;
	}
	
	
	public ComplexNum multiply(){
		
		//Step 1 "F" in FOIL 
		foilStep_F = this.complexNum1.getRealNum() * this.complexNum2.getRealNum();
		
		//Step 2 "O" in FOIL
		foilStep_O = this.complexNum1.getRealNum() * this.complexNum2.getImaginaryNum();
		
		//Step 3 "I" in FOIL -- adds the current imaginary-number part to the result of the next step of FOIL
		foilStep_I = this.complexNum1.getImaginaryNum()*this.complexNum2.getRealNum();
		
		//Step 4 "L" in FOIL -- iSquared is always -1, so I've set it up as a static variable
		foilStep_L = this.complexNum1.getImaginaryNum() * this.complexNum2.getImaginaryNum() * iSquared;
		
		complexNumResultOfMultiply.setRealNum(foilStep_F+foilStep_L);
		complexNumResultOfMultiply.setImaginaryNum(foilStep_O+foilStep_I);
		
		return complexNumResultOfMultiply;
		}
	
	
	/**
	 * complexNum1 (numerator) divided by ComplexNum2 (denominator)
	 * 
	 */
	public ComplexNum divide(){
		
		//Step 1 Determine conjugate of denominator (ComplexNum2)
		
		this.complexNumConjugateOfDenominator.setRealNum(complexNum2.getRealNum());
		
		//Multiplying by -1 always flips the sign
		this.complexNumConjugateOfDenominator.setImaginaryNum(complexNum2.getImaginaryNum() * -1);
		
		//Step 2 Multiply numerator and denominator of division problem by complex conjugate of the denominator
		BasicMathDoer numeratorAndComplexConjugate = new BasicMathDoer(this.complexNum1, this.complexNumConjugateOfDenominator);
		
		complexNumNumerator = numeratorAndComplexConjugate.multiply();
		
		BasicMathDoer denominatorAndComplexConjugate = new BasicMathDoer(this.complexNum2, this.complexNumConjugateOfDenominator);
		complexNumDenominator = denominatorAndComplexConjugate.multiply();
		
		//Step 3 Divide real of of numerator over real of denominator
		complexNumResultOfDivision.setRealNum(complexNumNumerator.getRealNum() / complexNumDenominator.getRealNum());
		
		//Step 4 Divide imaginary of numerator over real of denominator
		complexNumResultOfDivision.setImaginaryNum(complexNumNumerator.getImaginaryNum() / complexNumDenominator.getRealNum());
		
		return complexNumResultOfDivision;
	}
}
