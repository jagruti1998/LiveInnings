package com.app.LiveInnings.repository;

import com.app.LiveInnings.entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match,Integer> {

    //match fetch with teamName
    Optional<Match>findByTeamHeading(String teamHeading);

}
