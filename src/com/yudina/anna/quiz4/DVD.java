package com.yudina.anna.quiz4;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "DVD")
class DVD extends Media
{
    private int year;
    public DVD(String title, int year, int id)
    {
        this.title = title;
        this.year = year;
        this.id = id;
    }
    public int getYear() 	 { return year;  }
    public String toString()
    {
        return year + ": " + title + " [DVD]";
    }
}