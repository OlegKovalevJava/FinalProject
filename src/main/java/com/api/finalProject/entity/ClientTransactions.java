package com.api.finalProject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "client_transactions")
public class ClientTransactions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "transaction_amount")
    private BigDecimal transactionAmount;

    @Column(name = "transaction_date")
    private Date transactionDate;

    @Column(name = "transaction_type")
    private String transactionType;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private ClientAccountEntity clientAccountEntity;

}