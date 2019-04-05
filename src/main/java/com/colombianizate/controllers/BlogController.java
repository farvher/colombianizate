package com.colombianizate.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.colombianizate.domain.Blog;
import com.colombianizate.services.BlogService;


@RestController
public class BlogController {

	@Autowired
	private BlogService blogService;
	
	@GetMapping("/blogs")
	public List<Blog> getBlogs(){
		
		return blogService.findAllBlogs();
		
	}
	
}
