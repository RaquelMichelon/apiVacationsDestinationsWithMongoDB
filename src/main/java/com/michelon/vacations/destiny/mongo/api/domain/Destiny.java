package com.michelon.vacations.destiny.mongo.api.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "destiny") //annotation to say that this entity represents a document on the mongo database
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Destiny {
	
	@Id //because each document will receive an id on mongodb
	private String id;
	
	private String name;
	private String country;
	private String image;
	private int rank;
	

}
