package com.librarymanagement.library_management.config;

import com.librarymanagement.library_management.model.Book;
import com.librarymanagement.library_management.model.BookIssue;
import com.librarymanagement.library_management.model.User;
import com.librarymanagement.library_management.repository.BookIssueRepository;
import com.librarymanagement.library_management.repository.BookRepository;
import com.librarymanagement.library_management.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final UserRepository userRepository;
    private final BookRepository bookRepository;
    private final BookIssueRepository bookIssueRepository;

    public DataLoader(UserRepository userRepository,
                      BookRepository bookRepository,
                      BookIssueRepository bookIssueRepository) {
        this.userRepository = userRepository;
        this.bookRepository = bookRepository;
        this.bookIssueRepository = bookIssueRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Seeded data deleted. Users are dynamically fetched and validated against the auth-service.
    }
}
