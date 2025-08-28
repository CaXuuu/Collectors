import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {
    public static void run(){
        List<Person> people = new ArrayList<>();

        people.add(new Person("Kamil", 33 , 175));
        people.add(new Person("Mariusz", 21 , 180));
        people.add(new Person("Dominik", 37 , 163));

        Map<Integer, List<Person>> collect = people.stream()
                .collect(Collectors.groupingBy(Person::getAge));
        System.out.println(collect);
    }
    public static void main(String[] args) {
        Grouping.run();
    }
}
