package org.system.fonon.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.system.fonon.entities.Picture;

public interface PictureRepository extends MongoRepository<Picture, String> {
}
