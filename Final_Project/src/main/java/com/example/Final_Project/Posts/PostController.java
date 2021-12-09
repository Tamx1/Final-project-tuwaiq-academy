package com.example.Final_Project.Posts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path= "posts")
@CrossOrigin("*")
public class PostController {

    private final PostService postService;


    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }


    @GetMapping
    public List<Post> getPosts(@RequestParam(required = false) String filter){
        return postService.getPosts();
    }

    @PostMapping
    public void addPost(@RequestBody Post post){
        postService.addPost(post);
    }

    @GetMapping("/{id}")
    public Post getPost(@PathVariable String id){
        return postService.getPost(id);
    }

    @DeleteMapping("/{id}")
    public void delPost(@PathVariable String id){
        postService.deletePost(id);
    }


    @PutMapping("/{id}")
    public void updatePost(@PathVariable String id, @RequestBody Post data){
        postService.updatePost(id, data);
    }


}
