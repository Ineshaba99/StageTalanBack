package com.example.StageTalanBack.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "files")
public class FileInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "name")
	  private String name;
	@Column(name = "url")
	  private String url;
	
	
	  @ManyToOne
	  @JoinColumn(name="demande_id", nullable=false)
	  private Demande demande;
	  
	  public FileInfo(String name, String url) {
	    this.name = name;
	    this.url = url;
	  }
	  public String getName() {
	    return this.name;
	  }
	  public void setName(String name) {
	    this.name = name;
	  }
	  public String getUrl() {
	    return this.url;
	  }
	  public void setUrl(String url) {
	    this.url = url;
	  }
	}