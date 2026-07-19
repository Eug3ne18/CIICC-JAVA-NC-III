
public class Task11 {

    public static void main(String[] args) {
        Book[] books = new Book[]{
                new Book("Java Programming","john Smith", 2021, 39.99),
                new Book("Python Basics","Jane Doe", 2020, 29.99),
                new Book("C++ Essentials","Michael JOhnson", 2019, 49.99)

        };
        int index = 1;
        for (Book b : books){
            System.out.println("Book" + index);
            System.out.println(b);
            index++;

        }

    }

}

class Book {
    String title;
    String author;
    int yearPublished;
    double price;
    
    public Book(String Title, String Author, int Year, double Price) {
        title = Title;
        author = Author;
        yearPublished = Year;
        price = Price;
    }
    
    public String toString() {
        return "Title: \"" + title + "\"\n" +
               "Author: \"" + author + "\"\n" +
               "Year Published: " + yearPublished + "\n" +
               "Price: $" + price;
    }
}