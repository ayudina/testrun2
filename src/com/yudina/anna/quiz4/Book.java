package com.yudina.anna.quiz4;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Book")
class Book extends Media
{
    private String author;
    public Book(String title, String author, int id)
    {
        this.title = title;
        this.author = author;
        this.id = id;
    }
    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }
    public String getAuthor() { return author; }
    public String toString()
    {
        return getTitle() + " by " + getAuthor();
    }
}
