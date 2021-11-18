package com.cleristonpereira.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cleristonpereira.workshopmongo.domain.Post;
import com.cleristonpereira.workshopmongo.repositories.PostRepository;
import com.cleristonpereira.workshopmongo.services.exceptions.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repository;
	
	public Post findById(String id) {
		Optional<Post> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
	}
}