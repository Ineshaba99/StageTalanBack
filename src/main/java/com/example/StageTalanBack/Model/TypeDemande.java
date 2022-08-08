package com.example.StageTalanBack.Model;

import java.util.Set;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "TypeDemande")
public class TypeDemande {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id; 
    
    @Column(name = "nomTypeDemande")
	private String nomTypeDemande; 
	

	public String getNomTypeDemande() {
		return nomTypeDemande;
	}
	

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public void setNomTypeDemande(String nomTypeDemande) {
		this.nomTypeDemande = nomTypeDemande;
	}

	public TypeDemande() {}
	 
	  
   
    
}

