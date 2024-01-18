public abstract class Animal {
    private String sound;
    private int weight;
    private String petName;
    private String species;

    public Animal(String sound, int weight, String petName, String species) {
        sound = this.sound;
        weight = this.weight;
        petName = this.petName;
        species = this.species;
    }

    public String speak() {
        return sound;
    }

    public int size() {
        return weight;
    }

    public String animal() {
        return species;
    }

    public String name() {
        return petName;
    }
}
