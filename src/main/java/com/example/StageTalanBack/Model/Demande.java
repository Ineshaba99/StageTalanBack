package com.example.StageTalanBack.Model;

import java.util.Set;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;




@Entity
@Table(name = "demande")
public class Demande {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	@ManyToMany(mappedBy = "EmployeeDemande")
	Set<Employee> likes;

	
	@ManyToOne 
    @JoinColumn(name="typeDemande_id", nullable=false) private TypeDemande
	  type_Demande;
	 

   @OneToMany(mappedBy = "id", fetch = FetchType.LAZY,
	cascade = CascadeType.ALL)
    private Set<FileInfo> files;

    
}
