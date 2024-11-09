import java.util.Scanner;
public class App {
    public static void main(String[] args)
    {
        library Library = new library();
        Scanner scanner  = new Scanner(System.in);

        Library.addbook(new book("The Great Gatsby","F. Scott Fitzgerald","123456789"));
        Library.addbook(new book("harrypotter","j k Rowling","123456789"));
        while(true)
        {
            System.out.println("\n1. Add Book\n2. Borrow Book\n3. Return Book\n4. View All Books\n5. Exit");
            System.out.print("Choose an option: ");
            int choice=scanner.nextInt();
            scanner.nextLine();

            switch(choice)
            {
                case 1:
                    System.out.println("Enter the title: ");
                    String title=scanner.nextLine();
                    System.out.println("Enter the Author: ");
                    String author=scanner.nextLine();
                    System.out.println("Enter the ISBN: ");
                    String isbn=scanner.nextLine();
                    Library.addbook(new book(title,author,isbn));
                    System.out.println("Book added");
                    break;
                case 2:
                    System.out.println("Enter the ISBN: ");
                    String borrowisbn=scanner.nextLine();
                    Library.borrowbook(borrowisbn);
                    System.out.println("\nBook is borrowed");
                    break;
                case 3:
                    System.out.println("Enter the ISBN: ");
                    String returnisbn=scanner.nextLine();
                    Library.returnBook(returnisbn);
                    System.out.println("Book returned");
                    break;
                case 4:
                    Library.viewAllBooks();
                    break;
                case 5:
                    System.out.println("Exiting");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again");
                    
            }
        }
    }
}
