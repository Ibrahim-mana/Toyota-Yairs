package p1;

public class Yaris2 {
         
	public static void main(String[] args) {
		
// Print Manufactured
	Yaris Manufactured = new Yaris("Japan", "Toyota Motor", "White", "Sedan");
	System.out.println("Made in " + Manufactured.getManufactured());
	
// Print Corporation
	Yaris Corporation = new Yaris("Japan", "Toyota Motor", "White", "Sedan");
	Corporation.setCorporation("Toyota Motor");
	System.out.println("Yaris is from " + Corporation.Corporation + " Corporation");
	
// Print Color
	Yaris Color = new Yaris("Japan", "Toyota Motor", "White", "Sedan");
	System.out.println("Yaris color is " + Color.getColor());
	
// Print Type
	Yaris Type = new Yaris("Japan", "Toyota Motor", "White", "Sedan");
	Type.setType("Sedan");
	System.out.println(Type.Type + " Type");
	
// Print Model Year
	Yaris ModelYear = new Yaris(2015, 1.5, 1500);
	ModelYear.setModelYear(2015);
	System.out.println("Model Year: " + Yaris.ModelYear);
	
// Print Weight 
	Yaris Weight = new Yaris(2015, 1.5, 1500);
	System.out.println("Weight: " + Weight.getWeight() + " Kg");
	}

}