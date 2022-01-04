package com.widget.app.Comment_App.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.widget.app.Comment_App.exceptions.ResourceNotFoundException;
import com.widget.app.Comment_App.models.Comment;

@Service
public interface CommentService {

	List<Comment> getAllComments(Long agentId);
    void deleteComment(Long commentId)throws ResourceNotFoundException;
    Comment createComment(Comment comment);
}
