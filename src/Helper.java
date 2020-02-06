import java.util.Scanner;

public class Helper
{

  private static final Scanner keyboard = new Scanner(System.in);

  public int inputAge() {
    int age = 0;
    boolean validAge = false;

    do {
      // Prompt for the age
      System.out.print("Enter age: ");

      // The line of data entered by the user
      String lineEntered;
      lineEntered = keyboard.nextLine();

      try {
        // Convert string input to an integer
        age = Integer.parseInt(lineEntered);
      } catch (Exception e) {
        System.out.println("Invalid input");
        age = -1; // Will result in an invalid age
      }
      validAge = (age >= 0);
      if (!validAge) {
        System.out.println("ERROR: age must be 0 or higher");
      }
    } while (!validAge);

    return age;
  }

  public String inputName() {
    String name = "";
    boolean validName = false;
    do {
      // Prompt for the name
      System.out.print("Enter name: ");
      // Read the name from the keyboard
      name = keyboard.nextLine();
      validName = (name.length() > 0);
      if (!validName) {
        System.out.println("ERROR:  Please enter a name");
      }
    } while (!validName);

    return name;
  }

  public String inputYN() {
    String answer = "";
    boolean validAnswer = false;

    do {
      // Prompt the user to continue
      System.out.print("Another (Y/N) :");
      // Read the answer from the keyboard
      answer = keyboard.nextLine();
      validAnswer = answer.equals("Y") || answer.equals("N");
      if (!validAnswer) {
        System.out.println("ERROR:  Enter Y or N");
      }
    } while (!validAnswer);

    return answer;
  }

}