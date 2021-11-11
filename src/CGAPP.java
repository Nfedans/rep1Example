import java.util.ArrayList;

public class CGAPP {

    public static void main( String[] args )
    {
        System.out.println( "ArrayList Student" );
        CGAPP app = new CGAPP();
        app.start();
    }

    public void start() {

        ClassGroup sd2a = new ClassGroup("sd2a");

        sd2a.add(new Student("steve", "1 street", 20));
        sd2a.add(new Student("Clark", "2 street", 59));

        sd2a.printAll();

        String key = "steve";


        /*
        ArrayList<Student> list = new ArrayList<>();

        // how do we add to an ArrayList of Student objects?
        list.add(new Student("steve", "london", 45));
        list.add(new Student("joe", "paris", 23));
        print(list);

        System.out.println(); // newline

        //how can we access and modify a Student object in a list?
        Student p = list.get(1);
        p.setAddress("Joe's new address");
        System.out.println(p);

        // output all Student objects using toString()
        for (Student Student : list) {
            System.out.println(Student.toString());
        }
        */
    }

    public void print(ArrayList<Student> list ) {
        for (Student p : list )
            System.out.println(p);
    }

}
