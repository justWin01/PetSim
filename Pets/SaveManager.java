package Pets;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class SaveManager {
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

    public static void savePet(Pet pet) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("pet.dat"))) {
            oos.writeObject(pet);
            System.out.println(colors[2] + "Pet saved!" + colors[8]);
        } catch (IOException e) {
            System.out.println(colors[1] + "Error saving pet: " + e.getMessage() + colors[8]);
        }
    }

    public static Pet loadPet() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("pet.dat"))) { // Use "pet.dat" to match
                                                                                              // the save filename
            Pet pet = (Pet) ois.readObject();
            System.out.println(colors[2] + "Pet loaded!" + colors[8]);
            return pet;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(colors[1] + "Error loading pet: " + e.getMessage() + colors[8]);
            return null;
        }
    }
}
