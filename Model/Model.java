package Model;

public class Model {

    public Model() {
        OffensiveLine offensiveLine = new OffensiveLine();

        System.out.println(offensiveLine.toString());
        System.out.println("Average height for offensive line is: " + offensiveLine.averageHeight());

        Height heightOne = new Height(6,5);
        Height heightTwo = new Height(6,1);
        Height heightThree = new Height(5,11);

        FootballPlayer playerOne = new FootballPlayer("Bob", heightOne, 220, "Philly",
                "Carroll", 8, "Wide Receiver");
        FootballPlayer playerTwo = new FootballPlayer("Steve", heightTwo, 190, "Baltimore",
                "Carroll", 25, "Kick Returner");
        FootballPlayer playerThree = new FootballPlayer("Mike", heightThree, 180, "Miami",
                "Carroll", 30, "Corner");

        System.out.println(playerOne.toString() + "\n" + playerTwo.toString() + "\n" + playerThree.toString());
    }
}
