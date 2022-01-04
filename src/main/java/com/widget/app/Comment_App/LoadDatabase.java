package com.widget.app.Comment_App;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.widget.app.Comment_App.models.Comment;
import com.widget.app.Comment_App.service.CommentService;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(CommentService commentService) {

    return args -> {
      log.info("Preloading " + commentService.createComment(new Comment("The customer has issues with the bill",6012006L)));
      log.info("Preloading " + commentService.createComment(new Comment("The customer has issues with outbound calls",6012006L)));
      log.info("Preloading " + commentService.createComment(new Comment("Issues with the bill",6012006L)));
      log.info("Preloading " + commentService.createComment(new Comment("Issues with international calls",6012006L)));
    };
  }
}