package com.colombianizate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.colombianizate.domain.BlogComment;

public interface BlogCommentRepository extends JpaRepository<BlogComment, Long>{

}
