/**
 * File name: Person.java
 * Short description: Person data class
 * IST 242
 * Assignment: L02 Assignment-Inheritance
 *
 * @author Sebastien Louis
 * @version 2/9/2020
 */


package Model;

public class Person {

    private String name;
    private Height height;
    private int weight;
    private String hometown;
    private String highSchool;

    Person(String name, Height height, int weight, String hometown, String highSchool) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hometown = hometown;
        this.highSchool = highSchool;
    }

    /**
     * @return Name of the person
     */
    public String getName() {
        return name;
    }

    /**
     * Set a new name for person
     *
     * @param name In String
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Height object for person
     */

    public Height getHeight() {
        return height;
    }

    /**
     * Sets a new height object
     *
     * @param height Height object
     */

    public void setHeight(Height height) {
        this.height = height;
    }

    /**
     * @return Weight of person in Integer
     */

    public int getWeight() {
        return weight;
    }

    /**
     * Sets new weight for person in Integer
     *
     * @param weight In Integer
     */

    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return Hometown in String
     */

    public String getHometown() {
        return hometown;
    }

    /**
     * Sets hometown for person
     *
     * @param hometown In String
     */

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    /**
     * @return High school in String
     */

    public String getHighSchool() {
        return highSchool;
    }

    /**
     * Sets a new high school
     *
     * @param highSchool In String
     */

    public void setHighSchool(String highSchool) {
        this.highSchool = highSchool;
    }

    /**
     *
     * @return Description of a person in String
     */

    @Override
    public String toString() {
        return "Name: " + getName() + " Height: " + getHeight().toString() + " Weight: " + getWeight() + "\n" +
                "Hometown: " + getHometown() + " High School: " + getHighSchool();
    }
}
