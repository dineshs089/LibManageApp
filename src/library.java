import java.util.ArrayList;

public class library {
    private ArrayList<book> books = new ArrayList<>();
    public void addbook(book Book)
    {
        books.add(Book);
    }
    public void borrowbook(String isbn)
    {
        for(book Book : books)
        {
            if(Book.getIsbn().equals(isbn) && Book.isAvailable())
            {
                Book.borrow();
                return;
            }
        }
        System.out.println("Book is already borrowed or Book not found");
    }
    public void returnBook(String isbn)
    {
        for(book Book : books)
        {
            if(Book.getIsbn().equals(isbn)&& !Book.isAvailable())
            {
                Book.returnBook();
                return;
            }
        }
        System.out.println("Book is not found or not borrowed");
    }
    public void viewAllBooks()
    {
        for(book Book:books)
        {
            Book.getDetails();
        }
    }
}
