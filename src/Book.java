import java.util.Objects;

public class Book {
    private final String title;
    private final Author author;
    private int editionsYear;

    public Book(String title, Author author, int editionsYear) {
        this.title = title;
        this.author = author;
        this.editionsYear = editionsYear;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }
    public int getEditionsYear() {
        return this.editionsYear;
    }
    public void setEditionsYear(int editionsYear) {
        this.editionsYear = editionsYear;
    }
    public String toString () {
        return "Книга: " + this.title + ". " +getAuthor() + " Год публикации: " + this.editionsYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return editionsYear == book.editionsYear && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, editionsYear);
    }
}