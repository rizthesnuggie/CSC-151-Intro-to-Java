/*Create a class named Game. Include two Team fields that hold data about the teams participating in the game. Also include a field for game time (for example, 7 PM). Include a constructor that takes parameters for two Team objects and a time. Include get methods for each field that return their respective values. 
*/

public class Game {
    private Team team1;
    private Team team2;
    private String gameTime;
    public Game(Team t1, Team t2, String time) {
        team1 = t1;
        team2 = t2;
        gameTime = time;
    }
    public Team getTeam1() {
        return team1;
    }
    public Team getTeam2() {
        return team2;
    }
    public String getTime() {
        return gameTime;
    }
}
