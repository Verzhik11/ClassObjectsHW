package Lesson1;

import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int year;

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void bookProperty() {
        System.out.println("Название книги " + getName() + ", " +
                "автор " + getAuthor().getName() + " " + getAuthor().getSurname() +
                ", год издания " + getYear());
    }

    public String toString() {
        return "Название книги " + this.name + " Автор " + getAuthor().getName() + getAuthor().getSurname() + " Год издания " + this.year;
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book harryPotter = (Book) other;
        return name.equals(harryPotter.name) && author.equals(harryPotter.author);
    }
    public int hashCode() {
        return java.util.Objects.hash(name, author, year);
    }


}
