package com.cleristonpereira.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cleristonpereira.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
