package com.cricket.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Player {
	//id, name, type, avg, batting, bowling,team
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String type;
	private double average;
	@OneToOne   
	private Batsman batsmanStats;
	@OneToOne
	private Bowler bowlerStats;
	private int teamId;

	public Player() {
		super();
		
	}

	public Player(int id, String name, String type, double average, Batsman batsmanStats, Bowler bowlerStats,
				  int teamId) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.average = average;
		this.batsmanStats = batsmanStats;
		this.bowlerStats = bowlerStats;
		this.teamId = teamId;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public Batsman getBattingStats() {
		return batsmanStats;
	}

	public void setBattingStats(Batsman batsmanStats) {
		this.batsmanStats = batsmanStats;
	}

	public Bowler getBowlingStats() {
		return bowlerStats;
	}

	public void setBowlingStats(Bowler bowlerStats) {
		this.bowlerStats = bowlerStats;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", type=" + type + ", average=" + average + ", battingStats="
				+ batsmanStats + ", bowlingStats=" + bowlerStats + ", teamId=" + teamId + "]";
	}
	
	
	
	
}
