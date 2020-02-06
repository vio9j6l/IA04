/*
 * Course: IST 311
 * Semester: Spring 2020
 * Instructor: Phil O'Connell (pxo4)
 * Student: JiaJia liu
 * Email: jpl5840@psu.edu
 * Assignment: IA04
 */

public class Person
{
  // Name of the person
  private String name;
  // Age of the person
  private int age;

  // Return the String representation of the person
  @Override
  public String toString() {
    String returnValue;
    returnValue = name + " (" + age + ")";
    return returnValue;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
