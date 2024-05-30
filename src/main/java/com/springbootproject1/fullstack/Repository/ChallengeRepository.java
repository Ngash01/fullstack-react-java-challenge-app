package com.springbootproject1.fullstack.Repository;

import com.springbootproject1.fullstack.model.Challenge;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChallengeRepository extends JpaRepository<Challenge, Long>{
    public List<Challenge> findByMonthIgnoreCase(String month);
}

