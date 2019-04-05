package com.colombianizate.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colombianizate.domain.Blog;
import com.colombianizate.domain.Comment;
import com.colombianizate.repository.BlogRepository;
import com.colombianizate.repository.CommentRepository;

@Service
public class BlogService {
	
	@Autowired
	private CommentRepository commentRepository;
	
	@Autowired
	private BlogRepository blogRepository;

	public List<Blog> findAllBlogs(){
		return blogRepository.findAll();
	}
	
	public List<Comment> findAllComments(){
		return commentRepository.findAll();
	}
	
}
