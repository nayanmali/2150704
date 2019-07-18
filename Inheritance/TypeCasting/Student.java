class Student {
    private String fname;
    private String lname;

    public Student() {

    }

    public Student(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public void getStudent() {
        System.out.println("Name " + fname + " Last Name" + lname);
    }
}