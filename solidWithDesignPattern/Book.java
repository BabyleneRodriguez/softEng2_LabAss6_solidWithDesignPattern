package solidWithDesignPattern;

public class Book implements LibraryResources
{
    private String bookTitle;

    public Book(String bookTitle)
    {
        this.bookTitle = bookTitle;
    }

    public String getBookTitle()
    {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle)
    {
        this.bookTitle = bookTitle;
    }

    @Override
    public void borrowResources(String studentName)
    {
        System.out.println("Student's name: " + studentName +
                           "\nBook's title: " + bookTitle);
    }
}
