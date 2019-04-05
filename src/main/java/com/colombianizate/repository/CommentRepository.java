package com.colombianizate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.colombianizate.domain.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
