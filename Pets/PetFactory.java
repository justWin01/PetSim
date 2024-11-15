package Pets;

enum PetType {
    DOG, CAT, BIRD
}

public class PetFactory {
    // Factory method to create pets
    public static Pet createPet(PetType petType, String name) {
        switch (petType) {
            case DOG:
                return new Dog(name);
            case CAT:
                return new Cat(name);
            case BIRD:
                return new Bird(name);
            default:
                return new Dog(name); // Default case if anything goes wrong
        }
    }
}
