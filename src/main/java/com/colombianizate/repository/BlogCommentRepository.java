package com.colombianizate.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.colombianizate.domain.BlogComment;

public interface BlogCommentRepository extends JpaRepository<BlogComment, Long>{

	List<BlogComment> findByIdComment(Long idComment);
	
	List<BlogComment> findByIdBlog(Long idBlog);
	
}
