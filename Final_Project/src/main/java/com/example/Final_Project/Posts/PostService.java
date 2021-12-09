package com.example.Final_Project.Posts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;


    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getPosts(){
        return postRepository.findAll();
    }

    public Post getPost(String id){
        int post_id = Integer.valueOf(id);
        return postRepository.findById(post_id).orElse(null);
    }

    public Post addPost(Post post){
        return postRepository.save(post);
    }

    public void deletePost(String id){
        int post_id = Integer.valueOf(id);
        postRepository.deleteById(post_id);

    }

    public void updatePost(String id, Post data){
        int post_id = Integer.valueOf(id);
        Post post = postRepository.findById(post_id).orElse(null);

        if (post != null){
            post.setTitle(data.getTitle());
            post.setContent(data.getContent());
            post.setCity(data.getCity());
            post.setPost_type(data.getPost_type());
            post.setDate(data.getDate());
            postRepository.save(post);
            }
        }


    }


