package p1;

public class Yaris {
	
	public String Manufactured = "Japan";

	public String Corporation = "Toyota Motor";

	static int ModelYear = 2015;

	static String Color = "White";

	private double EngineSize = 1.5;

	public int Weight = 1500;

	public String Type = "Sedan";

// Object 1
	public Yaris(String Manufactured, String newCorporation, String Color, String newType) {
		
	}
// Object 2
	public Yaris(int newModelYear, double newEngineSize, int Weight) {
		
	}

// Return Manufactured
	public String getManufactured() {
		return Manufactured;
	}
// Set new Corporation
	public void setCorporation(String newCorporation) {
		Corporation = newCorporation;
	}
// Set new Model Year
    void setModelYear(int newModelYear) {
    	ModelYear = newModelYear;
    }
// Return color
    String getColor() {
		return Color;
    }
// Set new Engine Size
    private void setEngineSize(double newEngineSize) {
    	EngineSize = newEngineSize;
    }
// Return Weight
    public int getWeight() {
    	return Weight;
    }
// Set new Type
    public void setType(String newType) {
    	Type = newType; 
    }
}
