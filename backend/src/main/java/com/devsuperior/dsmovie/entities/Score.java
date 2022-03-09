package com.devsuperior.dsmovie.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tb_score")
public class Score implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	// No JPA só pode existir chave com único Id
	//Para resolver, necessário criar uma classe Auxiliar com os dois Id: Movie e User
	//private Movie movie;
	//private User user;
	
	// Chave composta PK
	@EmbeddedId
	private ScorePK id = new ScorePK();	
	private Double score;
	
	public Score() {}

	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}

	public void setUser(User user) {
		id.setUser(user);
	}

	public ScorePK getId() {
		return id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Score [id=" + id + ", score=" + score + "]";
	};
}
