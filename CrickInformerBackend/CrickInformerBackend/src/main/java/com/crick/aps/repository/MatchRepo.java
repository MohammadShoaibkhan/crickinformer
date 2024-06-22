package com.crick.aps.repository;

import com.crick.aps.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo  extends JpaRepository<Match, Integer> {

    // match fetch karna chahta hun -->
    // provide kar ke --> teamHeading

    Optional<Match>findByTeamHeading(String teamHeading);


}
