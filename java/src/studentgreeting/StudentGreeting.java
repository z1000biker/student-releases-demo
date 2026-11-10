
package studentgreeting;

import java.util.Scanner;
public class StudentGreeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Student Greeting v1.0.0");
        System.out.print("Pws se lene; ");
        String name = input.nextLine();
        System.out.println("Geia sou, " + name + "!");
    }
}
