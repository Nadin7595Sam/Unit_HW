import java.util.List;

public interface BookRepository {
    List<Book> findBooksByAuthor(String author);
    Book findBookById(long id);
}