import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class toListSetMap {
    public static void run(){
        List<String> teams = new ArrayList<>();

        teams.add("Poland");
        teams.add("Slovakia");
        teams.add("Spain");
        teams.add("Sweden");

        Collection<String> teamsStartingWithS = teams.stream()
                .filter(team -> team.startsWith("S"))
                .collect(Collectors.toList());
        System.out.println(teamsStartingWithS);
    }
}
