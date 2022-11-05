package week1.day1;

public class TwoWheeler {

	
	int noOfWheels =2;
	short noOfMirrors = 2;
	long chassisNumber = 1234567891011L;
	boolean isPunctured=false;
	String bikeName ="Honda Shine";
	double runningKM = 3750000.158;
	public static void main(String[] args) {
		
	  TwoWheeler mybike = new TwoWheeler();
	  System.out.println("noOfWheels ="+ mybike.noOfWheels);
      System.out.println("noOfMirrors ="+mybike.noOfMirrors);
      System.out.println("chassisNumber ="+mybike.chassisNumber);
      System.out.println("isPunctured ="+mybike.isPunctured);
      System.out.println("bikeName ="+ mybike.bikeName);
      System.out.println("runningKM ="+ mybike.runningKM);
	}

}
