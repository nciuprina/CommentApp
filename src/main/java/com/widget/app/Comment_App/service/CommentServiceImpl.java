package com.widget.app.Comment_App.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import com.widget.app.Comment_App.CommentRepository;
import com.widget.app.Comment_App.exceptions.ResourceNotFoundException;
import com.widget.app.Comment_App.models.Comment;

public class CommentServiceImpl implements CommentService {

	@Autowired
	CommentRepository commentRepository;

	@Override
	public List<Comment> getAllComments(Long agentId) {
		return commentRepository.findAll();
	}

	@Override
	public void deleteComment(Long commentId) throws ResourceNotFoundException {
		if (commentRepository.getById(commentId).getId().equals(commentId)){
			commentRepository.deleteById(commentId);
        }
        else throw new ResourceNotFoundException(commentId);
    }
	@Override
    public Comment createComment(@RequestBody Comment newComment) {
        return commentRepository.save(newComment);
    }

}
