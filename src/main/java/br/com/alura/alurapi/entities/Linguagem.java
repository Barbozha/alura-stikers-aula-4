package br.com.alura.alurapi.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "principaisLinguagens")
public class Linguagem {

	//private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String title;
	private String image;
	private Integer ranking;

	public Linguagem(String title, String image, Integer ranking) {
		this.title = title;
		this.image = image;
		this.ranking = ranking;
	}
	
	public Linguagem(){
		
	}
	
	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getImage() {
		return image;
	}

	public Integer getRanking() {
		return ranking;
	}

}
