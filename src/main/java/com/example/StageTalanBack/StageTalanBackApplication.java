package com.example.StageTalanBack;

import org.springframework.boot.SpringApplication;
import javax.annotation.Resource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import  com.example.StageTalanBack.Service.FilesStorageService;

@SpringBootApplication
public class StageTalanBackApplication implements CommandLineRunner {
	  @Resource
	  FilesStorageService storageService;
	public static void main(String[] args) {
		SpringApplication.run(StageTalanBackApplication.class, args);
	}
	  @Override
	  public void run(String... arg) throws Exception {
	    storageService.deleteAll();
	    storageService.init();
	  }

}
