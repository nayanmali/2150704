class Grade{
    Student student = null;

    public Grade(Student student){
        this.student = student;
    }

    public float calcGrade(){
        float sum = 0;
        for(int i : student.getMarks()){
            System.out.println(i);
            sum = sum + i;
        }
        
        int length = student.getMarks().length;
        float total = length * 100;
        System.out.println("Total "+sum+" Obtain"+total);
        return (sum/total)*100;
    }
}