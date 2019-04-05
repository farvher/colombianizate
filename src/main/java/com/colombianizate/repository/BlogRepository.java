package com.colombianizate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.colombianizate.domain.Blog;
@Repository
public interface BlogRepository  extends JpaRepository<Blog, Long>{

}
