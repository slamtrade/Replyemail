package com.mongodb.mongodbdemo.resource;

import com.mongodb.mongodbdemo.Emailreply.EmailReply;
import com.mongodb.mongodbdemo.FormBody;
import com.mongodb.mongodbdemo.document.Feedbackform;
import com.mongodb.mongodbdemo.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "http://testangularfeedback.s3-website.ap-south-1.amazonaws.com")
@RestController
@RequestMapping("/rest/Feedbackform")

public class EmailsResource {
    @Autowired
    public  EmailReply emailSender;


    private EmailRepository emailRepository;

    public EmailsResource(EmailRepository emailRepository) {
        this.emailRepository = emailRepository;
    }

    @PostMapping("/all")
    public List<Feedbackform> postAll() {
        return emailRepository.findAll();
    }

    @PostMapping("/register")
    public List<com.mongodb.mongodbdemo.document.Feedbackform> register(@RequestBody
    FormBody body){


        emailRepository.save(new Feedbackform(body.email, body.subject, body.description));
        emailSender.sendSimpleEmail(body.email);
        return emailRepository.findAll();
    }


}
