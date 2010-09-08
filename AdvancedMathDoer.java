


public class AdvancedMathDoer {

	
	private ComplexNum complexNum = new ComplexNum();
	private ComplexNum complexNumOriginalFromUser = new ComplexNum();
	private ComplexNum complexNum1 = new ComplexNum();
	private ComplexNum complexNum2 = new ComplexNum();
	private ComplexNum complexNumCurrentMultiplicationProduct = new ComplexNum();
	private int toTheNthPower = 0;
	private boolean firstTimeThrough = true;
	private ComplexNum complexNumResultOfInvert = new ComplexNum();
	private ComplexNum numeratorInInversion = new ComplexNum();
	private ComplexNum denominatorInInversion = new ComplexNum();
	private ComplexNum complexNumResultOfGotoTheNthPower = new ComplexNum();
	
	public AdvancedMathDoer(ComplexNum complexNum){
		this.complexNum = complexNum;
	}
	
	public AdvancedMathDoer(){

	}
	
	
	public ComplexNum invert(){
		// Step 1 Setup the numerator in the problem. It will always be 1 so we create a complex number that is equal to 1 (ie no imaginary number part with a real part of 1)
		this.numeratorInInversion.setImaginaryNum(0);
		this.numeratorInInversion.setRealNum(1);
		
		//Step 2 Setup the denominator as the complex number that was passed in by user
		this.denominatorInInversion = this.complexNum;
		
		//Step 3 Create basicmathdoer and call divide method and pass in numerator and denominator
		BasicMathDoer basicMathDoer = new BasicMathDoer(this.numeratorInInversion, this.denominatorInInversion);
		complexNumResultOfInvert = basicMathDoer.divide();
		
		return complexNumResultOfInvert;
		
	}
	
	public ComplexNum gotoTheNthPower(ComplexNum complexNum1, ComplexNum complexNum2, int toTheNthPower){
		this.complexNum1 = complexNum1;
		this.complexNum2 = complexNum2;
		this.toTheNthPower = toTheNthPower;
		
		if(firstTimeThrough){
			this.complexNumOriginalFromUser = this.complexNum1;
			if (this.toTheNthPower == 0){
				complexNumResultOfGotoTheNthPower.setImaginaryNum(0);
				complexNumResultOfGotoTheNthPower.setRealNum(1);
				return complexNumResultOfGotoTheNthPower;
				
				
			}
			else if(this.toTheNthPower < 0){
				//Tell the user to try again
				System.out.println("Exponent can't be less than 0");
			}
			else if (this.toTheNthPower ==1){
				complexNumResultOfGotoTheNthPower = this.complexNum1;
				return complexNumResultOfGotoTheNthPower;
			}
			
			
		}
		
		BasicMathDoer basicMathDoer = new BasicMathDoer(this.complexNum1, this.complexNum2);
		complexNumCurrentMultiplicationProduct = basicMathDoer.multiply();
		this.toTheNthPower -= 1;
		if (this.toTheNthPower == 1){
			return complexNumCurrentMultiplicationProduct;
			
		}
		
		else {
			firstTimeThrough = false;
			gotoTheNthPower(complexNumCurrentMultiplicationProduct, this.complexNumOriginalFromUser, this.toTheNthPower);
			return complexNumCurrentMultiplicationProduct;

		}

		
		
	}
	
	
}
