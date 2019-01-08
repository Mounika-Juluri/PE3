

public class StudentMarks {
    private int numOfStudents;
    private int[] stuGrades;

    public StudentMarks(){}

    public StudentMarks(int numOfStudents,int[] stuGrades){
        this.numOfStudents=numOfStudents;
        this.stuGrades=stuGrades;
    }

    public String checkStudentGrades(int numOfStudents,int[] stuGrades){
        for (int i=0;i<numOfStudents;i++){
            if (stuGrades[i]>=0 & stuGrades[i]<=100){

            }else{
                return "Input Invalid";
            }
        }
        return "Input Valid";

    }


}
