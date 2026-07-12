package com.librarymanagement.library_management.dto;

import java.util.List;

public class StudentDashboardDto {
    private Long studentId;
    private int booksIssuedCount;
    private double totalFine;
    private List<IssuedBookDetailDto> issuedBooks;

    public StudentDashboardDto() {}

    public StudentDashboardDto(Long studentId, int booksIssuedCount, double totalFine, List<IssuedBookDetailDto> issuedBooks) {
        this.studentId = studentId;
        this.booksIssuedCount = booksIssuedCount;
        this.totalFine = totalFine;
        this.issuedBooks = issuedBooks;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public int getBooksIssuedCount() {
        return booksIssuedCount;
    }

    public void setBooksIssuedCount(int booksIssuedCount) {
        this.booksIssuedCount = booksIssuedCount;
    }

    public double getTotalFine() {
        return totalFine;
    }

    public void setTotalFine(double totalFine) {
        this.totalFine = totalFine;
    }

    public List<IssuedBookDetailDto> getIssuedBooks() {
        return issuedBooks;
    }

    public void setIssuedBooks(List<IssuedBookDetailDto> issuedBooks) {
        this.issuedBooks = issuedBooks;
    }
}
