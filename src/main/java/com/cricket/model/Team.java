package com.cricket.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Team {
	//id,name, captain
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String captain;
	
	
	
	public Team() {
		super();
	}

	public Team(int id, String name, String captain) {
		super();
		this.id = id;
		this.name = name;
		this.captain = captain;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCaptain() {
		return captain;
	}

	public void setCaptain(String captain) {
		this.captain = captain;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", captain=" + captain + "]";
	}
		
}
