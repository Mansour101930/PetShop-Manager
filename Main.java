public class Main {
    public static void main(String[] args) {

        PetShop shop = new PetShop();

        shop.addPet(new Pet("Luna", "Cat", 1500));
        shop.addPet(new Pet("Rocky", "Dog", 2500));
        shop.addPet(new Pet("Coco", "Bird", 800));

        shop.showAllPets();
    }
}
