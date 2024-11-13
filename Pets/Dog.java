package Pets;
// Dog.java

public class Dog extends Pet {

    // Constructor para sa Dog, mopasa sa panagalan sa pet sa superclass (Pet)
    public Dog(String name) {
        super(name); // Tawagon ang constructor sa superclass (Pet) para i-assign ang name
    }

    public void makeSound() {
        System.out.println("------------------------------------------------------------------");
        System.out.println(name + " says: Woof woof!"); // Ang Dog mo tingog og "Woof woof!"
        System.out.println("------------------------------------------------------------------");
    }

    // Method para sa fetch action, ang Dog magdula og fetch
    public void fetch() {
        // Kung naa pa'y igo nga energy (10), makapadayon pa sa fetch
        if (energy >= 10) {
            happiness = Math.min(happiness + 10, 100); // Mag-increase ang happiness (pero dili molapas sa 100)
            energy -= 10; // Kuhaan og 10 energy ang dog
            System.out.println("------------------------------------------------------------------");
            System.out.println(name + " played fetch. Happiness: " + happiness + ", Energy: " + energy);
            System.out.println("------------------------------------------------------------------");
        } else {
            // Kung kulang na ang energy (less than 10), dili na siya makafetch
            System.out.println("------------------------------------------------------------------");
            System.out.println(name + " is too tired to fetch."); // Dog is too tired to fetch
            System.out.println("------------------------------------------------------------------");
        }
    }
}
