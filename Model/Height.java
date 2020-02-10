/**
 * File name: Height.java
 * Short description: Height data class
 * IST 242
 * Assignment: L02 Assignment-Inheritance
 *
 * @author Sebastien Louis
 * @version 2/9/2020
 */


package Model;

public class Height {

    private int feet;
    private int inches;

    Height(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    /**
     * @return Feet in Integer
     */

    int getFeet() {
        return this.feet;
    }

    /**
     * Set feet for Height object
     *
     * @param feet In Integer
     */

    public void setFeet(int feet) {
        this.feet = feet;
    }

    /**
     * @return Inches in Integer
     */

    int getInches() {
        return this.inches;
    }

    /**
     * Set inches for Height object
     *
     * @param inches In Integer
     */

    public void setInches(int inches) {
        this.inches = inches;
    }

    /**
     * @return Formatted Height in String
     */

    @Override
    public String toString() {
        return "\"" + getFeet() + "'" + getInches() + "\"";
    }
}
