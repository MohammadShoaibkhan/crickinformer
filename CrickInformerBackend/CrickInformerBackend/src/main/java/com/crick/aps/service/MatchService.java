package com.crick.aps.service;

import com.crick.aps.entities.Match;

import java.util.List;

public interface MatchService  {


    // Get All Matches
    List<Match> getAllMatches();

    // Get live Matches
    List<Match> getLiveMatches();

    // Get CWC2024 Point table

    List<List<String>> getPointTable();
}
