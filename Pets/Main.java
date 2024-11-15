package Pets;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Pet pet;

    static String[] colors = { // array
            "\u001B[33m\u001B[1m", // YELLOW (bold)[0]
            "\u001B[31m", // RED[1]
            "\u001B[32m", // GREEN[2]
            "\u001B[33m", // YELLOW[3]
            "\u001B[34m", // BLUE[4]
            "\u001B[35m", // MAGENTA[5]
            "\u001B[36m", // CYAN[6]
            "\u001B[37m", // WHITE[7]
            "\u001B[0m" // RESET[8]
    };

    public static void main(String[] args) {
        // intro og welcome message sa user
        System.out.println(colors[0] + "\t\t Welcome to Pet Simulator!" + colors[8]);
        System.out
                .println(colors[6] + "------------------------------------------------------------------" + colors[8]);

        // pangalan sa pet's
        System.out.print("Enter your pet's name: ");
        String name = scanner.nextLine();

        // Pilianan sa user
        System.out.print("Choose a pet type: ([1]Dog, [2]Cat, [3]Bird): ");
        int choice = scanner.nextInt();

        // Paggamit sa enum para makuha ang pet type nga gipili sa user
        PetType petType = PetType.values()[choice - 1]; // Pagkuha sa enum value base sa input

        // Use the PetFactory to create the pet instance
        pet = PetFactory.createPet(petType, name);

        // Interaction sa pet (while loop hangtud mag-exit ang user)
        while (true) {
            System.out.println(
                    colors[6] + "------------------------------------------------------------------" + colors[8]);
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Feed your pet " + pet.name);
            System.out.println("2. Play with your pet " + pet.name);
            System.out.println("3. Make your pet sound");
            System.out.println("4. Special action for " + pet.getName());
            System.out.println("5. Check pet status of " + pet.name);
            System.out.println("6. Save pet");
            System.out.println("7. Load pet");
            System.out.println("8. Exit");
            System.out.println(
                    colors[6] + "------------------------------------------------------------------" + colors[8]);
            System.out.print("Choose: ");
            int action = scanner.nextInt(); // Pagkuha sa action nga gusto buhaton sa user

            // Pagbuhat sa action depende sa gipili nga option
            switch (action) {
                case 1:
                    pet.feed(); // Pag-pakaon sa pet
                    break;
                case 2:
                    pet.play(); // Pagdula sa pet
                    break;
                case 3:
                    pet.makeSound(); // tingog sa pet (Woof, Meow, etc.)
                    break;
                case 4:
                    // Kung Dog, mag-fetch
                    if (pet instanceof Dog)
                        ((Dog) pet).fetch();
                    // Kung Cat, mag-scratch
                    else if (pet instanceof Cat)
                        ((Cat) pet).scratch();
                    // Kung Bird, mo lupad
                    else if (pet instanceof Bird)
                        ((Bird) pet).fly();
                    break;
                case 5:
                    System.out.println("Pet Status: " + pet.getName() + " Happiness: " + pet.getHappiness()
                            + " Energy: " + pet.getEnergy());
                    break;
                case 6:
                    SaveManager.savePet(pet);
                    break;
                case 7:
                    pet = SaveManager.loadPet();
                    break;
                case 8:
                    System.out.println(colors[3] + "Exiting... Goodbye!" + colors[8]);
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
