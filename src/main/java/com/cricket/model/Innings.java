package com.cricket.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "innings")
public class Innings {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "INNINGS_ID", nullable = false)
    private Long id;

    @Column(name = "inningsStatus", nullable = false)
    private Status inningsStatus;

    @Enumerated
    @Column(name = "current_innings", nullable = false)
    private CurrentInnings currentInnings;

    @Column(name = "batsmanInnings")
    @OneToMany(mappedBy = "batsmanInnings", cascade = CascadeType.ALL)
    private List<BatsmanInnings> batsmanInnings;

    @Column(name = "bowlerInnings")
    @OneToMany(mappedBy = "bowlerInnings", cascade = CascadeType.ALL)
    private List<BowlerInnings> bowlerInnings;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "striker")
    private BatsmanInnings striker;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "nonStriker")
    private BatsmanInnings nonStriker;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "currentBowler")
    private BowlerInnings currentBowler;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "game_id", nullable = false)
    private Game game;

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public CurrentInnings getCurrentInnings() {
        return currentInnings;
    }

    public void setCurrentInnings(CurrentInnings currentInnings) {
        this.currentInnings = currentInnings;
    }

    public Innings(String strikerName, String nonStrikerName, String currentBowlerName) {
        this.striker.setName(strikerName);
        this.nonStriker.setName(nonStrikerName);
        this.currentBowler.setName(currentBowlerName);
    }

    public Innings() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Status getInningsStatus() {
        return inningsStatus;
    }

    public void setInningsStatus(Status inningsStatus) {
        this.inningsStatus = inningsStatus;
    }

    public List<BatsmanInnings> getBatsmanInnings() {
        return batsmanInnings;
    }

    public void setBatsmanInnings(List<BatsmanInnings> batsmanInnings) {
        this.batsmanInnings = batsmanInnings;
    }

    public List<BowlerInnings> getBowlerInnings() {
        return bowlerInnings;
    }

    public void setBowlerInnings(List<BowlerInnings> bowlerInnings) {
        this.bowlerInnings = bowlerInnings;
    }

    public BatsmanInnings getStriker() {
        return striker;
    }

    public void setStriker(BatsmanInnings striker) {
        this.striker = striker;
    }

    public BatsmanInnings getNonStriker() {
        return nonStriker;
    }

    public void setNonStriker(BatsmanInnings nonStriker) {
        this.nonStriker = nonStriker;
    }

    public BowlerInnings getCurrentBowler() {
        return currentBowler;
    }

    public void setCurrentBowler(BowlerInnings currentBowler) {
        this.currentBowler = currentBowler;
    }

}
