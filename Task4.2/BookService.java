import java.util.List;

public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getBooksByAuthor(String author) {
        return bookRepository.findBooksByAuthor(author);
    }

    public Book getBookById(long id) {
        return bookRepository.findBookById(id);
    }
}