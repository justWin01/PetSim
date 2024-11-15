package Pets;
// Dog.java

public class Dog extends Pet {
    static String[] colors = {
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

    // Constructor para sa Dog, mopasa sa panagalan sa pet sa superclass (Pet)
    public Dog(String name) {
        super(name); // Tawagon ang constructor sa superclass (Pet) para i-assign ang name
    }

    public void makeSound() {
        System.out
                .println(colors[6] + "------------------------------------------------------------------" + colors[8]);
        System.out.println(name + " says: Woof woof!"); // Ang Dog mo tingog og "Woof woof!"
        System.out
                .println(colors[6] + "------------------------------------------------------------------" + colors[8]);
    }

    // Method para sa fetch action, ang Dog magdula og fetch
    public void fetch() {
        // Kung naa pa'y igo nga energy (10), makapadayon pa sa fetch
        if (energy >= 10) {
            happiness = Math.min(happiness + 10, 100); // Mag-increase ang happiness (pero dili molapas sa 100)
            energy -= 10; // Kuhaan og 10 energy ang dog
            System.out.println(
                    colors[6] + "------------------------------------------------------------------" + colors[8]);
            System.out.println(
                    name + " played fetch. Happiness: " + happiness + ", Energy: " + colors[2] + energy + colors[8]);
            System.out.println(
                    colors[6] + "------------------------------------------------------------------" + colors[8]);
        } else {
            // Kung kulang na ang energy (less than 10), dili na siya makafetch
            System.out.println(
                    colors[6] + "------------------------------------------------------------------" + colors[8]);
            System.out.println(name + " is too tired to fetch."); // Dog is too tired to fetch
            System.out.println(
                    colors[6] + "------------------------------------------------------------------" + colors[8]);
        }
    }
}
