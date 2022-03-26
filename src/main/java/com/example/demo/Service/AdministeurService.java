package com.example.demo.Service;

import com.example.demo.Dao.AdministrateurRepository;
import com.example.demo.Entite.Administrateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministeurService {
@Autowired
    AdministrateurRepository administrateurRepository;


}
