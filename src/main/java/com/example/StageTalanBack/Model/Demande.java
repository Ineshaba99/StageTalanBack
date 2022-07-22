package com.example.StageTalanBack.Model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "demande")
public class Demande {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

    
    @ManyToMany(mappedBy = "EmployeeDemande")
		Set<Employee> likes;

	@ManyToOne
		@JoinColumn(name="typeDemande_id", nullable=false)
		private TypeDemande type_Demande;
	
	@OneToMany(mappedBy = "id", fetch = FetchType.LAZY,
		cascade = CascadeType.ALL)
        private Set<FileDB> files;

	
}
