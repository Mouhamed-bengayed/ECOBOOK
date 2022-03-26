package com.example.demo.Dao;

import com.example.demo.Entite.ListeCommande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListeCommandeRepository extends JpaRepository< ListeCommande,Long> {
}
