/**
 * Created by Ares on 9/15/2016.
 */
public class triangle {

    private double sideA;
    private double sideB;
    private double sideC;

    public triangle (double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public boolean isTriangle() {
        if ((this.sideA > 0 && this.sideB > 0 && this.sideC > 0) && (this.sideA + this.sideB >= this.sideC) &&
                (this.sideA + this.sideC >= this.sideB) && (this.sideB + this.sideC >= this.sideA)) {
            return true;
        }
        else
            return false;
    }

    public boolean isEquilateral() {
        return ((this.sideA == this.sideB) && (this.sideB == this.sideC));
    }

    public boolean isScalene() {
        return ((this.sideA != this.sideB) && (this.sideA != this.sideC)
        && (this.sideB != this.sideC));
    }

    public boolean isIsosceles() {
        return ((this.sideA == this.sideB) || (this.sideA == this.sideC)
        || (this.sideB == this.sideC));
    }
}
