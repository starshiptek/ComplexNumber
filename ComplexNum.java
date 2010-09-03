
public class ComplexNum{
	private double realNum;
	private double imaginaryNum;

	
	
	
	public double getRealNum() {
		return realNum;
	}
	public void setRealNum(double realNum) {
		this.realNum = realNum;
	}
	public double getImaginaryNum() {
		return imaginaryNum;
	}
	public void setImaginaryNum(double imaginaryNum) {
		this.imaginaryNum = imaginaryNum;
	}

	
	public void printThis(){
		System.out.println("Complex number: " + realNum + " " + imaginaryNum + "i");
	}
	

}
