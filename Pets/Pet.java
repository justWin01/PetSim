package Pets;

import java.io.Serializable;

public class Pet implements Serializable {
    private static final long serialVersionUID = 1L; // Unique ID for version control
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
    protected String name;
    protected int happiness;
    protected int energy;

    // Constructor nga mag-set sa ngalan sa pet ug initial values sa kalipay ug
    // kusog sa pet

    public Pet(String name) {
        this.name = name;
        this.happiness = 50; // Default happiness value
        this.energy = 100; // Default energy value
    }

    public void makeSound() {
    }

    // Pag-feed sa pet, maghatag og energy ug mag-update sa status
    public void feed() {
        System.out
                .println(colors[6] + "------------------------------------------------------------------" + colors[8]);
        // Increase ang energy sa pet by 25 pero dili molapas sa 100
        System.out.println(name + " has been fed. Energy: " + colors[2]
                + (energy = Math.min(energy + 25, 100)) + colors[8]); // Ang energy dili molapas sa 100
    }

    // Pagdula sa pet, magtaas ang kalipay ug mag-kurang ang enerhiya
    public void play() {

        // Kung naa pa'y igo nga energy (20), pwede magdula
        if (energy >= 20) {
            happiness = Math.min(happiness + 15, 100); // Increase ang kalipay (15) pero dili molapas sa 100
            energy -= 20; // Gikuhaan og 20 energy ang pet
            System.out
                    .println(colors[6] + "------------------------------------------------------------------"
                            + colors[8]);
            System.out
                    .println(name + " played. Happiness: " + happiness + ", Energy: " + colors[2] + energy + colors[8]);
        } else {
            System.out.println(name + " is too tired to play."); // Kung kulang na ang energy, dili na magdula
        }
    }

    // Getter method para sa ngalan sa pet
    public String getName() {
        return name;
    }

    // Getter method para sa kalipay sa pet
    public int getHappiness() {
        return happiness;
    }

    // Getter method para sa enerhiya sa pet
    public int getEnergy() {
        return energy;
    }

    // Override sa toString method para sa pag-print sa basic pet information
    @Override
    public String toString() {
        return "Name: " + name;
    }
}
