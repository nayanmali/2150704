class VarLenArgs {
    public static void main(String[] args) {
        int ans = addition(10, 20, 30, 40, 50);
        System.out.println(ans);
    }

    public static int addition(int... x) {
        int sum = 0;
        for (int y : x) {
            sum = sum + y;
        }
        return sum;
    }
}