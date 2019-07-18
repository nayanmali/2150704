class Outter {
    public Outter() {
        System.out.println("Outter Called..");
    }

    class Inner {
        public Inner() {
            System.out.println("Inner Called.");
        }
    }

    public void m1() {
        Inner inner = new Inner();
    }

    public static void main(String[] args) {
        Outter outter = new Outter();
        outter.m1();
    }
}