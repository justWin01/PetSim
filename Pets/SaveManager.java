package Pets;

import java.io.*;

public class SaveManager {
    public static void savePet(Pet pet) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("pet.dat"))) {
            oos.writeObject(pet);
            System.out.println("Pet saved!");
        } catch (IOException e) {
            System.out.println("Error saving pet: " + e.getMessage());
        }
    }

    public static Pet loadPet() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("pet.dat"))) {
            Pet pet = (Pet) ois.readObject();
            System.out.println("Pet loaded!");
            return pet;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading pet: " + e.getMessage());
            return null;
        }
    }
}
