package com.widget.app.Comment_App;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.widget.app.Comment_App.models.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
