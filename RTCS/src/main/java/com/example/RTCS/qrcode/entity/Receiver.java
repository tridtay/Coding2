package com.example.RTCS.qrcode.entity;

import javax.persistence.*;

@Entity
@Table(name="Receiver")
public class Receiver {
    @Id
    @Column(name = "id", nullable = false)
    private Long ReceiverId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "Receiver_id")
    private  QRcode qRcode;


}
