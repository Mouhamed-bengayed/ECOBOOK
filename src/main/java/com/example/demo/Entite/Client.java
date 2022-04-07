package com.example.demo.Entite;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Client extends User {

    @OneToMany(mappedBy = "Client")
    private List<Commande> commande;

}
