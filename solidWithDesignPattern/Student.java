package solidWithDesignPattern;

public class Student
{
    private String studentName;

    public Student(String studentName)
    {
        this.studentName = studentName;
    }

    public String getStudentName()
    {
        return studentName;
    }

    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }

    void borrowResource( LibraryResources resource)
    {
        resource.borrowResources(this.getStudentName());
    }
}
