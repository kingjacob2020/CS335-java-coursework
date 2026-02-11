package shapes;

/**
 * this performs calculations on an isosceles triangle
 * it calculates the area and circumference
 * 
 * @author Jacob Bocotan
 * @date 11 Feb 2026
 */

public class Iso_Angled_Triangle {
	
	/**
	 * Calculates the area of an iso triangle
	 * @param base base of triangle
	 * @param height height of triangle
	 * @return area of triangle
	 * @author Jacob Bocotan
	 * @date 11 Feb 2026
	 */

	public static double area(double base, double height) {	
		return(base * height) / 2;
	}
	
	/**
	 * Calculates the circumference of an iso triangle
	 * 
	 * @param base base of triangle
	 * @param side equal side length
	 * @return circumference of triangle
	 * @author Jacob Bocotan
	 * @date 11 Feb 2026
	 */
	
	public static double circumference(double base, double side) {
		return base + (2 * side);
	}
	
	/**
	 * Main method to test calculations 
	 * @param args command line arguments
	 * @author Jacob Bocotan
	 * @date 11 Feb 2026
	 */
	
	public static void main(String[] args) {
		double base = 6;
		double height = 4;
		double side = 5;
		
		System.out.println("Area: " +area(base, height));
		System.out.println("Circumference: " + circumference(base, side));
	}

}
