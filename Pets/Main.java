package Pets;

import java.util.Scanner;

// Enum para e present ang  klasing-klaseng sa hayop
enum PetType {
    DOG, CAT, BIRD
}

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Pet pet;

    public static void main(String[] args) {
        // intro og welcome message sa user
        System.out.println("\t\t Welcome to Pet Simulator!");
        System.out.println("------------------------------------------------------------------");

        // Pangayog pangalan sa pet's
        System.out.print("Enter your pet's name: ");
        String name = scanner.nextLine();

        // pilianan sa user
        System.out.print("Choose a pet type: ([1]Dog, [2]Cat, [3]Bird): ");
        int choice = scanner.nextInt();

        // Paggamit sa enum para makuha ang pet type nga gipili sa user
        PetType petType = PetType.values()[choice - 1]; // Pagkuha sa enum value base sa input

        switch (petType) { // Pagbuhat sa husto nga Pet object depende sa gipiling pet type
            case DOG:
                pet = new Dog(name); // Kung Dog ang gipili, buhaton ang Dog object
                break;
            case CAT:
                pet = new Cat(name); // Kung Cat ang gipili, buhaton ang Cat object
                break;
            case BIRD:
                pet = new Bird(name); // Kung Bird ang gipili, buhaton ang Bird object
                break;
            default:
                pet = new Dog(name); // Kung wala masabti ang input, buhaton lang og Dog (default case)
        }

        // Interaction sa pet (while loop hangtud mag-exit ang user)
        while (true) {
            System.out.println("------------------------------------------------------------------");
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Feed your pet");
            System.out.println("2. Play with your pet");
            System.out.println("3. Make your pet sound");
            System.out.println("4. Special action for " + pet.getName());
            System.out.println("5. Check pet status");
            System.out.println("6. Save pet");
            System.out.println("7. Load pet");
            System.out.println("8. Exit");
            System.out.println("------------------------------------------------------------------");
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
                    System.out.println("Exiting... Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
