package com.example.feedbackform.service;

import com.example.feedbackform.model.Feedback;
import com.example.feedbackform.repo.FeedbackRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepo repo;

    public List<Feedback> getAllFeedback() {
        return repo.findAll();
    }

    public Feedback addFeedback(Feedback feedback) {
        return repo.save(feedback);
    }

    public Feedback editResponse(Feedback feedback) {
        return repo.save(feedback);
    }

    public void deleteFeedbackById(int id) {
        repo.deleteById(id);
    }
}
