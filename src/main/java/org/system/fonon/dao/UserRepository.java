package org.system.fonon.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.system.fonon.entities.User;

public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);

    User findByUsername(String username);
}
