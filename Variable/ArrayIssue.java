class ArrayIssue {

    public static void main(String[] args) {
        Test test = Test.getInstance();
    }
}

class Test {
    private static Test test = null;

    private Test() {
    }

    public static Test getInstance() {
        if (test == null) {
            return new Test();
        }
        return test;
    }
}