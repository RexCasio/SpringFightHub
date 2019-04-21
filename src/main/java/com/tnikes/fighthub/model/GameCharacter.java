package com.tnikes.fighthub.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "characters")
public class GameCharacter {
	
	//-------------------FIELDS-------------------------------
	@Id
	@Column(name = "id")
	private String id;
	
	@Column(name = "character_name")
	private String characterName;
	
	@Column(name = "game_id")
	private Integer gameId;
	
	@Column(name = "summary")
	private String summary;
	
	@Column(name = "defense_modifier")
	private Float defenseModifier;
	
	@Column(name = "guts")
	private Integer guts;
	
	@Column(name = "weight")
	private String weight;
	
	@Column(name = "stun_resistance")
	private Integer stunResistance;
	
	@Column(name = "RISC_intertia")
	private Integer riscInertia;
	
	@Column(name = "RISC_gain")
	private Integer riscGain;
	
	@Column(name = "jump_startup")
	private String jumpStartup;
	
	@Column(name = "backdash_startup")
	private String backdashStartup;
	
	@Column(name = "backdash_invulnerability")
	private String backdashInvuln;
	
	@Column(name = "img_url")
	private String imgUrl;
	
	//-------------------CONSTRUCTORS------------------------------
	
	public GameCharacter() {
		
	}
	public GameCharacter(String characterName) {
		this.characterName = characterName;
	}
	
	//-------------------GETTERS/SETTERS---------------------------

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	public Integer getGameId() {
		return gameId;
	}

	public void setGameId(Integer gameId) {
		this.gameId = gameId;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
	
	
}