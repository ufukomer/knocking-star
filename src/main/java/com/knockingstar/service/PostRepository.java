package com.knockingstar.service;

import com.knockingstar.model.Post;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * @author Ömer Ufuk Efendio?lu
 */
public interface PostRepository extends Repository<Post, Long> {

    List<Post> findAll();

    Post findById(long id);
}
