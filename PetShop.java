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
}
