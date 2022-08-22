package marks;

public class NonMedical implements Student
{
    int maths;
    float physics;
    double chemistry;

    @Override
    public void calculateMarks()
    {
        double sum=0;
        sum=sum+maths+physics+chemistry;

    }
}
