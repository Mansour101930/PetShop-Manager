import java.util.ArrayList;

public class PetShop {
    ArrayList<Pet> pets = new ArrayList<>();

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void showAllPets() {
        for (Pet pet : pets) {
            pet.displayPet();
            System.out.println("----------------");
        }
    }
public void searchPet(String petName) {
    for (Pet pet : pets) {
        if (pet.name.equalsIgnoreCase(petName)) {
            System.out.println("Pet Found:");
            pet.displayPet();
            return;
        }
    }
    System.out.println("Pet not found.");
}
}

