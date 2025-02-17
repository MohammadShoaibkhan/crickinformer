package com.crick.aps.controllers;


import com.crick.aps.entities.Match;
import com.crick.aps.service.MatchService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( "/match")
@CrossOrigin("*")
public class MatchController {

    private MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }
    // Get live Matches
    @RequestMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatches(){
        return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);

    }

    // Get All Matches
    @GetMapping
    public ResponseEntity<List<Match>> getAllMatches(){
        return new ResponseEntity<>(this.matchService.getAllMatches(),HttpStatus.OK);
    }

    // Get Point Table;
    @GetMapping("/point-table")
    public ResponseEntity<?> gePointTable(){
        return new ResponseEntity<>(this.matchService.getPointTable(),HttpStatus.OK);
    }
}
