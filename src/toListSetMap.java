import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class toListSetMap {
    public static void run(){
        List<String> teams = new ArrayList<>();

        teams.add("Poland");
        teams.add("Slovakia");
        teams.add("Spain");
        teams.add("Sweden");
        teams.add("Sweden");

        Collection<String> teamsStartingWithS = teams.stream()
                .filter(team -> team.startsWith("S"))
                .collect(toList());
        System.out.println(teamsStartingWithS);



        Set<String> setOfTeamsStartingWithS = teams.stream()
                .filter(team -> team.startsWith("S"))
                .collect(toSet()); // nie pojawiaja sie te same druzyny
        System.out.println(setOfTeamsStartingWithS);
    }
    public static void main(String[] args) {

        toListSetMap.run();

    }
}
