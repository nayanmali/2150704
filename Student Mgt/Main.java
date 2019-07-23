class Main{
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(10);
        student.setName("Nayan");
        student.setMarks(new int[]  {52,60,85,64,87});

        Grade grade = new Grade(student);
        System.out.println(grade.calcGrade());

        Student student2 = new Student();
        student2.setId(10);
        student2.setName("Nayan");
        student2.setMarks(new int[]  {52,60,85});

        Grade grade2 = new Grade(student2);
        System.out.println(grade2.calcGrade());
    }
}