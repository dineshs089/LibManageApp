public class book 
{
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;
    public book(String title,String author,String isbn)
    {
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        this.isAvailable=true;
    }

    public boolean isAvailable()
    {
        return isAvailable;
    }
    public void borrow()
    {
        if(isAvailable)
        {
            isAvailable=false;
            System.out.println("you have borrowed: "+title);
        }
        else
        {
            System.out.println("this book is currently unavailable");
        }
    }
    public void returnBook()
    {
        isAvailable=true;
        System.out.println("you have returned: "+title);
    }
    public void getDetails()
    {
        System.out.println("Title: "+title + ". Author: "+author + ". ISBN: " + isbn+ ". Available: "+ isAvailable);
    }
    public String getIsbn()
    {
        return isbn;
    }
}
