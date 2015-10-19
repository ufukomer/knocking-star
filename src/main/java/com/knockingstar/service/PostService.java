package com.knockingstar.service;

import com.knockingstar.model.Post;

import java.util.List;

/**
 * @author Ömer Ufuk Efendio?lu
 */
public interface PostService {

    Post getPost(long id);

    List<Post> getAllPosts();
}
