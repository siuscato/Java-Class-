import java.time.LocalDate;

enum Major {ART, COMPUTERSCIENCE, HISTORY, MATHS, OTHER};

public class Student {

    //characteristics/attributes - called fields
    private String Name;
    private double GPA;
    private String Address;
    private Major Major;
    private boolean IsStudent;
    private boolean IsVeteran;
    private LocalDate DOB;

    public void Printlnfo() // define the method 
    {
        System.out.println("Name: " + Name);
        System.out.println("GPA: " + GPA);
        System.out.println("Address: " + Address);
        System.out.println("Major: " + Major);
        System.out.println("IsStudent: " + IsStudent);
        System.out.println("Is veteran: " + IsVeteran);
        System.out.println("DOB: " + DOB);
    }
    public Major getMajor()
    {
       return Major; 

    }
    public void setMajor(Major Major){
        this.Major = Major;
    }
    public String getName() // gives read access to Name
    { 
        return Name;
    }
    public void setName(String newName)// gives write access to NAme
    {
        Name = newName;
    }
    public double getGPA() 
    {
        return GPA;
    }
    public void setGPA(double newGPA)
    {
        if(newGPA<0)
        {
            this.GPA = 0;
        }
        else
        {
        GPA = newGPA;
        }
    }



}