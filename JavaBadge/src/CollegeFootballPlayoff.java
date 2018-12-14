import java.util.ArrayList;
import java.util.HashMap;

//This program will create an array of all th teams participating in the college
//football playoffs
public class CollegeFootballPlayoff {
    public static void main(String[] args){
        //Create the arraylist
        ArrayList<String> playoffTeams = new ArrayList<String>();
        //Add teams to the array
        playoffTeams.add("University of Oklahoma");
        playoffTeams.add("University of Alabama");
        playoffTeams.add("Clemson University");
        playoffTeams.add("Notre Dame University");
        //print the arraylist
        System.out.println("The college football playoff consists of " + playoffTeams.size() + " " +
                "teams. Those teams are: ");

        for (String team: playoffTeams){
            System.out.println(team);
        }
        //create a new hash map for the scheduled games
        HashMap<String,String> scheduledGames = new HashMap<String, String>();
        scheduledGames.put("Oklahoma and Alabama", "December 29");
        scheduledGames.put("Clemson and Notre Dame", "December 29");
        //loop through all scheduled games and print out who plays and when
        for(String game: scheduledGames.keySet()){
            System.out.println(game + " will play " + scheduledGames.get(game));
        }
    }

}
