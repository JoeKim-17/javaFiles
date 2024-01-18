public interface Cat extends Animal {
    String sound = "meow";
    String species = "cat";
    @Override
    public default String speak() {
        return sound;
    }

    @Override
    default String animal() {
        return species;
    }
}
