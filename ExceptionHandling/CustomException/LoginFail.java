class LoginFail extends Exception {
    String msg = null;

    public LoginFail() {

    }

    public LoginFail(String msg) {
        this.msg = msg;
    }

    public String toString() {
        return msg;
    }
}