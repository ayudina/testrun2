package com.yudina.anna.quiz4;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;

@Entity
@Table(name = "Media")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
abstract class Media
{
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    protected int id;
    protected String title;
    public String getTitle()  { return title; }
    public void setTitle(String title){this.title = title;}


}

