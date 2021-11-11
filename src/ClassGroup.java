import java.util.ArrayList;

public class ClassGroup {

    private String name;
    private ArrayList<Student> studentList;

    public ClassGroup(String name)
    {
        this.name = name;
        this.studentList = new ArrayList<>();
    }

    public void add(Student s) {
        studentList.add(s);
    }

    public void printAll()
    {
        System.out.print("Students" + "\n");
        for (Student s : studentList)
        {
            System.out.println(s.toString());
        }
    }

    public Student findStudentByName(String name)
    {
        for(Student s: studentList)
        {
            if(s.getName().equals(name))
            {
                return s;
            }
        }
        return null;
    }

    public ArrayList<Student> findStudentByAddress(String address)
    {
        for(Student s: studentList)
        {
            if(s.getAddress().equals(address))
            {
                return s;
            }
        }
        return null;
    }




}
