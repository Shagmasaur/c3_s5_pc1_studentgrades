package marks;

public class StudentMarks
{
    public int calculateMarks(int bio, int physics, int chemistry,int math) {
        int sum = bio+physics+chemistry+math;
        return sum ;
    }
    public int calculateMarks(int hindi, int english, int sanskrit){
        int sum= hindi+english+sanskrit;
        return sum;

    }
    public double calculateMarks(double marketing,double finance,double accounting){
        double sum = marketing+finance+accounting;
        return sum;
    }

}
