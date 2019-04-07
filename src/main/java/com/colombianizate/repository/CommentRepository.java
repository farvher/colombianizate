package com.colombianizate.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.colombianizate.domain.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

	
	List<Comment> findByIdIn(List<Long> ids);
}
