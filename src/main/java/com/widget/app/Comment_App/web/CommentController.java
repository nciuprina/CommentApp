package com.widget.app.Comment_App.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.widget.app.Comment_App.models.Comment;
import com.widget.app.Comment_App.service.CommentService;


@RestController
public class CommentController {
	@Autowired
    CommentService commentService;

	@GetMapping(value = "/comments")
	public ResponseEntity<List<Comment>> getAllComments(Long agentId) {
		List<Comment> comments = commentService.getAllComments(agentId);
		return new ResponseEntity<>(comments, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteComment(@PathVariable(value="commentId") Long commentId) {
		 commentService.deleteComment(commentId);
	        return new ResponseEntity<>(HttpStatus.OK);
	    }

	@PostMapping("/add")
	public ResponseEntity<?> addComment( @RequestBody Comment comment) {
		Comment newComment = commentService.createComment(comment);
        return new ResponseEntity<>(newComment, HttpStatus.CREATED);
    }
}
