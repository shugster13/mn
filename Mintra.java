import java.util.List;
import java.util.stream.Collectors;


public class Mintra {

  /**
   * Given a list of persons with a name and an age, print out the names of the persons who are between 18 and 50. Write the code in a way that you can write unit tests for it.

    Which tests would you write to test your code?
    Could you change the code, so it will be easier to write unit tests for it?
   */
	public static void main(String[] args) {
    List<Person> people = List.of(new Person(17, "John"),
    new Person(18, "Sam"), new Person(45, "Don"), new Person(50, "Morag"),
    new Person(51, "Dawn"));
    List<String> results = Mintra.filter(people, 18, 50);

    results.forEach(rs -> System.out.println(rs));
  }

  public static List<String> filter(List<Person> people, Integer minAge, Integer maxAge) {
     return people.stream().filter((person) -> {
        return person.getAge() >= minAge && person.getAge() <= maxAge;
    }).map(Person::getName).collect(Collectors.toList());
  }
}
