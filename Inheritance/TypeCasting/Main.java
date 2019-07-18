class Main {
    public static void main(String[] args) {
        Student ugStudent = new UGStudent();

        Grade grade = new Grade(ugStudent);
        grade.calcGrade();
    }
}