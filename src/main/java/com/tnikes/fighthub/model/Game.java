package com.tnikes.fighthub.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "games")
public class Game {
	
	//-------------------FIELDS------------------------------------
	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "game_name")
	private String gameName;
	
	@Column(name = "type")
	private String gameType;
	
	//-------------------CONSTRUCTORS------------------------------
	public Game() {
		
	}
	public Game(String gameName, String gameType) {
		this.gameName = gameName;
		this.gameType = gameType;
	}

	//-------------------GETTERS/SETTERS---------------------------
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGameType() {
		return gameType;
	}

	public void setGameType(String gameType) {
		this.gameType = gameType;
	}
	
	
	
}