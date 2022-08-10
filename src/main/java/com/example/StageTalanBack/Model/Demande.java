package com.example.StageTalanBack.Model;

import java.util.List;
import java.util.Set;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "demande")
public class Demande {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	//** @ManyToMany(mappedBy = "EmployeeDemande")
	//List<Employee> employeeList; 
    
    @ManyToMany
	@JoinTable(
	name = "demande_employee", 
	joinColumns = @JoinColumn(name = "demande_id" , referencedColumnName= "id",  table="demande"), 
	inverseJoinColumns = @JoinColumn(name = "employee_id", referencedColumnName= "id" , table="employees")) 
    @JsonIgnore
    //@JsonIgnoreProperties("demande")
    List<Employee> employeeList; 
	
    
	@ManyToOne 
    @JoinColumn(name="typeDemande_id") 
	private TypeDemande type_Demande;
	 

   @OneToMany(mappedBy = "id", fetch = FetchType.LAZY,
	cascade = CascadeType.ALL)
    private List<FileInfo> files;

	
	public Demande(long id, List<Employee> employeeList, TypeDemande type_Demande, List<FileInfo> files) {
		super();
		this.id = id;
		this.employeeList = employeeList;
		this.type_Demande = type_Demande;
		this.files = files;
	}
	
	
	public Demande() {
		super();
		
	}
	
	
	public Demande(List<Employee> employeeList, TypeDemande type_Demande, List<FileInfo> files) {
		super();
		this.employeeList = employeeList;
		this.type_Demande = type_Demande;
		this.files = files;
	}
	
	
	public long getId() {
		return id;
	}
	
	
	public void setId(long id) {
		this.id = id;
	}
	
	
	public List<Employee> getEmployeeList() {
		return employeeList;
	}
	
	
	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	
	
	public TypeDemande getType_Demande() {
		return type_Demande;
	}
	
	
	public void setType_Demande(TypeDemande type_Demande) {
		this.type_Demande = type_Demande;
	}
	
	
	public List<FileInfo> getFiles() {
		return files;
	}
	
	
	public void setFiles(List<FileInfo> files) {
		this.files = files;
	}
	
	
	@Override
	public String toString() {
		return "Demande [id=" + id + ", employeeList=" + employeeList + ", type_Demande=" + type_Demande + ", files="
				+ files + "]";
	}
	
	    
	}
