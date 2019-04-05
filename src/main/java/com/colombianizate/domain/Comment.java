package com.colombianizate.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Comment {

	@Id
	@GeneratedValue
	private Long id;
	private String comment;
	private Long idUser;
	private LocalDate dateComment;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public LocalDate getDateComment() {
		return dateComment;
	}
	public void setDateComment(LocalDate dateComment) {
		this.dateComment = dateComment;
	}

}
