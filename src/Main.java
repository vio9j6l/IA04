import java.util.ArrayList;
import java.util.List;

public class Main
{

  public static void main(String[] args) {
    Helper helper = new Helper();
    List<Person> people = new ArrayList<>();

    do {
      // Reference variable pointing to an instance of the Person class
      Person person = new Person();
      // Store the Person object in the list
      people.add(person);

      // Store the data in the object
      person.setName(helper.inputName());
      person.setAge(helper.inputAge());
      System.out.println(); // blank line

    } while (helper.inputYN().equals("Y"));
    // Keep reading in people as long as the user answers "Y"

    System.out.println(); // blank line

    System.out.println("You entered " + people.size() + " names:");
    for (Person onePerson : people) {
      System.out.println(onePerson);
    }

  }
}
