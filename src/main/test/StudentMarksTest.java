import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {

    StudentMarks studMarks;
    @Before
    public void setUp() throws Exception {
       StudentMarks studMarks;
    }

    @After
    public void tearDown() throws Exception {
        studMarks=null;
    }

    @Test
    public void getNumberOfStudentsSuccess() {
        int[] gradeArray={10,20,30,40};
        StudentMarks studmarks=new StudentMarks(4,gradeArray);
        String expectedValue="Input Valid";
        String actualValue=studmarks.checkStudentGrades(4,gradeArray);
        assertEquals(expectedValue,actualValue);

    }
    @Test
    public void allZeroSuccess() {
        int[] gradeArray={0,0,0,0};
        StudentMarks studmarks=new StudentMarks(4,gradeArray);
        String expectedValue="Input Valid";
        String actualValue=studmarks.checkStudentGrades(4,gradeArray);
        assertEquals(expectedValue,actualValue);

    }
    @Test
    public void negativeGradeFailure() {
        int[] gradeArray={-1,20,30,40};
        StudentMarks studmarks=new StudentMarks(4,gradeArray);
        String expectedValue="Input Invalid";
        String actualValue=studmarks.checkStudentGrades(4,gradeArray);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void greaterThanHundredFailure() {
        int[] gradeArray={10,20,110,40};
        StudentMarks studmarks=new StudentMarks(4,gradeArray);
        String expectedValue="Input Invalid";
        String actualValue=studmarks.checkStudentGrades(4,gradeArray);
        assertEquals(expectedValue,actualValue);
    }

}