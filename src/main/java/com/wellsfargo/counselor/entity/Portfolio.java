package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private LocalDate dateCreated;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    public Portfolio(){
    }

    public Portfolio(Client client){
        this.client = client;
        this.dateCreated = LocalDate.now();
    }

    public Client getClient(){
        return this.client;
    }

    public void setClient(Client newCleint){
        this.client = newCleint;
    }

    public LocalDate getDateCreated(){
        return dateCreated;
    }

    public void setDateCreated(LocalDate newDate){
        this.dateCreated = newDate;
    }
}
