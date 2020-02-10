package Model;

public class FootballPlayer extends Person {

    private int number;
    private String position;

    public FootballPlayer(String name, Height height, int weight, String hometown, String highSchool, int number, String position) {
        super(name, height, weight, hometown, highSchool);
        this.number = number;
        this.position = position;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPosition: " + position + " Number: " + number;
    }
}
