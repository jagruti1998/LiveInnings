package com.app.LiveInnings.service;

import com.app.LiveInnings.entity.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {

    //get all matches

    List<Match>getAllMatches();

    //get live matches
    List<Match> getLiveMatches();

    //get cricket world cup2024 point table
    List<List<String>> getPointTable();

}
