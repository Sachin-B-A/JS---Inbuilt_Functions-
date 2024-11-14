class Student{
    private String Name = "Sachin";
    private int Age = 22;

    public String getName() {
        return this.Name;
    }
    public void setAge(int Age){
        this.Age = Age;
    }
    public int getAge() {
        return this.Age;
    }
}

public class encapuslation{
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Name: " + student.getName());
        student.setAge(23);
        System.out.println("Age: " + student.getAge());
    }
}