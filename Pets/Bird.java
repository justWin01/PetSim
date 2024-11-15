package Pets;

public class Bird extends Pet {
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

    // Constructor para sa Bird, mopasa sa panagalan sa pet sa superclass (Pet)
    public Bird(String name) {
        super(name); // Tawagon ang constructor sa superclass (Pet) para i-assign ang name
    }

    public void makeSound() {
        System.out
                .println(colors[6] + "------------------------------------------------------------------" + colors[8]);
        System.out.println(name + " says: twit-twit!"); // Ang Bird motingog og "twit-twit!"
        System.out
                .println(colors[6] + "------------------------------------------------------------------" + colors[8]);
    }

    // Method para sa fly action, ang Bird na molupad
    public void fly() {
        // Kung naa pa'y energy (10), makapadayon og lupad
        if (energy >= 10) {
            happiness = Math.min(happiness + 10, 100); // motaas ang kalipay (happiness) by 10, pero dili molapas sa 100
            energy -= 10; // Kuhaan og 10 energy ang bird
            System.out.println(
                    colors[6] + "------------------------------------------------------------------" + colors[8]);
            System.out.println(name + " fly. Happiness: " + happiness + ", Energy: " + energy);
            System.out.println(
                    colors[6] + "------------------------------------------------------------------" + colors[8]);
        } else {
            // Kung kulang na ang energy (less than 10), dili na siya molupad
            System.out.println(
                    colors[6] + "------------------------------------------------------------------" + colors[8]);
            System.out.println(name + " is too tired to fly."); // Bird is too tired to fly
            System.out.println(
                    colors[6] + "------------------------------------------------------------------" + colors[8]);
        }
    }
}
