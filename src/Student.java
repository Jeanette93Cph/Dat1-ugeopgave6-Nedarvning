


import java.util.ArrayList;

public class Student extends Person
{

    ArrayList<String> passedCourses = new ArrayList<>();

    ArrayList<String> currentCourses = new ArrayList<>();

    //constructor
    public Student(String name, ArrayList <String> passedCourses)
    {
        super(name);
        this.passedCourses = passedCourses;

    }


    public boolean addCourse(String course)
    {
        for (int i = 0; i < passedCourses.size(); i++)
        {
            if(course.equals(passedCourses.get(i)))
            {
                System.out.println(name+" har allerede bestået dette "+course);
                return false;
            }
        }
        currentCourses.add(course);
        return true;

    }



}
