package com.api.finalProject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Table(name = "ClientAccount")
public class ClientAccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "clientName")
    private String clientName;

    @Column(name = "clientBalance")
    private BigDecimal clientBalance;

}