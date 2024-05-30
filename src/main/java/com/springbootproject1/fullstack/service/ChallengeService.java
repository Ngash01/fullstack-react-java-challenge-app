package com.springbootproject1.fullstack.service;

import com.springbootproject1.fullstack.Exceptions.ChallengeNotFoundException;
import com.springbootproject1.fullstack.Repository.ChallengeRepository;
import com.springbootproject1.fullstack.model.Challenge;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class ChallengeService {

    @Autowired
    private ChallengeRepository challengeRepository;

    private List<Challenge> challenges = new ArrayList<>();

//   get challenge
    public List<Challenge> getAllChallenges(){
        return challengeRepository.findAll();
    }

//    add/post/save a challenge
    public Challenge addChallenge(Challenge challenge){
        Random random = new Random();
        Long id = random.longs(1500321, 20000000).findFirst().getAsLong();

        return challengeRepository.save(challenge);
    }

//    get a challenge
    public List<Challenge> getAChallenge(String month){
        return challengeRepository.findByMonthIgnoreCase(month);
    }

//    update a challenge
    public String updateAChallenge(long id, Challenge challenge){
        Challenge existingChallenge = challengeRepository.findById(id).get();

            if(challenge.getMonth()!= null && !challenge.getMonth().isEmpty()){
                existingChallenge.setMonth(challenge.getMonth());
            }
            if(challenge.getDescription()!=null && !challenge.getDescription().isEmpty()){
                existingChallenge.setDescription(challenge.getDescription());
            }

            challengeRepository.save(existingChallenge);

        System.out.println("All challenges " + challenges);
        return "Challenge updated successfully!";
    }


//    Delete a challenge
    public String DeleteAChallenge(long id){
        for(int i=0; i<challenges.size(); i++){
            if(challenges.get(i).getId().equals(id)){
                challenges.remove(i);
                return "challenge deleted successfully";
            }
        }
        return "No challenge with id " + id + " was found";
    }


}






