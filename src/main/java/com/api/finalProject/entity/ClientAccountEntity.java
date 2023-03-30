package com.api.finalProject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "client_account")
public class ClientAccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "clientName")
    private String clientName;

    @Column(name = "clientBalance")
    private BigDecimal clientBalance;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "client")
    private List<ClientTransactions> transaction;

}