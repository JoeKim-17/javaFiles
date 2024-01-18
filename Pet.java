public class Pet implements Dog, Cat {

    @Override
    public String speak() {
        // TODO Auto-generated method stub
        return Dog.super.speak();
    }
    @Override
    public String animal() {
        // TODO Auto-generated method stub
        return Dog.super.animal();
    }
    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public String name() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'name'");
    }

}
