class Main {
    public static void main(String[] args) {
        Authentication authentication = new Authentication();
        User user = new User();
        user.setUsername("nayan");
        user.setPassword("nayan");
        try {
            authentication.isAuthenticated(user);
        } catch (LoginFail loginFail) {
            loginFail.printStackTrace();
        }
    }
}