package marks;

public class Medical implements Student
{
    int math;
    float physics;
    double biology;


    @Override
    public void calculateMarks()
    {
        double sum=0;
        sum=sum+math+physics+biology;

    }
}
