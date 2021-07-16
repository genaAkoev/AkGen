package com.example.AkGen.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// Сущность - Клиент. Клиент - пользователь, который будет
// работать с телеграмм ботом.
@Entity
public class Client {

    // КОНСТРУКТОР БЕЗ ПАРАМЕТРОВ
    public Client(){
        this.external_id = 0; this.full_name = "";
        this.phone_number = ""; this.address = "";
    }

    // КОНСТРУКТОР С ПАРАМЕТРАМИ
    public Client(long external_id, String full_name, String phone_number, String address){
        this.external_id = external_id; this.full_name = full_name;
        this.phone_number = phone_number; this.address = address;
    }


    // Уникальный идентификатор
    @Id
    @GeneratedValue
    private  long id;


    // Внешний уникальный идентификатор (телеграм)
    @Column(nullable = false)
    private long external_id;

    // ФИО или форма обращения
    @Column(nullable = false, length = 255)
    private String full_name;

    // Номер телефона
    @Column(nullable = false, length = 15)
    private String phone_number;

    // Адрес
    @Column(nullable = false, length = 400)
    private String address;


    // ГЕТТЕРЫ

    public long getId() { return id; }

    public long getExternal_id() {
        return external_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getAddress() {
        return address;
    }


    // СЕТТЕРЫ

    public void setId(long id) { this.id = id; }

    public void setExternal_id(long external_id) {
        this.external_id = external_id;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
