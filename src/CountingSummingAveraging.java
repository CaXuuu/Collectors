import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.*;

public class CountingSummingAveraging {
    public static void run(){

        List<Person> people = new ArrayList<>();

        people.add(new Person("Kamil", 33 , 175));
        people.add(new Person("Mariusz", 21 , 180));
        people.add(new Person("Dominik", 37 , 163));

        Long collect = people.stream()
                .collect(counting()); //inaczej Collectors.counting
        System.out.println(collect);

        Integer collect1 = people.stream()
                .collect(summingInt(Person::getAge));
        System.out.println(collect1);

        Double collect2 = people.stream()
                .collect(Collectors.summingDouble(Person::getHeight));
        System.out.println(collect2);

    }
    public static void main(String[] args) {
        CountingSummingAveraging.run();
    }
}
