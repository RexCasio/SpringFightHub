package com.tnikes.fighthub.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "normals")
public class Normals {
	
	//-------------------FIELDS-------------------------------
	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "normal_name")
	private String normalName;
	
	@Column(name = "char_id")
	private Integer charId;
	
	@Column(name = "damage")
	private String damage;
	
	@Column(name = "guard")
	private String guard;
	
	@Column(name = "tension")
	private String tension;
	
	@Column(name = "risc")
	private String risc;
	
	@Column(name = "prorate")
	private String prorate;
	
	@Column(name = "attack_lvl")
	private String attackLvl;
	
	@Column(name = "startup")
	private String startup;
	
	@Column(name = "active")
	private String active;
	
	@Column(name = "invlun")
	private String invuln;
	
	@Column(name = "recovery")
	private String recovery;
	
	@Column(name = "frame_advantage")
	private String frameAdvantage;
	
	@Column(name = "cancel")
	private String cancel;
	
	//-------------------GETTERS/SETTERS---------------------------
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNormalName() {
		return normalName;
	}

	public void setNormalName(String normalName) {
		this.normalName = normalName;
	}

	public Integer getCharId() {
		return charId;
	}

	public void setCharId(Integer charId) {
		this.charId = charId;
	}

	public String getDamage() {
		return damage;
	}

	public void setDamage(String damage) {
		this.damage = damage;
	}

	public String getStartup() {
		return startup;
	}

	public void setStartup(String startup) {
		this.startup = startup;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getRecovery() {
		return recovery;
	}

	public void setRecovery(String recovery) {
		this.recovery = recovery;
	}

	@Column(name = "roman")
	private String roman;

	
}