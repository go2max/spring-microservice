package com.rohitghatol.microservices.task.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents comments on Task.
 *
 * @author anilallewar
 */
public class CommentResource {

	public static final String JP_TASKID = "taskId";
	public static final String JP_COMMENT = "comment";
	public static final String JP_POSTED = "posted";

	/** The task id. */
	private String taskId;

	/** The last name. */
	private String comment;

	/** The completed. */
	private Date posted;

	/**
	 * Instantiates a new comment resource
	 */
	public CommentResource() {
		super();

	}

	/**
	 * Instantiates a new comment resource
	 *
	 * @param taskId
	 * @param comment
	 * @param posted
	 */
	public CommentResource(String taskId, String comment, Date posted) {
		super();
		this.taskId = taskId;
		this.comment = comment;
		this.posted = posted;
	}

	/**
	 * @return the taskId
	 */
	@JsonProperty(JP_TASKID)
	public String getTaskId() {
		return taskId;
	}

	/**
	 * @param taskId
	 *            the taskId to set
	 */
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	/**
	 * @return the comment
	 */
	@JsonProperty(JP_COMMENT)
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment
	 *            the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * @return the posted
	 */
	@JsonProperty(JP_POSTED)
	public Date getPosted() {
		return posted;
	}

	/**
	 * @param posted
	 *            the posted to set
	 */
	public void setPosted(Date posted) {
		this.posted = posted;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((posted == null) ? 0 : posted.hashCode());
		result = prime * result + ((taskId == null) ? 0 : taskId.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CommentResource other = (CommentResource) obj;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (posted == null) {
			if (other.posted != null)
				return false;
		} else if (!posted.equals(other.posted))
			return false;
		if (taskId == null) {
			if (other.taskId != null)
				return false;
		} else if (!taskId.equals(other.taskId))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CommentResource [taskId=" + taskId + ", comment=" + comment + ", posted=" + posted + "]";
	}

}
