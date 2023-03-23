

/**
 * Classes
 */
enum MilitaryBranch { AIRFORCE, ARMY, COASTGUARD, MARINES, NAVY, SPACEFORCE};

public class Classes {

    public static void main(String[] args) {
        String name = "Alloysius";
        double salary = 50000;
        MilitaryBranch  MyBranch = MilitaryBranch.ARMY;
        System.out.println(MyBranch);
        Student s = new Student();
       
        Student s1 = new Student();
        s1.setName("Alloysius");// s1.Name = "Alloysius";
        s1.setGPA(1.5);// s1.GPA = 1.5;
        //s1.Address = "Lacey";
        s1.setMajor ( Major.COMPUTERSCIENCE);// s1 Major = Major.COMPUTERSCIENCE;
        //s1.setIsVeteran = false;
        //s1.DOB = LocalDate.parse("2000-08-25");


        Student s2 = s1;
        /*System.out.println(s1.getName); */
        //System.out.println();

        //Student s3 = "Bianca"
       
        Die d1 = new Die();
        d1.setNumberOFSides(6);
        d1.setColor(Color.RED);
        d1.Roll();
        System.out.println(d1.getResult());

        d1.Roll();
        System.out.println(d1.getResult());
        



    


    
    }
   

    
}