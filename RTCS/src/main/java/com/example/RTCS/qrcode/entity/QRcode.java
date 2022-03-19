package com.example.RTCS.qrcode.entity;

import javax.persistence.*;

@Entity
@Table(name = "QRcode")
public class QRcode {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "qRcode", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Sender sender;

    @OneToOne(mappedBy = "qRcode", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Receiver receiver;

    public Receiver getReceiver() {
        return receiver;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}


