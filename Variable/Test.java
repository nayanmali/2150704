class Test {
    public static void main(String[] args) {
        VarDemo demo1 = new VarDemo();
        VarDemo demo2 = new VarDemo();

        demo1.localVarDemo();

        demo1.x = 10;
        demo1.y = 20;
        System.out.println("");
        demo1.localVarDemo();
        demo2.localVarDemo();
    }
}

class VarDemo {
    int x;
    static int y;

    public void localVarDemo() {
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
    }

}