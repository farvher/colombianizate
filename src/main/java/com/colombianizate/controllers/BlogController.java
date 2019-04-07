package com.colombianizate.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.colombianizate.domain.Blog;
import com.colombianizate.services.BlogService;

@RestController
public class BlogController {

	@Autowired
	private BlogService blogService;

	@GetMapping("/blogs")
	public List<Blog> getBlogs() {
		return blogService.findAllBlogs();
	}

	@GetMapping("/blogs/{id}")
	public Blog getBlogs(@PathVariable Long id) {
		return blogService.findBlogById(id).orElse(new Blog());
	}

	@PostMapping("/blogs")
	public String saveBlog(@RequestBody Blog b) {
		blogService.saveBlog(b);
		return "index";
	}

}
