

import java.util.ArrayList;

public class Teacher extends Person
{


    ArrayList<String> canTeach = new ArrayList<>();

    ArrayList<String> currentCourses = new ArrayList<>();



    //constructor
    public Teacher(String name, ArrayList <String> canTeach)
    {
        super(name);
        this.canTeach = canTeach;
    }



    public boolean addCourse(String course)
    {
        for (int i = 0; i < canTeach.size(); i++)
        {
            if(course.equals(canTeach.get(i)))
            {
                currentCourses.add(course);
                return true;
            }
        }
        System.out.println(name+" kan ikke undervise i dette: "+course);
        return false;

    }


}
