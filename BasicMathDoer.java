
public class BasicMathDoer {
	
	private ComplexNum complexNum1 = new ComplexNum();
	private ComplexNum complexNum2 = new ComplexNum();
	private ComplexNum complexNumResultOfSubtraction = new ComplexNum();
	private ComplexNum complexNumResultOfAddition = new ComplexNum();
	

	
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
}
