package com.example.AkGen.entity;

import javax.persistence.*;

// Сущность - Товар, это та продукция, которая
// доступна для заказа через телеграмм бот.
@Entity
public class Product {

    // КОНСТРУКТОР БЕЗ ПАРАМЕТРОВ
    public Product(){
        this.category = null; this.name = "";
        this.description = ""; this.price = 0.0;
    }

    // КОНСТРУКТОР С ПАРАМЕТРАМИ
    public Product(Category category, String name, String description, double price){
        this.category = category; this.name = name;
        this.description = description; this.price = price;
    }


    // Уникальный идентификатор
    @Id
    @GeneratedValue
    private long id;

    // Идентификатор категории
    @ManyToOne
    private Category category;

    // Название
    @Column (nullable = false, length = 50, unique = true)
    private String name;

    // Описание
    @Column (nullable = false, length = 400)
    private String description;

    // Стоимость
    @Column (nullable = false, precision = 15, scale = 2)
    private double price;


    // ГЕТТЕРЫ

    public long getId() { return id; }

    public Category getId_category() {
        return category;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }


    // СЕТТЕРЫ

    public void setId(long id) { this.id = id; }

    public void setId_category(Category id_category) {
        this.category = id_category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
