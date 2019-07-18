class Outter {
    interface InnerInter {
        public void m1();
    }
}

class Main {
    public static void main(String[] args) {
        Outter outter = new Outter();
        outter.Outter.new InnerInter() {

            @Override
            public void m1() {
                System.out.println("Demo");
            }
        }.m1();
    }
}