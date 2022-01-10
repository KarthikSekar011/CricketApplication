package com.cricket.model;

public class PreGameDetails {
    String battingTeamName;
    String chasingTeamName;
    int totalOvers = 0;
    int playerPerTeam = 0;
    String striker;
    String nonStriker;
    String bowler;

    public PreGameDetails(PreGameDetails preGameDetails) {
        this.battingTeamName = preGameDetails.battingTeamName;
        this.chasingTeamName = preGameDetails.chasingTeamName;
        this.totalOvers = preGameDetails.totalOvers;
        this.playerPerTeam = preGameDetails.playerPerTeam;
        this.striker = preGameDetails.striker;
        this.nonStriker = preGameDetails.nonStriker;
        this.bowler = preGameDetails.bowler;
    }

    public String getBattingTeamName() {
        return battingTeamName;
    }

    public void setBattingTeamName(String battingTeamName) {
        this.battingTeamName = battingTeamName;
    }

    public String getChasingTeamName() {
        return chasingTeamName;
    }

    public void setChasingTeamName(String chasingTeamName) {
        this.chasingTeamName = chasingTeamName;
    }

    public int getTotalOvers() {
        return totalOvers;
    }

    public void setTotalOvers(int totalOvers) {
        this.totalOvers = totalOvers;
    }

    public int getPlayerPerTeam() {
        return playerPerTeam;
    }

    public void setPlayerPerTeam(int playerPerTeam) {
        this.playerPerTeam = playerPerTeam;
    }

    public String getStriker() {
        return striker;
    }

    public void setStriker(String striker) {
        this.striker = striker;
    }

    public String getNonStriker() {
        return nonStriker;
    }

    public void setNonStriker(String nonStriker) {
        this.nonStriker = nonStriker;
    }

    public String getBowler() {
        return bowler;
    }

    public void setBowler(String bowler) {
        this.bowler = bowler;
    }
}
