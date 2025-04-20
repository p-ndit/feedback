package com.example.feedbackform.controller;

import com.example.feedbackform.model.Feedback;
import com.example.feedbackform.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class FeedbackController {

    @Autowired
    private FeedbackService service;

    @GetMapping("feedback")
    public List<Feedback> getFeedback() {
        return service.getAllFeedback();
    }

    @PostMapping("addfeedback")
    public String greet() {
        return "Hello World";
    }

}