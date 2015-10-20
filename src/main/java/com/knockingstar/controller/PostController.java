package com.knockingstar.controller;

import com.knockingstar.model.Post;
import com.knockingstar.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Ömer Ufuk Efendioğlu
 */
@Controller
public class PostController {

    @Autowired
    private PostService postService;

    @RequestMapping("/post")
    public
    @ResponseBody
    Post post(@RequestParam(value = "id", required = true)
              String id) {
        return postService.getPost(Integer.parseInt(id));
    }

    @RequestMapping("/allposts")
    public
    @ResponseBody
    List<Post> posts() {
        return postService.getAllPosts();
    }
}
