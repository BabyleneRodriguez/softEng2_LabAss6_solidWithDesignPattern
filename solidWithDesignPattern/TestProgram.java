package solidWithDesignPattern;

public class TestProgram
{
    public static void main(String[] args)
    {
        Student stud1 = new Student("Babbi");
        Book book1 = new Book("Harry Potter");
        Journal journal1 = new Journal("Advance in IOT");

        stud1.borrowResource(book1);
        stud1.borrowResource(journal1);

        System.out.println();

        Student stud2 = new Student("Anya");
        Book book2 = new Book("Atomic Habits");
        Journal journal2 = new Journal("Communications and Network");

        stud2.borrowResource(book2);
        stud2.borrowResource(journal2);


    }
}
