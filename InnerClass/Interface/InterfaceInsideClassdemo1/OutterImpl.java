class OutterImpl {
    Outter.Inner inner = new Outter.Inner() {

        @Override
        public void m2() {
            System.out.println("M2 Inner Interface");
        }
    };
}
