package Pets;
// Cat.java

public class Cat extends Pet {

    // Constructor para sa Cat, mopasa sa panagalan sa pet sa superclass (Pet)
    public Cat(String name) {
        super(name); // Tawagon ang constructor sa superclass (Pet) para i-assign ang name
    }

    public void makeSound() {
        System.out.println("------------------------------------------------------------------");
        System.out.println(name + " says: Meow meow!"); // Ang Cat mo tingog og"Meow meow!"
        System.out.println("------------------------------------------------------------------");
    }

    // Method para sa scratch action, ang Cat mag-scratch
    public void scratch() {
        // Ang scratch action magtaas sa happiness (pero dili molapas sa 100)
        System.out.println("------------------------------------------------------------------");
        happiness = Math.min(happiness + 5, 100); // Magtaas ang happiness by 5, pero dili molapas sa 100
        System.out.println(name + " scratched. Happiness: " + happiness);
        System.out.println("------------------------------------------------------------------");
    }
}
