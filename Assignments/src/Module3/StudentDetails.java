package Module3;

public class StudentDetails {
    String name;
    int marks;

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Marks: "+marks);
    }

    public static void main(String[] args) {
        StudentDetails s=new StudentDetails();
        s.name="Lekhana";
        s.marks=85;
        s.display();
    }

}
