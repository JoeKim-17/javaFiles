public interface Dog extends Animal{
    @Override
    default String speak() {
        return "Bark";
    }

    @Override
    default String animal() {
        return "dog";
    }
}
