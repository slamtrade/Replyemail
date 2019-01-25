package com.mongodb.mongodbdemo.document;

import org.springframework.data.mongodb.core.mapping.Document;


@Document

public class Feedbackform {


    private String email;
    private String subject;
    private String description;

    public Feedbackform(String email, String subject, String description) {



        this.email = email;
        this.subject = subject;
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


