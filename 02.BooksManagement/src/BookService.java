import java.util.List;
import java.util.ArrayList;
public class BookService {
    public Book[] filterBooksByAuthor(Author author, Book[] books) {
        ArrayList<Book> filteredBooks = new ArrayList<>();
        for (Book book : books){
            for (Author authorToGet : book.authors ){
                if (authorToGet.firstName.equals((author.firstName)) && authorToGet.lastName.equals((author.lastName))){
                    filteredBooks.add(book);
                    break;
                }
            }
            break;
        }
        return filteredBooks.toArray(new Book[0]);
    }

    public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {
        ArrayList<Book> filteredBooks = new ArrayList<>();
        for (Book book : books){
            if (book.publisher.publisherName.equals(publisher.publisherName)){
                filteredBooks.add(book);
                break;
            }
        }
        return filteredBooks.toArray(new Book[0]);
    }

    public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
        ArrayList<Book> filteredBooks = new ArrayList<>();
        for (Book book : books){
            if (book.publishingYear == yearFromInclusively){
                filteredBooks.add(book);
                break;
            }
        }
        return filteredBooks.toArray(new Book[0]);
    }

}
