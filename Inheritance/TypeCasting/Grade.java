class Grade {
    Student student;

    public Grade(Student student) {
        this.student = student;
    }

    public void calcGrade() {

        System.out.println(student.getClass().getName().equals("UGStudent"));

        UGStudent ugStudent = (UGStudent) student;
        ugStudent.getUgstudent();
        ugStudent.getStudent();
    }
}