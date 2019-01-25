package com.mongodb.mongodbdemo.Emailreply;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailReply {

    @Autowired
    public JavaMailSender emailSender;


    public String sendSimpleEmail(String toemail) {

        // Create a Simple MailMessage.
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(MyConstants.MY_EMAIL);
        message.setTo(toemail);
        message.setSubject("Slamtrade");
        message.setText("Thank's for your feedback");

        // Send Message!
        this.emailSender.send(message);

        return "Email Sent!";
    }

}
