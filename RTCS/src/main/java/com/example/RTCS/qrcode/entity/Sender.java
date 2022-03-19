package com.example.RTCS.qrcode.entity;

import javax.persistence.*;

@Entity
@Table(name="Sender")
public class Sender {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    @OneToOne
    @MapsId
    @JoinColumn(name = "Sender_id")
    private  QRcode qRcode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
