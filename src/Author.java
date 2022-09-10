import java.util.Objects;

public class Author {
    private String surnameAuthor;
    private String nameAuthor;

    public Author (String surnameAuthor, String nameAuthor) {
this.surnameAuthor = surnameAuthor;
this.nameAuthor = nameAuthor;
    }
    public String getSurnameAuthor() {
        return this.surnameAuthor;
    }
    public String getNameAuthor() {
        return this.nameAuthor;
    }
    public String toString () {
return "Фамилия автора - " + this.surnameAuthor + "Имя автора - " + this.nameAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return surnameAuthor.equals(author.surnameAuthor) && nameAuthor.equals(author.nameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surnameAuthor, nameAuthor);
    }
}

