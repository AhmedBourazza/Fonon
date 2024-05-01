package org.system.fonon.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.system.fonon.entities.Post;
import org.system.fonon.entities.User;

public interface PostRepository extends MongoRepository<Post, String> {
}
