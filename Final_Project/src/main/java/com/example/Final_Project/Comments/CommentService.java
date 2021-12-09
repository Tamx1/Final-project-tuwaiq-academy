package com.example.Final_Project.Comments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;


@Service
public class CommentService {

    private final CommentRepository commentRepository;


    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public List<Comment> getComments(){
        return commentRepository.findAll();
    }

    public Comment getComment(String id){
        int comment_id = Integer.valueOf(id);
        return commentRepository.findById(comment_id).orElse(null);
    }

    public Comment addComment(Comment comment){

        return commentRepository.save(comment);
    }

    public void deleteComment(String id){
        int comment_id = Integer.valueOf(id);
        commentRepository.deleteById(comment_id);

    }

    public void updateComment(String id, Comment data){
        int comment_id = Integer.valueOf(id);
        Comment comment = commentRepository.findById(comment_id).orElse(null);

        if (comment != null){
            comment.setContent(data.getContent());
            comment.setDate(data.getDate());
            commentRepository.save(comment);
            }
        }


    }


