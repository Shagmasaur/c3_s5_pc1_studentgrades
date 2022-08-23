package marks;

public class StudentMarksImpl
{
    public static void main(String[] args)
    {
        StudentMarks studentMarks = new StudentMarks();
        System.out.println("MEDICAL STUDENT ="+studentMarks.calculateMarks(24,50,44,67));
        System.out.println("NON-MEDICAL STUDENT ="+studentMarks.calculateMarks(50,87,59));
        System.out.println("BUSINESS STUDENT ="+studentMarks.calculateMarks(78.0,89.0,68.0));
    }
}
