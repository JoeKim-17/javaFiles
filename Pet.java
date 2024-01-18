public class Pet implements Dog, Cat {
    private String name;
    private int weight;

    public Pet(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }
    @Override
    public String speak() {
        return Cat.super.speak();
    }
    @Override
    public String animal() {
        return Dog.super.animal();
    }
    @Override
    public int size() {
        return weight;
    }

    @Override
    public String name() {
        return name;
    }
    public static void main(String[] args) {
        Pet zeus = new Pet(50, "Zeus");
        System.out.println(zeus.name()+zeus.size()+zeus.animal()+zeus.speak());
    }

}
