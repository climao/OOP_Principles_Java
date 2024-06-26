/**
 * A class to test the Person class.
 * All java code must reside inside a class, as a method.
 *
 * @author Carlos Limão.
 * @version April 12 2024
 */
package classesAndObjects;

public class TestPerson {
    /**
     * This is the entry point, in a Java program.
     */
    public static void main(String [] args) {
        // Create a new Person object (also refered as "instance").
        // The new operator creates a new object in a special memory area (the heap).
        // p resides in the stack and holds is a reference to the object (not the object itself).
        Person p = new Person();

        // Change the new object state using the available (exposed) behaviour.
        // We use the "dot" operator to access methods and properties of the object.
        p.setPerson("Jack", 20);

        // Use another of the Person "behaviours".
        p.sayName();

        // Since the object properties are public, we can access them here
        System.out.println("This person is: " + p.name + " (" + p.age + ")");
    }
}
