package com.example.AkGen.entity;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

// Сущность - Заказ клиента, это заказ, который
// сделал пользователь
@Entity
public class ClientOrder {

    // КОНСТРУКТОР БЕЗ ПАРАМЕТРОВ
    public ClientOrder(){
        this.id_client = null; this.status = 0;
        this.total = 0.0;
    }

    // КОНСТРУКТОР С ПАРАМЕТРАМИ
    public ClientOrder(Client id_client, int status, double total){
        this.id_client = id_client; this.status = status;
        this.total = total;
    }


    //Уникальный идентификатор
    @Id
    @GeneratedValue
    private long id;

    // Идентификатор клиента
    @ManyToOne
    private Client id_client;

    // Статус заказа
    @Column (nullable = false)
    private int status;

    // Сумма по заказу
    @Column (nullable = false, precision = 15, scale = 2)
    private double total;


    // ГЕТТЕРЫ

    public long getId() { return id; }

    public Client getId_client() {
        return id_client;
    }

    public int getStatus() {
        return status;
    }

    public double getTotal() {
        return total;
    }

    
    // СЕТТЕРЫ

    public void setId(long id) { this.id = id; }

    public void setId_client(Client id_client) {
        this.id_client = id_client;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
