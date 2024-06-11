package com.app.LiveInnings.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "crick_matches")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matchId;

    private String teamHeading;

    private String matchNumberVenue;

    private String battingTeam;

    private String battingTeamScore;

    private String bowlTeam;

    private String bowlTeamScore;

    private String liveText;

    private String textComplete;

    private String matchLink;

    @Enumerated
    private MatchStatus status;

    private Date date=new Date();

    public Match(int matchId, String teamHeading, String matchNumberVenue, String battingTeam, String battingTeamScore, String bowlTeam, String bowlTeamScore, String liveText, String textComplete, String matchLink, MatchStatus status, Date date) {
        this.matchId = matchId;
        this.teamHeading = teamHeading;
        this.matchNumberVenue = matchNumberVenue;
        this.battingTeam = battingTeam;
        this.battingTeamScore = battingTeamScore;
        this.bowlTeam = bowlTeam;
        this.bowlTeamScore = bowlTeamScore;
        this.liveText = liveText;
        this.textComplete = textComplete;
        this.matchLink = matchLink;
        this.status = status;
        this.date = date;
    }

    public Match(){

    }

    //set the match Status according to textComplete

    public void setMatchStatus(){
        if(textComplete.isBlank()){
            this.status=MatchStatus.LIVE;
        }
        else
        {
            this.status=MatchStatus.COMPLETED;
        }
    }

    public int getMatchId() {
        return matchId;
    }

    public String getTeamHeading() {
        return teamHeading;
    }

    public String getMatchNumberVenue() {
        return matchNumberVenue;
    }

    public String getBattingTeam() {
        return battingTeam;
    }

    public String getBattingTeamScore() {
        return battingTeamScore;
    }

    public String getBowlTeam() {
        return bowlTeam;
    }

    public String getBowlTeamScore() {
        return bowlTeamScore;
    }

    public String getLiveText() {
        return liveText;
    }

    public String getTextComplete() {
        return textComplete;
    }

    public String getMatchLink() {
        return matchLink;
    }

    public MatchStatus getStatus() {
        return status;
    }

    public Date getDate() {
        return date;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public void setTeamHeading(String teamHeading) {
        this.teamHeading = teamHeading;
    }

    public void setMatchNumberVenue(String matchNumberVenue) {
        this.matchNumberVenue = matchNumberVenue;
    }

    public void setBattingTeam(String battingTeam) {
        this.battingTeam = battingTeam;
    }

    public void setBattingTeamScore(String battingTeamScore) {
        this.battingTeamScore = battingTeamScore;
    }

    public void setBowlTeam(String bowlTeam) {
        this.bowlTeam = bowlTeam;
    }

    public void setBowlTeamScore(String bowlTeamScore) {
        this.bowlTeamScore = bowlTeamScore;
    }

    public void setLiveText(String liveText) {
        this.liveText = liveText;
    }

    public void setTextComplete(String textComplete) {
        this.textComplete = textComplete;
    }

    public void setMatchLink(String matchLink) {
        this.matchLink = matchLink;
    }

    public void setStatus(MatchStatus status) {
        this.status = status;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
