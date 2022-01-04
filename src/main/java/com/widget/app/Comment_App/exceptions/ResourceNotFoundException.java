package com.widget.app.Comment_App.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Long commentId) {
		super("Could not find comment" + commentId);
	}

}
