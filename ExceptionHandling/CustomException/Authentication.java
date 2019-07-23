class Authentication {
    public boolean isAuthenticated(User user) throws LoginFail {
        if (user.getUsername().equals(user.getPassword())) {
            System.out.println("Login Successful");
            return true;
        } else {
            throw new LoginFail("Invalid Username / Password");
        }
    }
}
