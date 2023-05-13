package Animals;
import java.util.Scanner;
import java.util.ArrayList;

public class Animals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();

        Animal dog1 = new Animal("Sparky", true);
        Animal cat1 = new Animal("Fuzz Ball");
        Animal dog2 = new Animal("Ginger", true);

        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop \n");

        System.out.println(dog1);
        System.out.println(cat1);
        System.out.println(dog2);

        while (true) {
            System.out.print("Enter your animals name: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.print("Is it a dog? (true/false): ");
            boolean isDog = scanner.nextBoolean();
            scanner.nextLine();

            animals.add(new Animal(name, isDog));
        }

        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }
}
