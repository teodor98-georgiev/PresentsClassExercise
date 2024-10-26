import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;
// code works but compiler of udemy doesn't recognize the big decimal....
public class Book {
    int id;
    String name;
    Author[] authors;
    Publisher publisher;
    int publishingYear;
    int amountOfPages;
    BigDecimal price;
    CoverType coverType;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && publishingYear == book.publishingYear && amountOfPages == book.amountOfPages && Objects.equals(name, book.name) && Objects.deepEquals(authors, book.authors) && Objects.equals(publisher, book.publisher) && Objects.equals(price, book.price) && coverType == book.coverType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, Arrays.hashCode(authors), publisher, publishingYear, amountOfPages, price, coverType);
    }

    public Book(int id, String name, Author[] authors, Publisher publisher, int publishingYear, int amountOfPages,
                BigDecimal price, CoverType coverType) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
        this.amountOfPages = amountOfPages;
        this.price = price;
        this.coverType = coverType;
    }
    public String toString(){
        return "id: " + this.id + " name of book: " + this.name + " authors: " + Arrays.toString(this.authors) + " publisher: " + this.publisher
                + " publishingYear: " + this.publishingYear + " amount of pages: " + this.amountOfPages + " price: "
                + this.price + " coverType: " + this.coverType;
    }
}
