package superkeyword;

public class Child extends Father{

    //super keyword in constructor
    public Child(){
        super(20);
    }

    //super keyword in method
    public void heightEducation(){
        super.educated();
    }

    //super keyword in variables
    public void athleticSkills() {
        int numberOfSports = super.numberOfSport;
        System.out.println("child is practicing "+numberOfSports+" sports");
    }
}
