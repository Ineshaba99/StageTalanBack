package com.example.StageTalanBack.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "TypeDemande")
public class TypeDemande {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id; 
    
    @Column(name = "nomTypeDemande")
	private String nomTypeDemande; 
    
}
