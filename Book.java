public class Book {
    private String bookName;
    private String isbnNumber;
    private String authorName;
    private String publisher;

    
    public Book(String bookName, String isbnNumber, String authorName, String publisher) {
        this.bookName = bookName;
        this.isbnNumber = isbnNumber;
        this.authorName = authorName;
        this.publisher = publisher;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    
    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

  
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

   
    public String getBookInfo() {
        return "Book Name: " + bookName + 
               "\nISBN Number: " + isbnNumber + 
               "\nAuthor: " + authorName + 
               "\nPublisher: " + publisher;
    }

    public static void main(String[] args) {
        
        Book book = new Book("Effective Java", "978-0134686097", "Joshua Bloch", "Addison-Wesley");

      
        System.out.println(book.getBookInfo());
        book.setAuthorName("Joshua J. Bloch");
        System.out.println("\nUpdated Author: " + book.getAuthorName());
        System.out.println(book.getBookInfo());
    }
}