package com.ruzalina.blog.repo;

import com.ruzalina.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post,Long> {


}
