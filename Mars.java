import java.util.Scanner;

class Mars {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("What is your name?");

    String name = input.nextLine();  // Get user input
    System.out.println("Nice," + name + "!");

    // Scanner input = new Scanner(System.in);
    System.out.println("What color will your spacesuit be?");

    String color = input.nextLine();  // Get user input
    System.out.println("A" + color + "spacesuit will be pretty cool!");

    // Scanner input = new Scanner(System.in);
    System.out.println("What is your pet's name?");

    String pet = input.nextLine();  // Get user input
    System.out.println("Wow, " + pet + " is such a cute name.");

    // Scanner input = new Scanner(System.in);
    System.out.println("Scared of heights?");

    String height = input.nextLine();  // Get user input
    System.out.println(+ height + ", no judgment either way" );
  }
}