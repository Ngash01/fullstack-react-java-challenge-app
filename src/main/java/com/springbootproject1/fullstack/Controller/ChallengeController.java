package com.springbootproject1.fullstack.Controller;

import com.springbootproject1.fullstack.model.Challenge;
import com.springbootproject1.fullstack.service.ChallengeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:3000", "http://challenge-app-react-frontend-2.s3-website.eu-north-1.amazonaws.com/"})
public class ChallengeController {

    @Autowired
    ChallengeService challengeService;

    //    save a challenge
    @PostMapping("/addChallenges")
    public Challenge AddChallenge(@RequestBody Challenge challenge){
        return challengeService.addChallenge(challenge);
    }

//fetch All
    @GetMapping("/challenges")
    public List<Challenge> getAllChallenges(){
        return challengeService.getAllChallenges();

    }

//  fetch one
    @GetMapping("/challenges/{month}")
    public List<Challenge> getAChallenge(@PathVariable("month") String month){
        return challengeService.getAChallenge(month);
    }

//    update a challenge
    @PutMapping("/challenges/update/{id}")
    public String updateAChallenge(@PathVariable("id") long id, @RequestBody Challenge challenge){
        return challengeService.updateAChallenge(id, challenge);
    }

//    Delete a challenge
    @DeleteMapping("/challenges/delete/{id}")
    public String DeleteAChallenge(@PathVariable("id") long id){
        return challengeService.DeleteAChallenge(id);
    }

}



