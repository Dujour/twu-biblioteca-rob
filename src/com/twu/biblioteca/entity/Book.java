package com.twu.biblioteca.entity;

public class Book {

    private final String title;
    private final String author;
    private final int year;
    private boolean available;

    public Book (String title, String author, int year, boolean available) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = available;
    }

    public String getTitle(){
        return title;
    }

    public boolean getBookAvailabillity(){
        return available;
    }

    public void setBookAvailabillity(boolean available){
        this.available = available;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (year != book.year) return false;
        return title != null ? title.equals(book.title) : book.title == null;

    }


    @Override
    public String toString(){
        return "Book{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", available=" + available +
                ", author='" + author + '\'' +
                '}';
    }
}


