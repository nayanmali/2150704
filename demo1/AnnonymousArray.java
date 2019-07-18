class AnnonymousArray {
    public static void main(String[] args) {

        dispayArray(new int[] { 10, 20, 30, 40 });

        String[] s = new String[] { "nayan" };
        System.out.println(s.length);
        for (String x : s) {
            System.out.println(x);
        }

    }

    public static void dispayArray(int x[]) {
        for (int y : x) {
            System.out.println(y);
        }
    }
}