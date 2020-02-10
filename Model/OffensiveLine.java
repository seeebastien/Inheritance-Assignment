package Model;

public class OffensiveLine {

    private FootballPlayer center;
    private FootballPlayer offensiveGuard;
    private FootballPlayer offensiveTackle;


    public OffensiveLine() {
        Height heightOne = new Height(6,6);
        Height heightTwo = new Height(6,4);
        Height heightThree = new Height(6,6);

        center = new FootballPlayer("Sebastien", heightOne, 350, "Philly",
                "Carroll", 65, "center");
        offensiveGuard = new FootballPlayer("Sebas", heightTwo, 340, "Philly",
                "Carroll", 67, "guard");
        offensiveTackle = new FootballPlayer("Louis", heightThree, 347, "Philly",
                "Carroll", 64, "tackle");
    }

    public int averageHeight() {
        int average;

        average = center.getHeight().getFeet() * 12 + center.getHeight().getInches() + (offensiveGuard.getHeight().getFeet()
                * 12 + offensiveGuard.getHeight().getInches()) + (offensiveTackle.getHeight().getFeet()
                * 12 + offensiveTackle.getHeight().getInches());

        return average;
    }

    @Override
    public String toString() {
        return center.toString() + "\n" + offensiveGuard.toString() + "\n" + offensiveTackle.toString();
    }
}
