package com.example.AkGen.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// Сущность - Категория. Это категории, в которых
// хранятся различные товары.
@Entity
public class Category {

    public Category(){}

    public Category(String name){
        this.name = name;
    }

    public Category(String name, long parent){
        this.name = name; this.parent = parent;
    }

    //Уникальный идентификатор
    @Id
    @GeneratedValue
    private long id;

    // Название категории
    @Column (nullable = false, length = 50, unique = true)
    private String name;

    // Родительская категория
    @Column
    private long parent;


    // ГЕТТЕРЫ

    public long getId() { return id; }

    public String getName() {
        return name;
    }

    public long getParent() {
        return parent;
    }


    // СЕТТЕРЫ

    public void setId(long id) { this.id = id; }

    public void setName(String name) {
        this.name = name;
    }

    public void setParent(long parent) {
        this.parent = parent;
    }
}
