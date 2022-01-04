package com.widget.app.Comment_App.models;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "comment")
public class Comment {

	private @Id @GeneratedValue Long commentId;

	private String description;
	private Long  agentId;
	
	public Comment() {
	}

	public Comment(String description, Long  agentId) {

		this.description = description;
		this.agentId=agentId;
	}
	public Long getAgentId() {
		return agentId;

	}

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}

	public Long getId() {
		return agentId;
	}

	public void setId(Long id) {
		this.commentId = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	  public boolean equals(Object o) {

	    if (this == o)
	      return true;
	    if (!(o instanceof Comment))
	      return false;
	    Comment comment = (Comment) o;
	    return Objects.equals(this.commentId, comment.commentId) && Objects.equals(this.description, comment.description)
	        && Objects.equals(this.agentId, comment.agentId);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(this.commentId, this.description, this.agentId);
	  }

	@Override
	public String toString() {
		return "Comment [commentId=" + commentId + ", description=" + description + ", agentId=" + agentId
				+ "]";
	}

}
