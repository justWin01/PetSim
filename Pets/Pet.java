package Pets;

import java.io.Serializable;

public class Pet implements Serializable {
    private static final long serialVersionUID = 1L; // Unique ID for version control

    protected String name; // Ngalan sa pet
    protected int happiness; // Kalipay sa pet (0-100)
    protected int energy; // kusog sa pet (0-100)

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
        System.out.println("------------------------------------------------------------------");
        // Increase ang energy sa pet by 25 pero dili molapas sa 100
        System.out.println(name + " has been fed. Energy: "
                + (energy = Math.min(energy + 25, 100))); // Ang energy dili molapas sa 100
        System.out.println("------------------------------------------------------------------");
    }

    // Pagdula sa pet, magtaas ang kalipay ug mag-kurang ang enerhiya
    public void play() {
        // Kung naa pa'y igo nga energy (20), pwede magdula
        if (energy >= 20) {
            happiness = Math.min(happiness + 15, 100); // Increase ang kalipay (15) pero dili molapas sa 100
            energy -= 20; // Gikuhaan og 20 energy ang pet
            System.out.println("------------------------------------------------------------------");
            System.out.println(name + " played. Happiness: " + happiness + ", Energy: " + energy);
            System.out.println("------------------------------------------------------------------");
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
