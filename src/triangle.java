/**
 * Created by John Syfacunda on 9/15/2016.
 */
public class triangle {
    //variables
    private double sideA;
    private double sideB;
    private double sideC;

    //constructor
    public triangle (double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    // checks if sides make a triangle
    public boolean isTriangle() {
        if ((this.sideA > 0 && this.sideB > 0 && this.sideC > 0) && (this.sideA + this.sideB >= this.sideC) &&
                (this.sideA + this.sideC >= this.sideB) && (this.sideB + this.sideC >= this.sideA)) {
            return true;
        }
        else
            return false;
    }
    //checks if triangle is euilateral
    public boolean isEquilateral() {
        return ((this.sideA == this.sideB) && (this.sideB == this.sideC));
    }
    //checks if triangle is scalene
    public boolean isScalene() {
        return ((this.sideA != this.sideB) && (this.sideA != this.sideC)
        && (this.sideB != this.sideC));
    }
    //checks if triangle is isosceles
    public boolean isIsosceles() {
        return ((this.sideA == this.sideB) || (this.sideA == this.sideC)
        || (this.sideB == this.sideC));
    }
}