package marks;

public class StudentMarksImpl
{
    public static void main(String[] args) {


        Medical Medical = new Medical();


        Medical.math=80;
        Medical.physics=80;
        Medical.biology=80;

        Medical.calculateMarks();

        NonMedical nonMedical=new NonMedical();

        nonMedical.chemistry=90;
        nonMedical.physics=90;
        nonMedical.maths=90;

        Business business=new Business();

        business.accounting=95;
        business.businessStudies=95;
        business.finance=95;

        System.out.println("Total marks : " );


    }

}
