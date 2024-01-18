public class classB {

    private class ClassA {

        public void foo() {
        }

        public int bar() {
            return 0;
        }
    }

    ClassA classA = new ClassA();

    public void bar() {
        classA.foo();
        classA.bar();
        System.out.println("barred");
    }

    public static void main(String[] args) {
        new classB().bar();
    }
}