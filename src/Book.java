import java.util.Objects;

public class Book {
    private final String titleOfTheBook;
private final Author author;
private int yearOfPublication;
    public Book(String titleOfTheBook, Author author, int yearOfPublication) {
        this.titleOfTheBook = titleOfTheBook;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }
    public String getTitleOfTheBook() {
        return this.titleOfTheBook;
    }
    public Author getAuthor() {
        return this.author;
    }
    public int getYearOfPublication() {
        return this.yearOfPublication;
    }
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
public String toString() {
        return "Название книги - " + this.titleOfTheBook + " Автор - " + this.author + " Год публикации - " + this.yearOfPublication;
}
    @Override
    public boolean equals(Object other) {
          if (this == other){
              return true;}
          if (other == null || getClass() != getClass()){
              return false;}
Book book = (Book) other;
        return titleOfTheBook.equals(book.titleOfTheBook) && author.equals(book.author) && yearOfPublication == book.yearOfPublication;
        }
    @Override
    public int hashCode() {
        return Objects.hash(titleOfTheBook, author, yearOfPublication);
    }
}

