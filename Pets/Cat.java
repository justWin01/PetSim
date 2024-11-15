package Pets;
// Cat.java

public class Cat extends Pet {
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

    // Constructor para sa Cat, mopasa sa panagalan sa pet sa superclass (Pet)
    public Cat(String name) {
        super(name); // Tawagon ang constructor sa superclass (Pet) para i-assign ang name
    }

    public void makeSound() {
        System.out
                .println(colors[6] + "------------------------------------------------------------------" + colors[8]);
        System.out.println(name + " says: Meow meow!"); // Ang Cat mo tingog og"Meow meow!"
        System.out
                .println(colors[6] + "------------------------------------------------------------------" + colors[8]);
    }

    // Method para sa scratch action, ang Cat mag-scratch
    public void scratch() {
        // Ang scratch action magtaas sa happiness (pero dili molapas sa 100)
        System.out
                .println(colors[6] + "------------------------------------------------------------------" + colors[8]);
        happiness = Math.min(happiness + 5, 100); // Magtaas ang happiness by 5, pero dili molapas sa 100
        System.out.println(name + " scratched. Happiness: " + happiness);
        System.out
                .println(colors[6] + "------------------------------------------------------------------" + colors[8]);
    }
}
