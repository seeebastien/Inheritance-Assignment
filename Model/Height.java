package Model;

public class Height {

    private int feet;
    private int inches;

    public Height(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    int getFeet() {
        return this.feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    int getInches() {
        return this.inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    @Override
    public String toString() {
        return "\"" + feet + "'" + inches + "\"";
    }
}
