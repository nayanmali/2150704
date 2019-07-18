abstract class Parrent {
    public abstract void m1();
}

abstract class Child extends Parrent {
    public abstract void m2();
}

class GrandChild extends Child {
    public void m1() {

    }

    public void m2() {

    }
}

class Main {
    public static void main(String[] args) {

    }
}
