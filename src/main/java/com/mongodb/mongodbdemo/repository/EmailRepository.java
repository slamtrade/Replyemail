package com.mongodb.mongodbdemo.repository;

import com.mongodb.mongodbdemo.document.Feedbackform;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmailRepository extends MongoRepository<Feedbackform, Integer> {
}
