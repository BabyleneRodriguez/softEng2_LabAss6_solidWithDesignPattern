package solidWithDesignPattern;

public class Journal implements LibraryResources
{
    private String journalTitle;

    public Journal(String journalTitle)
    {
        this.journalTitle = journalTitle;
    }

    public String getJournalTitle()
    {
        return journalTitle;
    }

    public void setJournalTitle(String journalTitle)
    {
        this.journalTitle = journalTitle;
    }

    @Override
    public void borrowResources(String studentName)
    {
        System.out.println("Student's name: " + studentName +
                           "\nJournal's's title: " + journalTitle);
    }
}
