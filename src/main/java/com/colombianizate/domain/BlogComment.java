package com.colombianizate.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class BlogComment {

	@Id
	@GeneratedValue
	private Long id;

	private Long idComment;
	private Long idBlog;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdComment() {
		return idComment;
	}

	public void setIdComment(Long idComment) {
		this.idComment = idComment;
	}

	public Long getIdBlog() {
		return idBlog;
	}

	public void setIdBlog(Long idBlog) {
		this.idBlog = idBlog;
	}

}
