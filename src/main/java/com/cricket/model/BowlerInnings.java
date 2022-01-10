package com.cricket.model;

import javax.persistence.*;

@Entity
@Table(name = "bowlerInnings")
public class BowlerInnings {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "bowlerId", nullable = false)
    private long bowlerId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "oversBowled")
    private int oversBowled = 0;

    @Column(name = "runsConceded")
    private int runsConceded = 0;

    @Column(name = "wickets")
    private int wickets = 0;

    @Column(name = "maidens")
    private int maidens = 0;

    @Column(name = "economy")
    private double economy = 0.0;

    @ManyToOne
    @JoinColumn(name = "INNINGS_ID", referencedColumnName = "INNINGS_ID", nullable = false)
    private Innings bowlerInnings;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Innings getBowlerInnings() {
        return bowlerInnings;
    }

    public void setBowlerInnings(Innings bowlerInnings) {
        this.bowlerInnings = bowlerInnings;
    }

    public long getBowlerId() {
        return bowlerId;
    }

    public void setBowlerId(long bowlerId) {
        this.bowlerId = bowlerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOversBowled() {
        return oversBowled;
    }

    public void setOversBowled(int oversBowled) {
        this.oversBowled = oversBowled;
    }

    public int getRunsConceded() {
        return runsConceded;
    }

    public void setRunsConceded(int runsConceded) {
        this.runsConceded = runsConceded;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    public int getMaidens() {
        return maidens;
    }

    public void setMaidens(int maidens) {
        this.maidens = maidens;
    }

    public double getEconomy() {
        return economy;
    }

    public void setEconomy(double economy) {
        this.economy = economy;
    }
}
