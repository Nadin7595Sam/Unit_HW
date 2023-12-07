import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookServiceTest {
    private BookService bookService;
    private BookRepository bookRepository;

    @BeforeEach
    public void setUp() {
        // Создаем мок-объект BookRepository
        bookRepository = mock(BookRepository.class);
        bookService = new BookService(bookRepository);
    }

    @Test
    public void testGetBooksByAuthor() {
        // Подготавливаем данные
        List<Book> expectedBooks = Arrays.asList(
                new Book(1, "Book 1", "Author 1"),
                new Book(2, "Book 2", "Author 1")
        );
        when(bookRepository.findBooksByAuthor("Author 1")).thenReturn(expectedBooks);

        // Вызываем метод, который мы тестируем
        List<Book> actualBooks = bookService.getBooksByAuthor("Author 1");

        // Проверяем результат
        assertEquals(expectedBooks, actualBooks);
    }

    @Test
    public void testGetBookById() {
        // Подготавливаем данные
        Book expectedBook = new Book(1, "Book 1", "Author 1");
        when(bookRepository.findBookById(1)).thenReturn(expectedBook);

        // Вызываем метод, который мы тестируем
        Book actualBook = bookService.getBookById(1);

        // Проверяем результат
        assertEquals(expectedBook, actualBook);
    }
}