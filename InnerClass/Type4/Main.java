class Main {
    public static void main(String[] args) {
        Outter.Inner inner = new Outter.Inner();
        inner.m2();
    }
}

class Outter {
    static int a = 10;

    static class Inner {
        public void m2() {
            System.out.println("M2 Method" + a);
        }
    }
}