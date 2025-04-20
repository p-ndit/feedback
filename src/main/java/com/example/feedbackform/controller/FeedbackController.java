package com.example.feedbackform.controller;

import com.example.feedbackform.model.Feedback;
import com.example.feedbackform.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class FeedbackController {

    @Autowired
    private FeedbackService service;

    @GetMapping("feedback")
    public List<Feedback> getFeedback() {
        return service.getAllFeedback();
    }

    @PostMapping("addFeedback")
    public Feedback addFeedback (@RequestBody Feedback feedback) {
        return service.addFeedback(feedback);
    }

    @PutMapping("editfeedback")
    public Feedback editFeedback(@RequestBody Feedback feedback) {
        return service.editResponse(feedback);
    }

}