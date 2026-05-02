public class Pet {
    String name;
    String type;
    double price;

    public Pet(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public void displayPet() {
        System.out.println("Pet Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
    }
}
