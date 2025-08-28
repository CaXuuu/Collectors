import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Summarazing {
public static void run(){
    List<Person> people = new ArrayList<>();

    people.add(new Person("Kamil", 33 , 175));
    people.add(new Person("Mariusz", 21 , 180));
    people.add(new Person("Dominik", 37 , 163));

    IntSummaryStatistics collect = people.stream()
            .collect(Collectors.summarizingInt(Person::getAge));
    System.out.println(collect.getMax());
    System.out.println(collect.getMin());
    System.out.println(collect.getAverage());
    System.out.println(collect.getCount());
    System.out.println(collect.getSum());

}

    public static void main(String[] args) {
        Summarazing.run();
    }
}
