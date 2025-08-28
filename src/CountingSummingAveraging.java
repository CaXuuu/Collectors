import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
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
                .collect(Collectors.averagingDouble(Person::getHeight));
        System.out.println(collect2);

        Optional<Integer> collect3 = people.stream()
                .map(Person::getAge)
                .collect(maxBy(Comparator.naturalOrder()));
        System.out.println(collect3.get());

        Optional<Integer> collect4 = people.stream()
                .map(Person::getAge)
                .collect(minBy(Comparator.naturalOrder()));
        System.out.println(collect4.get());

    }
    public static void main(String[] args) {
        CountingSummingAveraging.run();
    }
}
