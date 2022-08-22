package marks;

public class Business implements Student
{

    int businessStudies;
    float finance;
    double accounting;

    @Override
    public void calculateMarks()
    {
        double sum=0;
        sum=sum+businessStudies+finance+accounting;
    }

}
