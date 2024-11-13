package Pets;

public class Bird extends Pet {

    // Constructor para sa Bird, mopasa sa panagalan sa pet sa superclass (Pet)
    public Bird(String name) {
        super(name); // Tawagon ang constructor sa superclass (Pet) para i-assign ang name
    }

    public void makeSound() {
        System.out.println("------------------------------------------------------------------");
        System.out.println(name + " says: twit-twit!"); // Ang Bird motingog og "twit-twit!"
        System.out.println("------------------------------------------------------------------");
    }

    // Method para sa fly action, ang Bird na molupad
    public void fly() {
        // Kung naa pa'y energy (10), makapadayon og lupad
        if (energy >= 10) {
            happiness = Math.min(happiness + 10, 100); // motaas ang kalipay (happiness) by 10, pero dili molapas sa 100
            energy -= 10; // Kuhaan og 10 energy ang bird
            System.out.println("------------------------------------------------------------------");
            System.out.println(name + " fly. Happiness: " + happiness + ", Energy: " + energy);
            System.out.println("------------------------------------------------------------------");
        } else {
            // Kung kulang na ang energy (less than 10), dili na siya molupad
            System.out.println("------------------------------------------------------------------");
            System.out.println(name + " is too tired to fly."); // Bird is too tired to fly
            System.out.println("------------------------------------------------------------------");
        }
    }
}
