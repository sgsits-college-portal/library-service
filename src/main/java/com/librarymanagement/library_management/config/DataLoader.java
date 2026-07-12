package com.librarymanagement.library_management.config;

import com.librarymanagement.library_management.model.Book;
import com.librarymanagement.library_management.model.BookIssue;
import com.librarymanagement.library_management.repository.BookIssueRepository;
import com.librarymanagement.library_management.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final BookRepository bookRepository;
    private final BookIssueRepository bookIssueRepository;

    public DataLoader(BookRepository bookRepository,
                      BookIssueRepository bookIssueRepository) {
        this.bookRepository = bookRepository;
        this.bookIssueRepository = bookIssueRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Check if database is already populated
        if (bookRepository.count() > 0) {
            return;
        }

        // Seed default books
        Book book1 = new Book("Introduction to Algorithms", "Thomas H. Cormen", "9780262033848", "Computer Science", 3);
        book1.setAvailableCopies(2); // 1 copy issued below
        book1 = bookRepository.save(book1);

        Book book2 = new Book("Clean Code", "Robert C. Martin", "9780132350884", "Programming", 5);
        bookRepository.save(book2);

        Book book3 = new Book("Design Patterns", "Erich Gamma", "9780201633610", "Software Engineering", 4);
        bookRepository.save(book3);

        Book book4 = new Book("The Pragmatic Programmer", "Andrew Hunt", "9780135957059", "Programming", 2);
        bookRepository.save(book4);

        // Seed active book issue for student ID 1055L (mocking Divyansh Soni) issued 3 months ago
        LocalDate issueDate = LocalDate.now().minusMonths(3);
        LocalDate dueDate = issueDate.plusDays(30); // 30 days due date policy
        BookIssue issue = new BookIssue(book1.getId(), 1055L, issueDate, dueDate);
        bookIssueRepository.save(issue);
    }
}
