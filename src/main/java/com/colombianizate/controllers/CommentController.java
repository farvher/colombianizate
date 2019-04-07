package com.colombianizate.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.colombianizate.domain.BlogComment;
import com.colombianizate.domain.Comment;
import com.colombianizate.repository.CommentRepository;
import com.colombianizate.services.BlogService;

@RestController
public class CommentController {
	
	
	@Autowired
	private BlogService blogService;
	
	@GetMapping("/comments")
	public List<Comment> findAll(){
		
		return blogService.findAllComments();
	}
	@GetMapping("/comments/{id}")
	public Comment findById(@PathVariable Long id) {
		return blogService.findCommentById(id).orElse(new Comment());
	}
	
	@GetMapping("/blogComments")
	public List<BlogComment> findAllBc(){
		
		return blogService.findAllBlogComment();
	}
	@GetMapping("/commentsByBlogId/{id}")
	public List<Comment> findCommentsByBlog(@PathVariable Long id){
		return blogService.findCommentsByBlog(id);
	}


}
