package week1.day1;

public class Mobile {
	
	
	String mobileBrandName = "OnePlus";
	char mobileLogo = '1';
	short noOfMobilePiece=3;
	int modelNumber=12;
	long mobileImeiNumber =69845215646464L;
	float mobilePrice = 35000.00f;
	boolean isDamaged =false;
	
	

	public static void main(String[] args) {
		Mobile mobile1=new Mobile();
		System.out.println("MobileBrandName =" + mobile1.mobileBrandName);
		System.out.println("MobileLogo ="+ mobile1.mobileLogo);
		System.out.println("noOfMobilePiece ="+mobile1.noOfMobilePiece);
		System.out.println("ModelNumber ="+mobile1.modelNumber);
		System.out.println("IME ="+mobile1.mobileImeiNumber);
		System.out.println("MobilePrice =" + mobile1.mobilePrice);
		System.out.println("Damaged ="+mobile1.isDamaged);

	}
	

}
