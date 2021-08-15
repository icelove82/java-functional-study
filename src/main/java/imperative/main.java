package imperative;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("John", Gender.MALE));
        people.add(new Person("Maria", Gender.FEMALE));
        people.add(new Person("Aisha", Gender.FEMALE));
        people.add(new Person("Alex", Gender.MALE));
        people.add(new Person("Alice", Gender.FEMALE));

        // Functional
        people.stream()
                .filter(person -> Gender.FEMALE.equals(person.gender))
                .map(person -> person.name)
                .forEach(System.out::println);
    }
    
    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
