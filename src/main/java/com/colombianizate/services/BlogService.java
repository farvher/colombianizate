package com.colombianizate.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colombianizate.domain.Blog;
import com.colombianizate.domain.BlogComment;
import com.colombianizate.domain.Comment;
import com.colombianizate.repository.BlogCommentRepository;
import com.colombianizate.repository.BlogRepository;
import com.colombianizate.repository.CommentRepository;

@Service
public class BlogService {

	@Autowired
	private CommentRepository commentRepository;

	@Autowired
	private BlogRepository blogRepository;
	
	@Autowired
	private BlogCommentRepository blogCommentRepository;
	
	public List<BlogComment> findAllBlogComment(){
		
		return blogCommentRepository.findAll();
	}
	

	public List<Blog> findAllBlogs() {
		return blogRepository.findAll();
	}

	public List<Comment> findAllComments() {
		return commentRepository.findAll();
	}
	
	public Optional<Comment> findCommentById(Long id) {
		return commentRepository.findById(id);
	}

	public void saveBlog(Blog b) {
		blogRepository.save(b);
	}
	public Optional<Blog> findBlogById(Long id) {
		return blogRepository.findById(id);
	}

}
