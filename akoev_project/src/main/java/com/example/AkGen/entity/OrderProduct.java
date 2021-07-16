package com.example.AkGen.entity;

import javax.persistence.*;

// Сущность - Заказ-товар. Соответсвие между
// заказами и товарами
@Entity
public class OrderProduct {

    // КОНСТРУКТОР БЕЗ ПАРАМЕТРОВ
    public OrderProduct(){
        this.id_Client_order = null; this.id_product = null;
        this.countProduct = 0;
    }

    // КОНСТРУКТОР С ПАРАМЕТРАМИ
    public OrderProduct(ClientOrder id_Client_order, Product id_product, int countProduct){
        this.id_Client_order = id_Client_order; this.id_product = id_product;
        this.countProduct = countProduct;
    }


    // Уникальный идентификатор
    @Id
    @GeneratedValue
    private long id;

    // Идентификатор заказа
    @ManyToOne
    private ClientOrder id_Client_order;

    // Идентификатор товара
    @ManyToOne
    private Product id_product;

    // Количества товара в заказе
    @Column (nullable = false)
    private int countProduct;


    // ГЕТТЕРЫ

    public long getId() { return id; }

    public ClientOrder getId_Client_order() {
        return id_Client_order;
    }

    public Product getId_product() {
        return id_product;
    }

    public int getCountProduct() {
        return countProduct;
    }


    // СЕТТЕРЫ

    public void setId(long id) { this.id = id; }

    public void setId_Client_order(ClientOrder id_Client_order) {
        this.id_Client_order = id_Client_order;
    }

    public void setId_product(Product id_product) {
        this.id_product = id_product;
    }

    public void setCountProduct(int countProduct) {
        this.countProduct = countProduct;
    }
}
