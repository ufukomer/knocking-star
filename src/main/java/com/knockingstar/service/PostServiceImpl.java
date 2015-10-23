package com.knockingstar.service;

import com.knockingstar.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Ömer Ufuk Efendioglu
 */
@Component("cityService")
@Transactional
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Post getPost(long id) {
        return postRepository.findById(id);
    }

    @Override
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }
}
