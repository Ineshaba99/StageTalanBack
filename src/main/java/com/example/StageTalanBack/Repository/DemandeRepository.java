package com.example.StageTalanBack.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.StageTalanBack.Model.Demande;


@Repository
public interface DemandeRepository extends JpaRepository <Demande,Long>{
    
}

