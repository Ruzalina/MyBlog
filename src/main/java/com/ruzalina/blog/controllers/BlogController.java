package com.ruzalina.blog.controllers;

import com.ruzalina.blog.models.Post;
import com.ruzalina.blog.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/blog")
    public String blogMain(Model model) {
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "blog-main";
    }

        @GetMapping("/blog/add")
        public String blogAdd (Model model){
        return "blog-add";
        }
    }