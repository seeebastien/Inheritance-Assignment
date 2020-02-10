package Model;

public class FootballPlayer extends Person {

    private int number;
    private String position;

    FootballPlayer(String name, Height height, int weight, String hometown, String highSchool, int number, String position) {
        super(name, height, weight, hometown, highSchool);
        this.number = number;
        this.position = position;
    }

    /**
     * @return FootballPlayer's number in Integer
     */

    public int getNumber() {
        return number;
    }

    /**
     * Set a new number for FootballPlayer object
     *
     * @param number In Integer
     */

    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return Position of player in String
     */

    public String getPosition() {
        return position;
    }

    /**
     * Set a new position for FootballPlayer object
     *
     * @param position In String
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @return Formatted description including parent method
     */
    @Override
    public String toString() {
        return super.toString() + "\nPosition: " + getPosition() + " Number: " + getNumber();
    }
}
