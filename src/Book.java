
public class Book {
    String titleOfTheBook;
String author;
int yearOfPublication;
    public Book(String titleOfTheBook, String author, int yearOfPublication) {
        this.titleOfTheBook = titleOfTheBook;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }
    public String getTitleOfTheBook() {
        return this.titleOfTheBook;
    }
    public String getAuthor() {
        return this.author;
    }
    public int getYearOfPublication() {
        return this.yearOfPublication;
    }
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

}
